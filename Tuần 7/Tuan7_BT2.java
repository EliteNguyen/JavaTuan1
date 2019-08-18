//Bui Phu Khuyen 
//1611061839
//Bai tap Tuan 7 BT2 
//Xay dung lop DSNV de quan ly danh sach nhan vien cua hoc vien. Tinh tong luong cua tat ca nhan vien co trong hoc vien
package BTTuan7;
import java.io.*;
import java.util.Scanner;

class DSNV {
	int SL;
	NV DS[];
	public DSNV() {
		SL = 0;
		DS = new NV[100];
	}
	public void Nhap(byte Loai) {
		if(Loai == 1) {
			DS[SL] = new NVQL();
			DS[SL].Nhap();
		}
		if(Loai == 2) {
			DS[SL] = new NVNC();
			DS[SL].Nhap();	
		}
		if(Loai == 3) {
			DS[SL] = new NVPV();
			DS[SL].Nhap();
		}
		SL++;
	}
	public void Xuat(byte Loai){
		if(Loai==1){
			for(int i = 0 ; i < SL ; i++){
				if(DS[i] instanceof NVQL){
					DS[i].Xuat();
				}
			}
		}
		else 
			if(Loai==2) {
				for(int i = 0 ;i < SL ; i++){
					if(DS[i] instanceof NVNC){
					DS[i].Xuat();
					}
				}
			}
		else
		{
			for(int i = 0 ; i < SL ; i++) {
				if(DS[i] instanceof NVPV) {
					DS[i].Xuat();
				}
			}
		}
	}
	public long TongLuong() {
		long TongLuong = 0;
		for(int i = 0 ; i < SL ; i++) {
			TongLuong += DS[i].TinhLuong();
		}
	return TongLuong;
	}
}		


class Demo2 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		byte Chon;
		DSNV DS = new DSNV();
		do {
			System.out.println("------------MENU------------");
			System.out.println("1: Them mot Nhan vien vao danh sach");
			System.out.println("2: Xuat Nhan vien theo loai");
			System.out.println("3: Tinh Tong luong cua Nhan vien:");
			System.out.println("0: Thoat");
			System.out.print("Moi ban chon Menu: ");
			Chon = sc.nextByte();
			sc.nextLine();
			switch(Chon) {
				case 1: {
					System.out.println("NHAP DANH SACH NHAN VIEN");
					System.out.println(" + 1: Nhap Nhan vien Quan ly " + "\n" + " + 2: Nhap Nhap Nhan vien Nghien cuu" + "\n" + " + 3: Nhap Nhap Nhan vien Phuc vu" );
					System.out.print("Hay Chon loai Nhan vien:");
					byte Loai = sc.nextByte();
					DS.Nhap(Loai);
					break;
				}
				case 2: {
					System.out.println("XUAT DANH SACH NHAN VIEN)");
					System.out.println(" + 1: Nhap Nhan vien Quan ly " + "\n" + " + 2: Nhap Nhap Nhan vien Nghien cuu" + "\n" + " + 3: Nhap Nhap Nhan vien Phuc vu");
					byte Loai = sc.nextByte();
					DS.Xuat(Loai);
					break;
				}
				case 3: {
					System.out.println("TONG LUONG NHAN VIEN:" + DS.TongLuong());
					break;
				}
				default: Chon = 0; break;
			}
		}while(Chon!=0);
		
	}
}