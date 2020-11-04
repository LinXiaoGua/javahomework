//9.7（账户类Account，不需要画UML）
package 第三次作业;

import java.util.Date;

public class Q2{
	public static void main(String[] args) {
		Account account = new Account(1, 1000);
		System.out.println("余额为："+account.getBalance());
		System.out.println("取走100后余额为："+account.withDraw(100));
		System.out.println("存款200后余额为："+account.deposit(200));
		
		account.setAnnualInterestRate(0.3);
		System.out.println("月利率为："+account.getMonthlyInterestBase()*100+"%");
		System.out.println("月利息为："+account.getMonthlyInterest());
		System.out.println("开户时间为："+account.getDateCreated());
	}
}

class Account{
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;
	
	public Account() {
		Date dateCreated = new Date();
		this.dateCreated = dateCreated;
	}
	
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		Date dateCreated = new Date();
		this.dateCreated = dateCreated;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public String getDateCreated() {
		return dateCreated.toString();
	}
	
	public double getMonthlyInterestBase() {
		return annualInterestRate/12;
	}
	
	public double getMonthlyInterest() {
		return balance * (annualInterestRate/12);
	}
	
	public double withDraw(double amount) {
		return this.balance = this.balance - amount;
	}
	
	public double deposit(double amount) {
		return this.balance = this.balance + amount;
	}
}
