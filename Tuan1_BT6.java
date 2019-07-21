//Bui Phu Khuyen 
//1611061839
//Bai tap Tuan 1 BT6
//Tao Chuong trinh Xuat tri Binh phuong, Lap Phuong tu 1 - 10
import java.io.*;
import java.util.Scanner;

class Bai6 {
	public static void main (String[] args) {
		System.out.println("TRI BINH PHUONG TU 1 DEN 10");
			for(int i = 1 ; i < 11 ; i++)
				System.out.print("\t" + (i*i));
		System.out.println();
		System.out.println("TRI LAP PHUONG TU 1 DEN 10");
			for(int i = 1 ; i < 11 ; i++)
				System.out.print("\t" + (i*i*i));		
	}	
}