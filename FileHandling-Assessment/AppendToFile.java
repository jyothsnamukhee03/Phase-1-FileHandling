package com.simplilearn.Filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class AppendToFile{
	String s = "";
	public AppendToFile() {
		System.out.println("Executing : "+this.getClass());
	        try
	        {
	            System.out.print("Enter text to append to a file: " );
	            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	            s = br.readLine(); 
	        }
	        catch (IOException e)
	        {
	            System.out.println(e);
	        }
	}
	public void appendToFile() {
	{
		try{
			

	    	File file =new File("numbers");

	    	FileWriter fw = new FileWriter(file,true);

	    	BufferedWriter bw = new BufferedWriter(fw);
	    	bw.write(s);
	    	bw.close();

		System.out.println("Successfully appended to a file");

	      }catch(IOException ioe){
	         System.out.println("Exception occurred:");
	    	 ioe.printStackTrace();
	       }
		finally {
			System.out.println("Closing : "+this.getClass());
		}

	}

	}
}