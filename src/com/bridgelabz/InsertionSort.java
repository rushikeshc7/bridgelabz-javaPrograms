package com.bridgelabz;

import java.util.Scanner;

import utility.Utility;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Utility u=new Utility();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of words:");
        int n=sc.nextInt();
        System.out.println("Enter words:");
        String arr[]=new String[n];
        for(int i=0;i<n;i++)
        {
        	arr[i]=sc.next();
        }
        u.insertion(arr, n);
	}

}
