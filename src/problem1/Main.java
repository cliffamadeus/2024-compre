/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem1;

import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner num1 = new Scanner(System.in);
       Scanner num2 = new Scanner(System.in);
     
       System.out.print("Enter First Number: ");
       double firstNum = num1.nextDouble();
       
       System.out.print("Enter Second Number: 1");
       double secondNum = num2.nextDouble();
                  
       double sum, diff,prod, quo;
       
       sum = firstNum + secondNum;
       diff = firstNum - secondNum;
       prod = firstNum * secondNum;
       quo = firstNum / secondNum;
       
       System.out.println(firstNum + " + " + secondNum + " = " + sum ); 
       System.out.println(firstNum + " - " + secondNum + " = " + diff ); 
       System.out.println(firstNum + " * " + secondNum + " = " + prod ); 
       System.out.println(firstNum + " / " + secondNum + " = " + quo ); 
       
    }
    
}
