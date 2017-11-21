package oop03Inheritance;

 class Cat extends Animal{
	void meow(){
		System.out.println("meowing...");
	}
	
	@Override
	protected void printOverride(){
		System.out.println("Cat - override");
	}
}
