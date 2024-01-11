/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem3;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please Enter a number: ");
        int number = input.nextInt();
        
        if (number%2 == 0){
            System.out.println("The number is even");
        }else
            System.out.println("The number is odd");
       
    }
}
