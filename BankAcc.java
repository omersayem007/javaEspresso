 public class BankAcc{


	private double balance;
	private  String accountId;

	BankAcc(double balance,String accountId){

		this.balance=balance ;
		this.accountId=accountId;

	}

	 public double withdraw(double ammount){

	 	if(ammount<balance)
	 		balance=balance-ammount;
	 	
	 }

	 public void deposit(double ammount){
	 	if(ammount>0)
	 	balance=balance+ammount;
	 }

	 public void printDetails(){

        System.out.println(this.accountId);
	 	System.out.println(this.balance);

	 }

	 public void transfer( double ammount ){

	 	   BankAcc ob1 = new BankAcc(ammount,"15-30172-2");
	 	    ob1.printDetails();

	 }


}

