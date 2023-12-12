package com.module;

public class Complex{

  //for real and imaginary parts of complex numbers

  double real, img;

 

  //constructor to initialize the complex number

  Complex(double r, double i){

this.real = r;

this.img = i;

  }

 

  public static Complex sum(Complex c1, Complex c2)

  {

//creating a temporary complex number to hold the sum of two numbers

	  Complex temp = new Complex(0, 0);

       temp.real = c1.real + c2.real;

       temp.img = c1.img + c2.img;

       

       //returning the output complex number

       return temp;

   }

   public static void main(String args[]) {

	   Complex c1 = new Complex(5.5, 4);

	   Complex c2 = new Complex(1.2, 3.5);

	   Complex
	   temp = sum(c1, c2);

       System.out.printf("Sum is: "+ temp.real+" + "+ temp.img +"i");

   }

}
