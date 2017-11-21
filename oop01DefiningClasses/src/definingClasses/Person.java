package definingClasses;

import java.util.List;

public class Person {
//  private String name;
//  private Integer age;
  private List<BankAccount> accounts;
//  
//  protected Person(String name, int age){
//	  this.name = name;
//	  this.age = age;
//	  this.accounts = new ArrayList<BankAccount>();
//  }
//  protected Person(String name, int age, List<BankAccount> accounts){
//	  this(name, age);
//	  this.accounts = accounts;
//  }
  
  //Get total balance
 protected double getBalance() {
	return this.accounts.stream().mapToDouble(x -> x.getbalance()).sum();
}
  
}
