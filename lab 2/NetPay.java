
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

	public static void main(String[] args) {
		double FEDERAL_TAX_PERCENT = 0.10;
		double STATE_TAX_PERCENT = 0.045;
		double SS_PERCENT = 0.062;
		double MEDICARE_PERCENT = 0.0145;
		double PAY_PER_HOUR = 7.250;
		double HOURS_PER_WEEK = 40.00;
		double NET_PAY;
		double GROSS_PAY;
		double DEDUCTIONS;
		
		System.out.println("Hours per week:" + "\t" + "\t" + HOURS_PER_WEEK);
		
		GROSS_PAY = (HOURS_PER_WEEK * PAY_PER_HOUR);
		System.out.println("Gross pay:" + "\t" +"\t"  + "$" + GROSS_PAY );
		
		FEDERAL_TAX_PERCENT = (GROSS_PAY * FEDERAL_TAX_PERCENT);
		STATE_TAX_PERCENT = (GROSS_PAY * STATE_TAX_PERCENT);		
		SS_PERCENT = (GROSS_PAY * SS_PERCENT);		
		MEDICARE_PERCENT = (GROSS_PAY * MEDICARE_PERCENT);
		
		DEDUCTIONS = (FEDERAL_TAX_PERCENT + STATE_TAX_PERCENT + SS_PERCENT + MEDICARE_PERCENT);
		
		NET_PAY = (GROSS_PAY - DEDUCTIONS);
		System.out.println("Net pay:" + "\t" + "\t" + "$" + NET_PAY );
		
		System.out.println(" ");
		System.out.println(" ");

		
		System.out.println("Deductions ");
		System.out.println("Federal:" + "\t" + "\t" + FEDERAL_TAX_PERCENT);
		System.out.println("State:" + "\t" + "\t" + "\t" + STATE_TAX_PERCENT);
		System.out.println("Social Secutiry:" + "\t" + SS_PERCENT);
		System.out.println("Medicare:" + "\t" + "\t" + MEDICARE_PERCENT);
		
		
		
		

	}

}
