//Author: Albert Ng
//Date created:17/04/2017
//Date last changed:21/04/2017
//This program calculates the days someone has been alive 
//Input: None
import java.util.Scanner;
public class DaysAliveCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Months[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
			Scanner ireader = new Scanner(System.in);
			int firstDay, 
			firstYear, 
			firstMonth,
			secondYear,
			secondDay, 
			secondMonth,
			totalDays=0, 
			alldays=0, 
			daysofyears=0,
			leapYear=0,
			newfirstDay;
			

			
			
			System.out.println("Enter first day here: ");
			firstDay = ireader.nextInt();
			System.out.println("Enter first year here: ");
			firstYear = ireader.nextInt();
			System.out.println("Enter first month here; ");
			firstMonth = ireader.nextInt();
			System.out.println("Enter second day here");
			secondDay = ireader.nextInt();
			System.out.println("Enter second year here");
			secondYear = ireader.nextInt();
			System.out.println("Enter second month here: ");
			secondMonth = ireader.nextInt();
			
			/*
			I  thought it might be more user-friendly to allow
			the user to input his/her own values for more 
			calculation customization
			*/
			
			if(firstDay>28 && firstMonth==2){
				System.out.println("Error, enter valid number");
			}
			
			
				final int yearsLived=secondYear-firstYear-1;
					if(0<yearsLived){
						daysofyears=yearsLived*365;
						}
				//Calculates days of years in between the first and last years
				
			
					for(int counter=12; counter>firstMonth; counter--){
						totalDays+=Months[counter];
						}
				
					
					/*The above for loop counts the array months down from December
			 		to the month after the user input month. This is to find the 
			 		number of days 
					 */
					
				
						for(int scounter=1; scounter<secondMonth; scounter++){
							alldays+=Months[scounter];
							}
						//Receives the days lived during last year
					
						
						
							newfirstDay=Months[firstMonth]-firstDay;
				
				//Calculates from end of birth month to December
				
				
						while(firstYear<=secondYear){
							if(firstYear%4==0 && !NOT(firstYear%1==0)){
								leapYear++;
							}	
							firstYear++;
						}
						//This calculates the leap years within the years lived
				
				

			System.out.println(daysofyears+totalDays+alldays+newfirstDay+secondDay+leapYear);
			//Prints the end result
	}

	private static boolean NOT(boolean b) {
		// TODO Auto-generated method stub
		return false;
	}

}
