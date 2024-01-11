package problem5;

public class Main {

	public static void main(String[] args) {
		
		double [][] num = { {1, 2},{3,4} };

        for (int i = 0; i < num.length; ++i) {
            for (int j = 0; j < num[i].length; ++j) {
                //System.out.print(num[i][j] + " ");
            }
            double sum = num[i][0] + num[i][1];
            double diff = num[i][0] - num[i][1];
            double prod = num[i][0] * num[i][1];
            double quo = num[i][0] / num[i][1] ;
            
            //Not divisible by zero
            //double quo = num[i][1] != 0 ? (double) num[i][0] / num[i][1] : Double.NaN;
            
            String resultStringAdd = num[i][0] + " + " + num[i][1] + " = " + sum ;
            String resultStringSub = num[i][0] + " - " + num[i][1] + " = " + diff ;
            String resultStringMul = num[i][0] + " * " + num[i][1] + " = " + prod ;
            String resultStringDiv = num[i][0] + " / " + num[i][1] + " = " + quo ;
            
            System.out.println(resultStringAdd);
            System.out.println(resultStringSub);
            System.out.println(resultStringMul);
            System.out.println(resultStringDiv);
            System.out.println();
        }
	}

}
