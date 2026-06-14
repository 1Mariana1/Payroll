package org.example;

public class PayCalculator {
    public double grossPay(double numberOfHours, double hourlyRate) {
        if (numberOfHours <= 40) {
            return numberOfHours * hourlyRate;
        } else {
            double overtimeHours = numberOfHours - 40;
            return (40 * hourlyRate) + (overtimeHours + hourlyRate * 1.5);
        }
    }

    public double socialSecurity(double grossPay) {
        return grossPay * 0.06;
    }

    public double federalTax(double grossPay) {
        return grossPay * 0.14;
    }

    public double stateTax(double grossPay) {
        return grossPay * 0.05;
    }

    public double unionDues() {
        return 10.00;
    }

    public double insurance(int dependents) {
        if (dependents >= 3) {
        return 35.00;
    } else {
        return 15.00;
    }
}

    public double netPay(double grossPay, int dependents){
        double deductions = socialSecurity(grossPay) + federalTax(grossPay) + stateTax(grossPay) + unionDues() + insurance(dependents);
        return grossPay - deductions;
    }
}
