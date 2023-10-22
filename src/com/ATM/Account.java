package com.ATM;
import java.util.*;
import java.io.*;
import java.text.*;


public class Account {
    
    Scanner accsc=new Scanner(System.in); 
    DecimalFormat money=new DecimalFormat("'Rs' ###,##0.00");
    
    public int setAccountNumber(int accountNumber )
    {
        this.accountNumber=accountNumber;
        return accountNumber;
                
    }
      public int getAccountNumber( )
    {
       return accountNumber;
                
    }
      
      
    public int setPinPassword(int pinPassword )
    {
        this.pinPassword=pinPassword;
        return pinPassword;
                
    }
      public int getPinPassword( )
    {
       return pinPassword;
    }
      
      
      
    public double getcheckingBalance()
    {
       return checkingBalance;
    }
    
    public double getsavingingBalance()
    {
       return savingBalance;
    }
    
    public double calCheckingBalance(double amount){
        
        checkingBalance=(checkingBalance-amount);
        return checkingBalance;
        
    }
    
     public double calSavingBalance(double amount){
        
        savingBalance=savingBalance-amount;
        return savingBalance;
    }
     
   
     
     public double calCheckingDeposit(double amount){
        
        checkingBalance=checkingBalance+amount;
        return checkingBalance;
    }
     
       public double calSavingDeposit(double amount){
        
        savingBalance=savingBalance+amount;
        return savingBalance;
    }
       
     public void getCheckingWithdrawFunds()
     {
         System.out.println("Checking Account Balance: "+money.format(checkingBalance));
         System.out.println("Amount you want to withdraw;");
         double amount=accsc.nextDouble();
         
         if((checkingBalance-amount) >=0)
         {
             calCheckingBalance(amount);
             System.out.println("new Checking Balance" +money.format(checkingBalance));
        }
         else
         {
            System.out.println("Amount can not ne negative"); 
         }
         
     }
     
      public void getSavingWithdrawFunds()
     {
         System.out.println("Saving Account Balance: "+money.format(savingBalance));
         System.out.println("Amount you want to withdraw;");
         double amount=accsc.nextDouble();
         
         if((savingBalance-amount) >=0)
         {
             calSavingBalance(amount);
             System.out.println("new Saving Balance" +money.format(savingBalance));
        }
         else
         {
            System.out.println("Amount can not ne negative"); 
         }
         
     }
      
       public void getCheckingDepositFunds()
     {
         System.out.println("Checking Account Balance: "+money.format(checkingBalance));
         System.out.println("Amount you want to withdraw;");
         double amount=accsc.nextDouble();
         
         if((savingBalance+amount) >=0)
         {
             calCheckingDeposit(amount);
             System.out.println("new Checking Balance" +money.format(checkingBalance));
        }
         else
         {
            System.out.println("Amount can not ne negative"); 
         }
         
     }
       
           public void getSavingDepositFunds()
     {
         System.out.println("Saving Account Balance: "+money.format(savingBalance));
         System.out.println("Amount you want to withdraw;");
         double amount=accsc.nextDouble();
         
         if((savingBalance+amount) >=0)
         {
             calCheckingDeposit(amount);
             System.out.println("new saving Balance" +money.format(savingBalance));
        }
         else
         {
            System.out.println("Amount can not ne negative"); 
         }
         
     }
     
    private int accountNumber ;
    private int pinPassword;
    private double checkingBalance=00;
    private double savingBalance=0;
    
    
    
}
