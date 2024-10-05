package BankAccount;

public class Account {
	static {
		intRate = 0.5f;
		minBankBal=12000;
	}
	private int accId;
	private String accHolderName;
	private double balance;
	private String accType;
	public static float intRate;
	public static double minBankBal;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int accId, String accHolderName, double balance, String accType) {
		super();
		this.accId = accId;
		this.accHolderName = accHolderName;
		this.balance = balance;
		this.accType = accType;
	}
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	@Override
	public String toString() {
		return "Account [accId=" + accId + ", accHolderName=" + accHolderName + ", balance=" + balance + ", accType="
				+ accType + "]";
	}
	
	
	
	
	
	
	
	
	
}
