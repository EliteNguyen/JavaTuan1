//Bui Phu Khuyen 
//1611061839
//Bai tap Tuan 7 BT1 
//Quan ly cac doi tuong trong mot Hoc vien (NVQL, NVNC, NVPV)
package BTTuan7;
import java.io.*;
import java.util.Scanner;

abstract class NV {
	protected String MaNV, TenNV, TrinhDo;
	protected static double LuongCB;
	public NV() {
		MaNV = TenNV = TrinhDo = null;
		LuongCB = 0;
	}
	public NV(String MaNV, String TenNV, String TrinhDo, double LuongCB) {
		this.MaNV = MaNV;
		this.TenNV = TenNV;
		this.TrinhDo = TrinhDo;
		this.LuongCB = LuongCB;
	}
	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap Ma Nhan vien: ");
		MaNV = sc.nextLine();
		System.out.print("Nhap Ten Nhan vien: ");
		TenNV = sc.nextLine();		
		System.out.print("Nhap Trinh Do: ");
		TrinhDo = sc.nextLine();
		System.out.print("Nhap Luong CB: ");
		LuongCB = sc.nextDouble();	
	}
	public void Xuat() {
		System.out.println(" - Ma Nhan vien: " + MaNV);
		System.out.println(" - Ten Nhan vien: " + TenNV);	
		System.out.println(" - Trinh Do: " + TrinhDo);
		System.out.println(" - Luong CB: " + LuongCB);
	}
	abstract double TinhLuong();	
}
class NVQL extends NV {
	private String ChuyenMon;
	private double  PhuCapCV;
	public NVQL() {
		super();
		ChuyenMon = null;
		PhuCapCV = 0;
	}
	public NVQL(String MaNV, String TenNV, String TrinhDo, double LuongCB, String ChuyenMon, double PhuCapCV) {
		super(MaNV,TenNV,TrinhDo,LuongCB);
		this.ChuyenMon = ChuyenMon;
		this.PhuCapCV = PhuCapCV;
	}
	public void Nhap() {
		super.Nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap Chuyen mon: ");
		ChuyenMon = sc.nextLine();
		System.out.print("Nhap Phu cap CV: ");
		PhuCapCV = sc.nextDouble();		
	}
	public void Xuat() {
		super.Xuat();
		System.out.println(" - Chuyen mon: " + ChuyenMon);
		System.out.println(" - Phu cap CV: " + PhuCapCV);
		System.out.println(" - Luong: " + TinhLuong());		
	}
	public double TinhLuong() {
		return LuongCB + PhuCapCV;
	}
}
class NVNC extends NV {
	private String ChuyenMon;
	private double PhuCapDH;
	public NVNC() {
		super();
		ChuyenMon = null;
		double PhuCapDH;
	}
	public NVNC(String MaNV, String TenNV, String TrinhDo, double LuongCB, String ChuyenMon, double PhuCapDH) {
		super(MaNV,TenNV,TrinhDo,LuongCB);
		this.ChuyenMon = ChuyenMon;
		this.PhuCapDH = PhuCapDH;
	}
	public void Nhap() {
		super.Nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap Chuyen mon: ");
		ChuyenMon = sc.nextLine();
		System.out.print("Nhap Phu cap DH: ");
		PhuCapDH = sc.nextDouble();			
	}
	public void Xuat() {
		super.Xuat();
		System.out.println(" - Chuyen mon: " + ChuyenMon);
		System.out.println(" - Phu cap DH: " + PhuCapDH);
		System.out.println(" - Luong: " + TinhLuong());			
	}
	public double TinhLuong () {
		return LuongCB + PhuCapDH;
	} 
}
class NVPV extends NV {
	public NVPV() {
		super();
	}
	public NVPV(String MaNV, String TenNV, String TrinhDo, double LuongCB) {
		super(MaNV,TenNV,TrinhDo,LuongCB);
	}
	public void Nhap() {
		super.Nhap();
	}
	public void Xuat() {
		super.Xuat();
		System.out.println(" - Luong: " + TinhLuong());			
	}
	public double TinhLuong() {
		return LuongCB;
	}
}
class Demo {
	public static void main (String[] args) {
		NV nv = new NVQL();
	//	nv.Nhap();
	//	nv.Xuat();
		nv = new NVNC("1611061839","Bui Phu Khuyen","Dai hoc",1200000,"CNTT",500000);
		nv.Xuat();
		nv = new NVPV();
		nv.Nhap();
		nv.Xuat();
	}
}