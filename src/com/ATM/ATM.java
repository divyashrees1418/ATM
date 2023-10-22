package com.ATM;
import java.io.*;
public class ATM extends OptionMenu {
    
    public static void main(String[] args) throws IOException
    {
       OptionMenu opt=new OptionMenu();

        //calling the grtLogin menthod which is present in OptionMenu class
        
       opt.getLogin();
    }
    
}
