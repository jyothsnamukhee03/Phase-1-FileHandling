package com.simplilearn.Filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
	public ReadFromFile() {
		System.out.println("Executing : "+this.getClass());
	}
	
	public void readFromFile() {
	        String strLine = "";
	        try {
	        	BufferedReader  br = new BufferedReader( new FileReader("numbers"));
	            while( (strLine = br.readLine()) != null){
	                System.out.println(strLine);  
	            }
	            
	        } catch (FileNotFoundException e) {
	            System.err.println("Unable to find the file: fileName");
	        } catch (IOException e) {
	            System.err.println("Unable to read the file: fileName");
	        }  catch( Exception e){
	            System.err.println("Any Exception");
	        }
	        finally {
	        	System.out.println("Closing : "+this.getClass());
	        }
	}
}