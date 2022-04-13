package com.simplilearn.Filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class WriteToFile{
	 String s = "";
	public WriteToFile() {
		System.out.println("Executing : "+this.getClass());
	        try
	        {
	            System.out.print("Enter text to write to a file: " );
	            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	            s = br.readLine(); 
	        }
	        catch (IOException e)
	        {
	            System.out.println(e);
	        }
	    
	}
	
	
	public void writeToFile() {
 
        try{
        
            File myFile = new File("numbers");
            
            if(!myFile.exists()){
                myFile.createNewFile();
            }
            
            FileWriter fw = new FileWriter(myFile,true); 
            BufferedWriter hbw = new BufferedWriter(fw); 
            
            hbw.write(s); 
            hbw.newLine(); 
            hbw.close();
            
            System.out.println("Successfully writing into a file");
        }catch( IOException e){
            System.out.println(e);
        }
        finally {
        	System.out.println("Closing : "+this.getClass());
        }
	}
}