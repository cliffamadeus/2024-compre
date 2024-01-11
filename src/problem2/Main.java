/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem2;

/**
 *
 * @author Admin
 */
public class Main {
     public static void main(String[] args) {
        //Solution 1
    	System.out.println("Solution 2");
        char[] name = {'N', 'B', 'S', 'C'};
        
        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i]);
        }
        System.out.println();
        
        for (int i = name.length-1; i >= 0; i--) {  
            System.out.print(name[i]);  
        }
        System.out.println();
        System.out.println();
        
        //Solution 2
        System.out.println("Solution 2");
        String school = "NBSC";
        char[] name2 = school.toCharArray();
        
        for (int i = 0; i < name2.length ; i++) {
        	System.out.print(name2[i]);
        }
        System.out.println();
        
        for (int i = name2.length-1; i>=0; i--) {
        	System.out.print(name2[i]);
        }
        
    }
}
