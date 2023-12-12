package com.module;

public class Bank {



    public static void main(String[] args) {

        

        BankA bA = new BankA();

        bA.getBalance();

        

        BankB bB = new BankB();

        bB.getBalance();

        

        BankC bC = new BankC();

        bC.getBalance();

        



    }

    

}




abstract class Banks{



   public abstract void getBalance();

}



class BankA extends Banks{

    

    @Override

    public void getBalance(){

        System.out.println("Deposited: $100 ");

    }

}



class BankB extends Banks{



    @Override

    public void getBalance(){

        System.out.println("Deposited: $150 ");

    }

}



class BankC extends Banks{



    @Override

    public void getBalance(){

        System.out.println("Deposited: $200 ");

    }

}

