package org.example;

import java.util.Scanner;

public class Payroll {
  public static void main(String[] args) {
    System.out.println("Welcome to the Payroll Calculator!");

    System.out.println("Enter the Number of Hours You Worked: ");
    Scanner scanner = new Scanner(System.in);
    double numberOfHours = scanner.nextDouble();

    System.out.println("Enter Hourly Rate: ");
    double hourlyRate = scanner.nextDouble();

    System.out.println("Enter the Number of Dependents: ");
    int numberOfDependents = scanner.nextInt();


    PayCalculator payCalculator = new PayCalculator();

    double grossPay = payCalculator.grossPay(numberOfHours, hourlyRate);
    double socSec = payCalculator.socialSecurity(grossPay);
    double fedTax = payCalculator.federalTax(grossPay);
    double stTax = payCalculator.stateTax(grossPay);
    double union = payCalculator.unionDues();
    double insurance = payCalculator.insurance(numberOfDependents);
    double net = payCalculator.netPay(grossPay, numberOfDependents);


    System.out.println();
    System.out.println("Payroll Stub: ");
    System.out.println();


    System.out.println("Hours: " + numberOfHours);
    System.out.println("Rate: " + hourlyRate + " $/hr");
    System.out.printf("Gross: $%.2f%n ", grossPay);
    System.out.println();

    System.out.printf("SocSec: $%.2f%n ", socSec);
    System.out.printf("FedTax: $%.2f%n ", fedTax);
    System.out.printf("StTax: $%.2f%n ", stTax);
    System.out.printf("Union: $%.2f%n ", union);
    System.out.printf("Ins: $%.2f%n ", insurance);
    System.out.println();

    System.out.printf("Your net pay is: $%.2f%n ", net);
    System.out.println();

    System.out.println("Thank you for using the Payroll Program!");

    scanner.close();

  }
}
