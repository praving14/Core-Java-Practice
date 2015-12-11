package com.practice;



import java.util.Scanner;

/**
 * This Program mainly focuses on the concept of parallel arrays:
 * In parallel arrays, multiple arrays are related through their index.
 *
 * Created on 12/3/2015.
 * @author
 * @version 1.0
 *
 */


public class JavaProgram7 {

    // initialize size of array
    private static final int SIZE =10;

    // initialize the employee id using {}. Make sure the size of array is SIZE;
    private static long[] empId = {11111, 11112, 11113, 11114, 11115, 11116, 11117, 11118, 11119, 11120};
    // array of integers to hold the number of hours worked by employee
    private static int[] hours = new int[SIZE];
    // array of doubles to hold the pay rate for each employee
    private static double[] payRate = new double[SIZE];
    // array of double to hold the total wages for each employee
    private static double[] wages =new double[SIZE];

    /**
     * The method to calculate the wages using the equation:
     *                      Wage = hour * payRate
     * @param hr        The number of hours worked by the employee
     * @param rate      The hourly pay rate of each employee
     * @return          The wage of each employee
     */
    public static double calculateWage(int hr, double rate){
        double wage = hr * rate ;
        return wage;
    }

    /**
     * The method to display the information of employee ID and their respective wages
     * @param employee      The employee ID of the employee
     * @param earnings      The earning of the employee
     */
    public static void displayInformation(long employee, double earnings){
        System.out.printf("For Employee ID = %d the wages = $%.2f %n", employee,earnings);
    }

    // main method
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hours worked for each employee: ");
        for(int i =0; i< empId.length; ++i ) {
            hours[i] = sc.nextInt();
            while (hours[i] < 0){
                System.out.print("INVALID! Should be Positive. REENTER: ");
                hours[i] = sc.nextInt();
            }
        }
        System.out.println("**************************************************");

        System.out.print("Now enter pay rate for each employee: ");
        for(int i = 0; i< empId.length; ++i){
            payRate[i] = sc.nextDouble();
            while(payRate[i] < 6.00){
                System.out.print("INVALID! Should be more than that of $6.00. REENTER: ");
                payRate[i] = sc.nextDouble();
            }
        }
        System.out.println("**************************************************");
        for (int i =0; i< empId.length; ++i){
            wages[i] = calculateWage(hours[i], payRate[i]);
        }

        for (int i =0; i< empId.length; ++i){
            displayInformation(empId[i],wages[i]);
        }


    }

}
