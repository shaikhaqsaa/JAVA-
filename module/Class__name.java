package com.module;


	public class Class__name{

		public static void main(String[] args){

		Scanner input=new Scanner(System.in);

		for(int i=1;i<2;i++){

		System.out.println(“enter a no. less than 10”);

		int a=input.nextInt();

		if(a<10){

		for(int j=1;j<=10;j++){

		int c=a*j;

		System.out.println(a+” * “+j+” = “+c);

		}//completion of inner for loop;

		}//completion of If loop;

		else{

		System.out.println(“You have entered wrong input”);

		i- -;

		}//completion of else loop;
	}
