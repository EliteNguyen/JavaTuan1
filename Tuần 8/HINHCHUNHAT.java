package Tuan8;

import java.util.Scanner;

public class HINHCHUNHAT implements HINH{
    private double dai, rong;

    public HINHCHUNHAT() {
        dai = rong = 0;
    }

    public HINHCHUNHAT(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }
    
    @Override
    public void nhap() {
        Scanner x = new Scanner(System.in);
        System.out.print("Nhap chieu dai HCN: ");
        dai = x.nextDouble();
        System.out.print("Nhap chieu rong HCN: ");
        rong = x.nextDouble();
    }
    
    @Override
    public void xuat() {
        System.out.println("- HCN co chieu dai la: " + dai + ". Chieu rong la: " + rong);
    }
    
    @Override
    public double dientich() {
        return dai * rong;
    }
}
