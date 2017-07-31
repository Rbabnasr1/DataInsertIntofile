/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author randa
 */

/*****************************/
import java.io.RandomAccessFile;
//import java.io.*;
/*****************************/

public class FileManipulation {

 public void Fill_Recordes(String name,int nr)throws Exception{
    RandomAccessFile store = new RandomAccessFile(name, "rw");
    store.seek(0);
    for (int i=0;i<nr;i++){
    	store.writeInt(i);
        store.writeInt(0);
    }
   // store.writeChar('*');
    store.close();
 }
 public void Display_File(String name)throws Exception{
	 RandomAccessFile store = new RandomAccessFile(name, "rw");
	 
	 int s=(int)store.length()/8;
	 System.out.println("Your file :)");
	 System.out.println("The # of Recordes = "+s);
	 store.seek(0); 

         for(int i=0;i<s;i++){	
		 System.out.print(store.readInt());
	     System.out.print(" , ");
		 System.out.print(store.readInt());
	     System.out.println(" ");
     }
	 store.close();
 }
 public void Display_value(String name,int rn)throws Exception{
	 RandomAccessFile store = new RandomAccessFile(name, "rw");
	 store.seek(0);
	 store.seek((rn*8)+4);
	 System.out.println(store.readInt());
	 store.close();
 }
 public void Write_Value(String name,int r, int v)throws Exception{
	 RandomAccessFile store = new RandomAccessFile(name, "rw");
        // store.seek(0);
        store.seek((r*8)+4); 
        store.writeInt(v); 
        store.close();
 }
 public void Replace(String name,int fr,int sr)throws Exception{
	 RandomAccessFile store = new RandomAccessFile(name, "rw");
	 
	store.seek((fr*8)+4);
	 int fv=store.readInt();
	 
	 store.seek(0);
	 store.seek((sr*8)+4);
	 int sv=store.readInt();
	  
	 //store.seek(0);
	 store.seek((fr*8)+4);
	 store.writeInt(sv);
	  
	 store.seek(0);
	 store.seek((sr*8)+4);
	 store.writeInt(fv);
 
	 store.close();
 }
/*RandomAccessFile fileStore = new RandomAccessFile("test.bin", "rws");
fileStore.seek(100);
fileStore.writeInt(5);
fileStore.writeInt(7);
System.out.println(fileStore.readInt());
System.out.println(fileStore.length()/4);
fileStore.close();
*/
}