import java.util.Arrays;

public class Problem_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double [] balances = new double[] {45.23, 46.85, 50.47};
		System.out.println(balances.length);
		
		for (int i = 0; i < balances.length; i++)
		{
			balances[i] = balances[i] * 100;
		}
		
		System.out.println(Arrays.toString(balances));
		double sum = 0.0;
		for (double balance: balances)
		{
			sum += balance;
		}
		
		System.out.printf("Total balance %.02f\n", sum);
		
		double sumAverage;
		sumAverage = sum / balances.length;
		System.out.printf("Average of sum, %.02f\n", sumAverage);
	}

}
