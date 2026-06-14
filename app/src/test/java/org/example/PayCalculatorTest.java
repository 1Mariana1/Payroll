package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PayCalculatorTest {
    PayCalculator payCalculator;

    @BeforeEach
    void setUp() {
        payCalculator = new PayCalculator();
    }

    @Test
    void itCalculatesThePayForZeroHoursWorked(){
        assertEquals(0.0, payCalculator.grossPay(0, 16.78));
    }

    @Test
    void itCalculatesThePayForOneHoursWorked(){
        assertEquals(16.78, payCalculator.grossPay(1, 16.78));
    }

    @Test
    void itCalculatesThePayForTwoHoursWorked(){
        assertEquals(33.56, payCalculator.grossPay(2, 16.78));
    }

}
