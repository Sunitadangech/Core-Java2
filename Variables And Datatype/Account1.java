//6)Write a java program for a transaction history 1)Create a balance variable of 0Rs.2)Deposite 200Rs in balance.3)Dedut 50Rs. in balance.4)Add 2000Rs. in the balance.5)Send 720Rs. to your friend.6)Ask your friend to send 200Rs. in your Account7)Send 1Rs. to your friend.
class Account1 
{
	public static void main(String[] args) 
	{
		int balance=0;
		balance=balance+200;
		balance=balance-50;
		balance=balance+2000;
		balance=balance-720;
		balance=balance+200;
		balance=balance-1;
		System.out.println(balance);
    }
}
