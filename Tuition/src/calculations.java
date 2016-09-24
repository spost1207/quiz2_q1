import java.util.Scanner;

public class calculations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your initial tuition: ");
		double initial_tuition = sc.nextDouble();
		System.out.println("Please enter your percentage increase as a decimal: ");
		double percentage_increase = sc.nextDouble();
		double totalT = calculationEQ(initial_tuition, percentage_increase);
		System.out.printf("The total cost of your tuition to complete a four-year degree is: $%,.2f%n",totalT);
	}
			
	public static double calculationEQ(double initial_tuition, double percentage_increase) {
		double total_tuition = initial_tuition;
		double cost = initial_tuition;
		
		for(int i = 0; i <= 2; i++)
		{
			total_tuition = total_tuition + (total_tuition * percentage_increase);
			cost += total_tuition ;
		}
		return cost;
	}
}
