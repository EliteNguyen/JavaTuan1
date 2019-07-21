//Bui Phu Khuyen 
//1611061839
//Bai tap Tuan 1 BT3 
//Tao Chuong trinh Nhap 1 mang so nguyen. Tim Max trong mang
import java.io.*;
import java.util.Scanner;

class Bai3 {
	public static void main (String[] args) {
		int a[], n;
		Scanner x = new Scanner(System.in);
		System.out.println("Nhap n = ");
		n = x.nextInt();
		a = new int[n];
		for(int i = 0 ; i < n ; i++) 
		{
			System.out.println("Nhap phan tu a[" + i + "]=");
			a[i]= x.nextInt();
		}
		int max = a[0];
		for(int i = 1 ; i < n ; i++)
		{
			if(max < a[i])
				max = a[i];
		}
		System.out.println("Phan tu lon nhat trong mang la:" + max);
	}
}