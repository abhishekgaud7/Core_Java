package com.simple;

public class ArrayDemo 
{

		/*
		 * types of array 
		 * 
		 *   1 single dimensation
		 *   2 multiple dimensation
		 *   
		 *   matrix
		 *   
		 *   int a[][] = new int[3][3];    //10 20  30
		 *             0   1    2
		 *   0         00  01   02
		 *   1         10   11   12
		 *   2         20   21    22
		 * 
		 */
		public static void main(String[] args) 
		{
			
			
			int a[][] = new int[3][3];
			
			a[0] [0]=10;
			a[0] [1]=20;
			a[0] [2]=30;
			a[1] [0]=40;
			a[1] [1]=50;
			a[1] [2]=60;
			a[2] [0]=70;
			a[2] [1]=80;
			a[2] [2]=90;
			
			System.out.println(a[1] [2]);

		}

}
