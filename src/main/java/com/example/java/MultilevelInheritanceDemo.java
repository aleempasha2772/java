package com.example.java;

class GrandFather{
	String grandFatherName;
	
	GrandFather(String grandFatherName){
		this.grandFatherName = grandFatherName;
	}
}

class Father extends GrandFather{
	String fatherName;
	Father(String grandFatherName,String fatherName){
		super(grandFatherName);
		this.fatherName = fatherName;
	}
}

class Son extends Father{
	String sonName;
	Son(String grandFatherName,String fatherName,String sonName){
		super(grandFatherName,fatherName);
		this.sonName = sonName;
	}
	
	void printNames() {
		System.out.println("Grand Father Name is : "+ grandFatherName);
		System.out.println("Father Name is : "+ fatherName);
		System.out.println("Son Name is : "+ sonName);
	}
}



public class MultilevelInheritanceDemo {
	public static void main(String[] args) {
		Son son = new Son("Suresh", "Ramesh", "Saurabh");
		son.printNames();
	}

}
