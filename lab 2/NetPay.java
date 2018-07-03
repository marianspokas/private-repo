
/**goal: compute persons gross and net pay by hourly wage, hours worked and withholdings
 * define all statements in main method (except declaration of constants)
 */

/**
 * @author marianspokas
 * date: July 2, 2018
 * project: Lab 2
 * prof: Dr. Hao
 * import java util and create class, 'NetPay'
 */
import java.util.*;

public class NetPay {
	private static double FEDERAL_TAX_PERCENT = 0.10;
	private static double STATE_TAX_PERCENT = 0.045;
	private static double SS_PERCENT = 0.062;
	private static double MEDICARE_PERCENT = 0.0145;
	private static double PAY_PER_HOUR = 7.250;
	
	public static void main(String[] args) {
		double HOURS_PER_WEEK = 40.00;
		double netPay;
		double grossPay;
		double DEDUCTIONS;
		
		System.out.println("Hours per week:" + "\t" + "\t" + HOURS_PER_WEEK);
		
		grossPay = (HOURS_PER_WEEK * PAY_PER_HOUR);
		System.out.println("Gross pay:" + "\t" +"\t"  + "$" + grossPay );
		
		FEDERAL_TAX_PERCENT = (grossPay * FEDERAL_TAX_PERCENT);
		STATE_TAX_PERCENT = (grossPay * STATE_TAX_PERCENT);		
		SS_PERCENT = (grossPay * SS_PERCENT);		
		MEDICARE_PERCENT = (grossPay * MEDICARE_PERCENT);
		
		DEDUCTIONS = (FEDERAL_TAX_PERCENT + STATE_TAX_PERCENT + SS_PERCENT + MEDICARE_PERCENT);
		
		netPay = (grossPay - DEDUCTIONS);
		System.out.println("Net pay:" + "\t" + "\t" + "$" + netPay );
		
		System.out.println(" ");
		System.out.println(" ");

		
		System.out.println("Deductions ");
		System.out.println("Federal:" + "\t" + "\t" + FEDERAL_TAX_PERCENT);
		System.out.println("State:" + "\t" + "\t" + "\t" + STATE_TAX_PERCENT);
		System.out.println("Social Secutiry:" + "\t" + SS_PERCENT);
		System.out.println("Medicare:" + "\t" + "\t" + MEDICARE_PERCENT);
		
		
		
		

	}

}
