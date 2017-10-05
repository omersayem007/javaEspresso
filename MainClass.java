class MainClass{


	public static void main(String a[]){
    
           BankAcc ob = new BankAcc(1000,"15-30154-2");
         

           ob.withdraw(200);

           ob.deposit(100);

           ob.transfer(200);

           ob.printDetails();



	}
} 