package oop03Inheritance;

 class Main {
	public static void main(String[] args) {
		
		Animal cat1 = new Cat();
		System.out.println("Animal = new Cat");
		cat1.printOverride();
		
		System.out.println("-----------");
		Animal cat2 = new Cat();
		System.out.println("Cat = new Cat");
		cat2.printOverride();
		
		
	}

}
