package Tuan8;

import java.util.Scanner;

public class HINHVUONG implements HINH {
    private double canh;

    public HINHVUONG() {
        canh = 0;
    }

    public HINHVUONG(double canh) {
        this.canh = canh;
    }
    
    @Override
    public void nhap() {
        Scanner x = new Scanner(System.in);
        System.out.print("Nhap canh hinh vuong: ");
        canh = x.nextDouble();
    }
    
    @Override
    public void xuat() {
        System.out.println("- Hinh vuong co canh la: " + canh);
    }
    
    @Override
    public double dientich() {
        return canh*canh;
    }
}
