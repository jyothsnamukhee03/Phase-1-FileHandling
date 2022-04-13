package com.simplilearn.Filehandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	
	
		Main(){
			System.out.println("****************************");
			System.out.println("                     ==========File Handling==========");
			System.out.println("                            Developed By MUKHEE JYOTHSNA");
			System.out.println("******************************");
			System.out.println("Executing " + this.getClass());
		}
	    public void showMenu()
	    {
	        System.out.println("----------------------------------");
	        System.out.println("0.Exit");
	        System.out.println("1. Reading a file");
	        System.out.println("2. Writing to a file");
	        System.out.println("3. Appending to a file");
	        
	        System.out.println("----------------------------------");
	        System.out.print("Enter your choice : ");

	    }
	    
	    public int getChoice() throws IOException
	    {
	        int val=0;
	        try
	        {

	            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	            val = Integer.parseInt(br.readLine());
	            System.out.println("----------------------------------");
	        }
	        catch (IOException e)
	        {
	            System.out.println(e);
	        }
	        return val;
	    }

		public static void main(String args[])
	    {
	        Main cc = new Main();
	        try
	        {

	            int ch = 1;

	            while (ch != 0 )
	            {
	                cc.showMenu();
	                ch = cc.getChoice();
	                
	                if(ch == 0) {
	                	return ;
	                }
	                if(ch > 3 || ch < 0) {
	                	System.out.println("You've entered incorrect option!!!\n \t Choose AGAIN...");
	                	continue;
	                }

					switch (ch)
	                {
	                    case 1:
	                       ReadFromFile read = new ReadFromFile();
	                       read.readFromFile();
	                        break;
	                    case 2:
	                    	WriteToFile write = new WriteToFile();
		                    write.writeToFile();
	                        break;
	                    case 3:
	                        AppendToFile append = new AppendToFile();
	                        append.appendToFile();
	                        break;
	                    case 0:
	                        return ; 
	                    
	                }
	                System.out.println("----------------------------------");
	            }

	                
	        }
	        catch (Exception e) 
	        {
	            System.out.println("ERROR : " + e) ;
	            e.printStackTrace();
	            
	        }
	        finally {
	        	System.out.println("Closing main application");
	        }
	}

}
