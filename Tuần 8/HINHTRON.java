package Tuan8;

import java.util.Scanner;

public class HINHTRON implements HINH{
    private double bankinh;

    public HINHTRON() {
        bankinh = 0;
    }

    public HINHTRON(double bankinh) {
        this.bankinh = bankinh;
    }

    @Override
    public void nhap() {
        Scanner x = new Scanner(System.in);
        System.out.print("Nhap ban kinh hinh tron: ");
        bankinh = x.nextDouble();
    }

    @Override
    public void xuat() {
        System.out.println("- Hinh tron co ban kinh la: " + bankinh);
    }

    @Override
    public double dientich() {
        return 2*Pi*bankinh;
    }
}
