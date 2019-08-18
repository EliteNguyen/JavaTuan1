//Bui Phu Khuyen 
//1611061839
//Bai tap Tuan 1 BT9
//Tao Chuong trinh Xuat 100 so Fibonacci dau tien
import java.io.*;
import java.util.Scanner;


class Bai9 {
	public static void main (String[] args) {
		System.out.println("100 so dau tin trong day Fibonacci la:");
		for(int i  = 1 ; i < 90; i++)
			System.out.print(fibonacci(i) + "\t");
	
	}
	public static long fibonacci(int n)
	{
		long  f0 = 0;
		long f1 = 1;
		long fn = 1;
		if(n == 1)
			return n;
		for(int i = 2 ; i < n  ; i++) {
			f0 = f1;
			f1 = fn;
			fn = f0 + f1;	
		}
		return fn;
	}
	}
