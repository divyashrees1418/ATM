package com.ATM;
import java.util.*;
import java.util.Map.Entry;
import java.util.HashMap;
import java.io.*;
import java.text.*;


public class OptionMenu extends Account {
    
    int choice=0;
    
    Scanner optsc=new Scanner(System.in);
    DecimalFormat money=new DecimalFormat("'Rs' ###,##0.00");
    
    HashMap<Integer,Integer> data=new HashMap<Integer,Integer>();
    
    
    public void getLogin() throws IOException
    {
        int x=1;
        
        do
                {
                    try
                    {
                        data.put(192837,1418);
                        data.put(12345,1814);
                        
                        System.out.println("Welcome to SP2DV bank");
                        
                        System.out.println("Enter the account number");
                        setAccountNumber(optsc.nextInt());
                        
                        System.out.println("Enter the pin");
                        setPinPassword(optsc.nextInt());
                    }
                    catch(Exception e)
                    {
                        System.out.println("Please enter the correct values ");
                        x=2;
                    }
                    
                    //checking the login values
                    for( Entry<Integer,Integer> entry:data.entrySet())
                    {
                        if(entry.getKey()==getAccountNumber() && entry.getValue()==getPinPassword())
                            getAccountType();
                    }
 }
        while(x==1);
 }
        //selecting the account type
        public void getAccountType()
        {
            
            System.out.println("Enter the Account Type");
            System.out.println("1-checking account");
            System.out.println("2-saving account");
            System.out.println("3-exit");
            System.out.println("choice:");
            
            choice=optsc.nextInt();
            
            switch(choice)
                    {
                        case 1:
                            getChecking();
                            break;
                        
                        case 2:
                            getSaving();
                            break;
                           
                        case 3:
                            System.out.println("Thank for accessing our ATM, byee");
                            break;
                            
                        default:
                            System.out.println("Invalid choice");
                            getAccountType();
                    }
        }
        
        public void getChecking()
        {
            System.out.println("checking account");
            System.out.println("1-View Balance");
            System.out.println("2-Withdraw Funds");
            System.out.println("3-Deposit Funds");
            System.out.println("4-Exist ");
            System.out.println("choice");
            
            choice=optsc.nextInt();
            
            switch(choice)
            {
                case 1:
                    System.out.println("Checking Account Balance: "+money.format(getcheckingBalance()));
                    getAccountType();
                    break;
                
                case 2:
                    getCheckingWithdrawFunds();
                    getAccountType();
                    break;
                
                case 3:
                    getCheckingDepositFunds();
                    getAccountType();
                    break;
                    
                    
                case 4:
                    System.out.println("Thank for accessing our ATM, byee");
                    getAccountType();
                    break;
                    
                default:
                    System.out.println("Invalid choice");
                    getChecking();
                    
            }
            
        }
        
        
        public void getSaving()
        {
            System.out.println("checking account");
            System.out.println("1-View Balance");
            System.out.println("2-Withdraw Funds");
            System.out.println("3-Deposit Funds");
            System.out.println("4-Exist ");
            System.out.println("choice");
            
            choice=optsc.nextInt();
            
            switch(choice)
            {
                case 1:
                    System.out.println("Checking Account Balance: "+money.format(getsavingingBalance()));
                    getAccountType();
                    break;
                
                case 2:
                    getSavingWithdrawFunds();
                    getAccountType();
                    break;
                
                case 3:
                    getSavingDepositFunds();
                    getAccountType();
                    break;
                    
                    
                case 4:
                    System.out.println("Thank for accessing our ATM, byee");
                    getAccountType();
                    break;
                    
                default:
                    System.out.println("Invalid choice");
                    getChecking();
                    
            }
            
        }
}
