/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem4;

/**
 *
 * @author Admin
 */
public class Main {
      public static void main(String[] args) {
      
        int[][] num = { {1, 2, 3, 4}, {5, 6, 7},{3,1,2,4 }};
             
        for (int i = 0; i < num.length; ++i) {
            int sum = 0;
            for (int j = 0; j < num[i].length; ++j) {
                System.out.print(num[i][j] + " ");
                sum += num[i][j];
            }
            
            int avg = sum / num[i].length;
            
            System.out.println();
            System.out.println("Sum for array " + i + ": " + sum);
            System.out.println("Average for array " + i + ": " + avg);
            System.out.println();
        }
    }  
}
