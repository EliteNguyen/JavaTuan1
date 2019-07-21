//Bui Phu Khuyen 
//1611061839
//Bai tap Tuan 1 BT5 
//Tao Chuong trinh xuat bang cuu chuong tu 2 - 9
import java.io.*;
import java.util.Scanner;

class Bai5 {
	public static void main (String[] args) {
		System.out.println("BANG CUU CHUONG");
			for(int i = 2 ; i < 10 ; i++)
			{
				System.out.println("BANG NHAN" + i);
				for(int j = 1 ; j < 10 ; j++)
				{
					System.out.println(i + "x" + j + "=" + (i*j));
				}
				System.out.println();
			}

	}
}