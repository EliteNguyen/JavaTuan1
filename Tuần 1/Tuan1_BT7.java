//Bui Phu Khuyen 
//1611061839
//Bai tap Tuan 1 BT7
//Tao Chuong trinh tao mang so nguyen, xuat mang tang dan
import java.io.*;
import java.util.Scanner;
import java.lang.*;

class Bai7 {
	public static void main (String[] args) {
		int a[] = new int[11];
		
		///Random mang 1 chieu 10 phan tu
		for(int i = 0 ; i < 11 ; i++) 
		{
			a[i]= (int)(Math.random()*50);	
		}
		/// Xuat mang
		System.out.println("MANG SAU KHI RANDOM");
		for(int i = 0 ; i < 11 ; i++) 
		{
			System.out.print("\t" + a[i]);	
		}
		
		//Sap xep mang
		for(int i = 0 ; i < 10 ; i++)
			for(int j = i + 1 ; j < 11 ; j++)
				if(a[i] > a[j]) {
					int temp;
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
		//Xuat mang sau khi sap xep
		System.out.println();		
		System.out.println("MANG SAU KHI SAP XEP");
			for(int i = 0 ; i < 11 ; i++) 
			{
				System.out.print("\t" + a[i]);	
			}
	}
}