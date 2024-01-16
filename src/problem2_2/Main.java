package problem2_2;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		double number = scanner.nextInt();
		
		System.out.println();
		System.out.println("Solution 1");
		for (int i=1; i<= number ;i++) {
			if(i%2==0) {
				System.out.println(i+" Even");
			}else {
				System.out.println(i+" Odd");
			}
			
		}
		
		System.out.println();
		System.out.println("Solution 2");
		for (int i = 1; i <= number; i++) {
            String classification = (i % 2 == 0) ? "Even" : "Odd";
            System.out.println(i + " " + classification);
        }
		
		scanner.close();


	}

}
