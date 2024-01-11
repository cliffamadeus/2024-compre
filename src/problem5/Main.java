package problem5;

public class Main {

	public static void main(String[] args) {
		
		double [][] num = {{1, 2},{3,4}};
		
		for (int i=0; i<num.length;i++) {       	
      
        	double sum = num[i][0] + num[i][1];
        	double diff = num[i][0] - num[i][1];
        	double prod = num[i][0] * num[i][1];
        	double quo = num[i][0] / num[i][1];
        	
        	System.out.println( num[i][0] + " + " + num[i][1] + " = " + sum);
        	System.out.println( num[i][0] + " - " + num[i][1] + " = " + diff);
        	System.out.println( num[i][0] + " * " + num[i][1] + " = " + prod);
        	System.out.println( num[i][0] + " / " + num[i][1] + " = " + quo);
        	System.out.println();
        	
        }	
	}

}
