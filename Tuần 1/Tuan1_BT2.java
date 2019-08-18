//Bui Phu Khuyen 
//1611061839
//Bai tap Tuan 1 BT2 
//Tao Chuong trinh nhap Thong tin 1 Sinh vien
import java.io.*;
import java.util.Scanner;

class Bai2 {
	public static void main (String[] args) {
			///Input
			Scanner x = new Scanner(System.in);
			System.out.println("Nhap thong tin sinh vien:");
			System.out.println("Ma Sinh vien:");		
			String MaSV = x.nextLine();
			System.out.println("Ho va ten:");
			String HoTen = x.nextLine();
			System.out.println("Tuoi:");
			int Tuoi = x.nextInt();
			System.out.println("Nam sinh:");
			int NamSinh = x.nextInt();
			System.out.println("Diem Trung Binh:");
			float DTB = x.nextFloat();		
			///Output
			System.out.println("THONG TIN SINH VIEN:");
			System.out.println("Ma Sinh vien:" + MaSV);
			System.out.println("Ho va ten:" + HoTen);
			System.out.println("Tuoi:" + Tuoi);
			System.out.println("Nam sinh:" + NamSinh);
			System.out.println("Diem Trung Binh:" + DTB);	
	}
}
