//Bui Phu Khuyen 
//1611061839
//Bai tap Tuan 1 BT10
//Tao Chuong trinh Nhap ma tran bat ky. Tinh tong hang thu k cua ma tran
import java.io.*;
import java.util.Scanner;
import java.lang.*;

class Bai10 {
	public static void main (String[] args) {
		Scanner x = new Scanner(System.in);
		
		// Nhap so dong, cot
		System.out.print("Nhap so dong = ");
		int d = x.nextInt(); 
		System.out.print("Nhap so cot = ");
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
		
		//Tinh tong hang k cac phan tu trong mang
		int k;
		System.out.print("Nhap hang k:");
		k = x.nextInt();
		double S = 0;
		for(int j = 0 ; j < c ; j++) {
				S = S + a[k-1][j];	
			}
	
		System.out.println("TONG CAC HANG THU " + k + " TRONG MANG LA:" + S);
	}
}
