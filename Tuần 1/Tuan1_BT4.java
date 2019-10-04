//Bui Phu Khuyen 
//1611061839
//Bai tap Tuan 1 BT4
//Tao Chuong trinh ma tran, (Sinh ngau nhien gia tri), Xuat - Tinh Tong gia tri phan tu cua ma tran
import java.io.*;
import java.util.Scanner;
import java.lang.*;

class Bai4 {
	public static void main (String[] args) {
		Scanner x = new Scanner(System.in);
		
		// Nhap so dong, cot
		System.out.println("Nhap so dong = ");
		int d = x.nextInt(); 
		System.out.println("Nhap so cot = ");
		int c = x.nextInt();
		
		//Cap phat bo nho mang 2 chieu	
		int a[][];
		a = new int[d][];
		for(int i = 0 ; i < d ; i++)
		{
			a[i] = new int[c];
		}
		
		//Sinh gia tri ngau nhien cho mang 2 chieu
		for(int i = 0 ; i < d ; i++) {
			for(int j = 0 ; j < c ; j++) {
				a[i][j] = (int) (Math.random()*51);	
			}	
		}
				
		//Xuat mang 2 chieu
		System.out.println("MANG SAU KHI RANDOM");
		for(int i = 0 ; i < d ; i++) {
			for(int j = 0 ; j < c ; j++) {
				System.out.print("\t" + a[i][j]);	
			}	
				System.out.println("\n");
		}
		
		//Tinh tong cac phan tu trong mang
		double S = 0;
		for(int i = 0 ; i < d ; i++) {
			for(int j = 0 ; j < c ; j++) {
				S = S + a[i][j];	
			}
		}
		System.out.println("TONG CAC PHAN TU TRONG MANG:" + S);
	}
}
