package com.bridgelabz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import utility.Utility;

public class BinarySearch {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        Utility u=new Utility();
        String ch;
    	String str = " ";
    	String strArr[];
    	FileReader fr = null;
        try {
    	   fr = new FileReader("file.txt");
    	   BufferedReader br= new BufferedReader(fr);
    	   while((ch = br.readLine()) != null)
           {
           	System.out.print(ch);
           	str = str + ch;
            }
    	   br.close();
    	fr.close();
    	}
        catch(FileNotFoundException e)
    	{
        	e.printStackTrace();
    	}
    
        strArr = str.split(" ");
        u.bubbleSortStr(strArr, strArr.length);
        for(int i=0;i<strArr.length;i++)
        {
        	System.out.print(strArr[i] + " ");
        }
        System.out.println("\nEnter the word you want to search:");
	        String x = u.inputString();
	       
	        if(u.binarySearchWord(strArr, x) != -1)
		     	System.out.println("String found");
	        else
		     	System.out.println("String not found");
	}
}
