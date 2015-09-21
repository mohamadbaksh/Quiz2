//Made By Mohammad Baksh 

import java.util.Scanner;

public class CalculateTotalTuitionBill {
	private static Scanner user_input;

	public static void main(String[] args) {
		
		//opening a scanner
		user_input = new Scanner(System.in);

		//declaring the variables
		double ActualTuition;
		double IncreaseRate1;
		double IncreaseRate2;		
		double IncreaseRate3;		
		double APR;  
		//This asks for the tuition freshman year
		System.out.print("Please enter the actual tuition: ");
		ActualTuition = user_input.nextDouble();

		//This asks for the expected increase rate Sophomore year
		System.out.print("Please enter the rate at which the tuition is expected to increase Sophomore Year: ");
		IncreaseRate1 = user_input.nextDouble();
		
		//This asks for the expected increase rate Junior year
		System.out.print("Please enter the rate at which the tuition is expected to increase Junior Year: ");
		IncreaseRate2 = user_input.nextDouble();
		
		//This asks for the expected increase rate Senior year
		System.out.print("Please enter the rate at which the tuition is expected to increase Senior Year: ");
		IncreaseRate3 = user_input.nextDouble();
	
		//This asks for the expected APR
		System.out.print("Please enter the APR ");
		APR = user_input.nextDouble();
		//Printing the total cost
		System.out.print("Your total tuition is: $"+ TotalTuition ( ActualTuition, IncreaseRate1 , IncreaseRate2, IncreaseRate3 ));
		// Printing the monthly payment
		System.out.print("\nYour monthly payment is: $"+ MonthlyBill ( TotalTuition ( ActualTuition, IncreaseRate1 , IncreaseRate2, IncreaseRate3 ) , APR));
		
		//Closing the scanner
		user_input.close();
	}
public static double TotalTuition (double ActualTuition,double IncreaseRate1 ,double IncreaseRate2,double IncreaseRate3 ){
	//declaring the variables
	double ExpectedTuitionFreshman;
	double ExpectedTuitionSophomore;
	double ExpectedTuitionJunior;
	double ExpectedTuitionSenior;
	double ExpectedTotalTuition;
	//Assigning the values for every year
	ExpectedTuitionFreshman = ActualTuition;
	ExpectedTuitionSophomore = ExpectedTuitionFreshman*(1+IncreaseRate1/100);		
	ExpectedTuitionJunior = ExpectedTuitionSophomore*(1+IncreaseRate2/100);		
	ExpectedTuitionSenior = ExpectedTuitionJunior*(1+IncreaseRate3/100);
	//Calculating the total tuition for the 3 following years
	ExpectedTotalTuition = ExpectedTuitionFreshman + ExpectedTuitionSophomore + ExpectedTuitionJunior +ExpectedTuitionSenior;
	
	return ExpectedTotalTuition; 
	
}
public static double MonthlyBill (double ExpectedTotalTuition ,double APR) {
	//declaring the variables
	double MonthlyPayment;
	double FormattedTotal;
	// Calculating the monthly payment
	MonthlyPayment = ((ExpectedTotalTuition * (APR/100)) + ExpectedTotalTuition)/ (4 * 12);
	//Formating the number
	FormattedTotal = Math.round(MonthlyPayment*100.0)/100.0;

	return  FormattedTotal;
	
}
}