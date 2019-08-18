package Tuan8;

import java.util.Scanner;

public class DEMO {
    public static void main(String[] args) {
        int n;
        Scanner x = new Scanner(System.in);
        System.out.print("Nhap so luong hinh: ");
        n = x.nextInt();
        HINH dsh[] = new HINH[n];
        for(int i = 0; i < n; i++) {
            System.out.println("1: Hinh vuong");
            System.out.println("2: Hinh chu nhat");
            System.out.println("3: Hinh tron");
            int chon;
            System.out.print("Chon loai hinh se nhap: ");
            chon = x.nextInt();
            switch(chon) {
                case 1: dsh[i] = new HINHVUONG();
                        dsh[i].nhap();
                        break;
                case 2: dsh[i] = new HINHCHUNHAT();
                        dsh[i].nhap();
                        break;
                case 3: dsh[i] = new HINHTRON();
                        dsh[i].nhap();
                        break;
                default: System.out.println("Ban phai chon 1 trong 3 loai tren");
                break;
            }
        }
        for(int i = 0; i < n ;i++) {
            dsh[i].xuat();
            System.out.println("   Dien tich: " + dsh[i].dientich());
        }
    }
}
