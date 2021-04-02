package com.home.encapsulation;

public class Account { // class describes the information of bank accounts
	
	// attributes are the ID account, name of the account and the availabe balance respectively
	private int id;
	private String name;
	private int balance = 0;
	
	// constructor parameters which is used to declare the corresponding attributes.
	public Account (int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public Account (int id, String name, int balance)
	{
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	 // the setters and getters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public int getBalance() {
		return balance;
	}
	
	// method is used to deposit an amount of money (balance += amount)
	public void deposit(int amount)
	{
		balance += amount;
	}
	
	// method is used to withdraw an amount of money (balance -= amount). If the balance in the account is not enough (balance < amount), do not withdraw money
	public void withdraw(int amount)
	{
		if (balance < amount) System.out.print("That amount exceeds your current balance\n");
		else
			balance -= amount;
	}
	
	//  method is used to display the account information on the screen
	public void display()
	{
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Balance: " + balance);
	}
}
