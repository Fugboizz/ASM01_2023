/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AssignmentGD2;

import java.util.Scanner;

/**
 *
 * @author Kung
 */
public class TiepThi extends NhanVien{
    private double doanhSo;
    private double tiLeHoaHong;
    
    Scanner sc = new Scanner(System.in);

    public TiepThi(double doanhSo, double tiLeHoaHong, String id, String name, String cv, double luongCoBan) {
        super(id, name, cv, luongCoBan);
        this.doanhSo = doanhSo;
        this.tiLeHoaHong = tiLeHoaHong;
    }

    public TiepThi(double doanhSo, double tiLeHoaHong) {
        this.doanhSo = doanhSo;
        this.tiLeHoaHong = tiLeHoaHong;
    }

    public TiepThi() {
    }

    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getTiLeHoaHong() {
        return tiLeHoaHong;
    }

    public void setTiLeHoaHong(double tiLeHoaHong) {
        this.tiLeHoaHong = tiLeHoaHong;
    }
    
    public void inptt(){
        System.out.print("- Doanh số bán hàng : ");
        doanhSo = Double.parseDouble(sc.nextLine());
        System.out.print("- Tỉ lệ hoa hồng (%) : ");
        tiLeHoaHong = Double.parseDouble(sc.nextLine());
    }
}
