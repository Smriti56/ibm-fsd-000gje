package example;

import java.io.Serializable;
public class Account implements Serializable {

	private static final long serialVersionUID = 841039441390290808L;
	private String accountNumber;
	private double amount;
	
	
	public Account(String accountNumber, double amount) {
		super();
		this.accountNumber = accountNumber;
		this.amount = amount;
	}


	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getAccountNumber() {
		return accountNumber;
	}
	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", amount=" + amount + "]";
	}
	
	public Account createNewAccount(String accountNumber,double amount) throws AccountNotValidException {
		this.accountNumber=accountNumber;
		this.amount=amount;
		if(amount<10000)
		{
			throw new AccountNotValidException("Amount is less, Account is invalid");
		}
		System.out.println("Valid Account");
		return new Account(accountNumber,amount);
	}
	

}
