

class LabWork {
	
	
	public  static int remainingDayCounterer( int day , int month ){
		
		               int   remainingDay = 30-day;
					  int   remainingMonth = 12-month ;
					  
					  int totalRemainingDay = remainingDay + ( remainingMonth * 30 );
					  
					  System.out.println(totalRemainingDay );
					  
                  return totalRemainingDay ;
		
		
	}
	
	
	public static void extractInfo( String from , String to ){
		
		       int  day1 = Integer.parseInt( from.substring(0,2) );
			
			   int day2 = Integer.parseInt ( to.substring(0,2) );
			   
			   int month1 =Integer.parseInt ( from.substring(3,5) ) ;
			   int month2 =Integer.parseInt ( to.substring(3,5) ) ;
			   
			   
			   String fromYear = from.substring(6);
			   String toYear = to.substring(6);
			   
			   
			   //remaining day of the from year 
			   
                 if( fromYear == toYear && month1 == month2 ){
					 
					  System.out.println( "day :" + from.substring(0,2));
			          System.out.println( "month :" + from.substring(3,5));
			          System.out.println( "year:" + from.substring(6));
					  System.out.println( "year:" + to.substring(6));
			          System.out.println( "interval:" + (day2-day1));
					 
				 }
				 else {
					 
					  System.out.println( "day :" + from.substring(0,2));
			          System.out.println( "month :" + from.substring(3,5));
			          System.out.println( "year:" + from.substring(6));
					  System.out.println( "year:" + to.substring(6));
					  
					  int remainingOfFirst = remainingDayCounterer( day1 ,month1); 
					  int remainingOfSecond = remainingDayCounterer( day2 ,month2 );
					  
					  System.out.println("Total remainig Day :" + (remainingOfFirst+remainingOfSecond ));
                      
					 
					 
					 
				 }
			      
			 

		
		
		
	}

   public static void main(String args[]) {
	   
           extractInfo("15/10/2017","20/10/2018");
	  
   }

   }
