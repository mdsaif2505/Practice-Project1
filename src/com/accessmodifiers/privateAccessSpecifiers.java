package com.accessmodifiers;

class priaccessspecifier 
{ 
   private void display() 
    { 
        System.out.println("You are using private access specifier"); 
    } 
} 

public class privateAccessSpecifiers {

	public static void main(String[] args) {
		
		System.out.println("Private Access Specifier");
		priaccessspecifier  obj = new priaccessspecifier(); 
        

	}
}
