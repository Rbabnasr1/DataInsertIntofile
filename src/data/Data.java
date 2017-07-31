/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author DELL
 */
/*****************************/
import java.io.RandomAccessFile;
import java.util.Scanner;
import java.io.*;
/*****************************/

public class Data {

    /**
     * @param args the command line arguments
     */

	public static void main(String[] args)throws Exception
	{
              // TODO code application logic here
    
		Scanner cin =new Scanner(System.in);
		int nr=0,v=0,r=0,r2=0;
		String name="no name";
		FileManipulation f=new FileManipulation();
	////////////////////////////////////////////////////////////////////
	    System.out.println("Enter the # of records you want :");
	    nr=cin.nextInt();
	    System.out.println("Enter the file name you want :");
	    name=cin.nextLine();
	    cin.next();
	    name=name+".bin";
	////////////////////////////////////////////////////////////////////    
	    f.Fill_Recordes(name,nr);
	    f.Display_File(name);
	////////////////////////////////////////////////////////////////////
	    while(true){
	    	System.out.println("Choose an operation :");
	    	System.out.println("1-Insert value");
	    	System.out.println("2-Raplace 2 records to gether");
	    	System.out.println("3-Display certain record ");
	    	System.out.println("4-Break");
	    	System.out.println("-----------------------------------------------------");
	        nr=cin.nextInt();
	    	if(nr==1){
	    		System.out.println("Enter record number :");
	    		r=cin.nextInt();
	    		System.out.println("Enter the value you want to insert: ");
	    		v=cin.nextInt();
	    		f.Write_Value(name, r, v);
	    		
	    	    f.Display_File(name);
	    	}else if(nr==2){
	    		System.out.println("Enter first record number :");
	    		r=cin.nextInt();
	    		System.out.println("Enter second record number: ");
	    		r2=cin.nextInt();
	    		f.Replace(name, r, r2);
	    		
	    		f.Display_File(name);
	    	}else if(nr==3){
	    		System.out.print("Enter the record number :");
	    		r=cin.nextInt(); 
	    		f.Display_value(name, r);
	    	}else if(nr==4){
	    		break;
	    	}
	    }
	    
	}

}
