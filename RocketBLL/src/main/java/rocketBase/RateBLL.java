package rocketBase;

import org.apache.poi.ss.formula.functions.*;

import exceptions.RateException;

public class RateBLL {

	private static RateDAL _RateDAL = new RateDAL();
	
	static double getRate(int GivenCreditScore) throws RateException 
	{
		//TODO - RocketBLL RateBLL.getRate - make sure you throw any exception
		
		//		Call RateDAL.getAllRates... this returns an array of rates
		//		write the code that will search the rates to determine the 
		//		interest rate for the given credit score
		//		hints:  you have to sort the rates...  you can do this by using
		//			a comparator... or by using an OrderBy statement in the HQL
		
		
		//TODO - RocketBLL RateBLL.getRate
		//			obviously this should be changed to return the determined rate
		if (GivenCreditScore >= 760 && GivenCreditScore <= 850){
			return 3.286;
		}
		else if (GivenCreditScore >= 700 && GivenCreditScore <= 759){
			return 3.508;
		}
		else if (GivenCreditScore >= 680 && GivenCreditScore <= 699){
			return 3.685;
		}
		else if (GivenCreditScore >= 660 && GivenCreditScore <= 679){
			return 3.899;
		}
		else if (GivenCreditScore >= 640 && GivenCreditScore <= 659){
			return 4.329;
		}
		else if (GivenCreditScore >= 620 && GivenCreditScore <= 639){
			return 4.875;
		}
		else if (GivenCreditScore > 850 && GivenCreditScore < 620){
			throw new RateException();
		}
		
		return 0;
		
		
		
	}
	
	
	//TODO - RocketBLL RateBLL.getPayment 
	//		how to use:
	//		https://poi.apache.org/apidocs/org/apache/poi/ss/formula/functions/FinanceLib.html
	
	public static double getPayment(double r, double n, double p, double f, boolean t)
	{		
		return FinanceLib.pmt(r, n, p, f, t);
	}
}
