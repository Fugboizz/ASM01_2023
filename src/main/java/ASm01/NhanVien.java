/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASm01;

import java.util.Scanner;

/**
 *
 * @author WINDOWS10
 */
public class NhanVien {

    Scanner sc = new Scanner(System.in);
    private String maNV;
    private String hoTen;
    private double luong;
    private String loaiNV;

    public NhanVien(String maNV, String hoTen, double luong, String loaiNV) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luong = luong;
        this.loaiNV = loaiNV;
    }

    public NhanVien() {
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public String getLoaiNV() {
        return loaiNV;
    }

    public void setLoaiNV(String loaiNV) {
        this.loaiNV = loaiNV;
    }

    public double getThuNhap() {
        return this.luong;
    }

    public double getTinhThue() {
        if (luong < 9000000) {
            return 0;
        } else if (luong <= 15000000) {
            return (luong - 9000000) * 0.1;
        } else {
            return ((luong - 15000000) + (luong - 9000000)) * 0.12;
        }
    }

    public void nhap() {
        System.out.println("Nhap ma nhan vien");
        maNV = sc.nextLine();
        System.out.println("Nhap ho va ten : ");
        hoTen = sc.nextLine();
        System.out.println("Nhap Luong : ");
        luong = Double.parseDouble(sc.nextLine());
    }

    public void xuat() {
        System.out.println("Ma nhan vien: " + maNV);
        System.out.println("Ho va ten: " + hoTen);
        System.out.println("Chuc vu: " + loaiNV);
        System.out.println("Luong co ban: " + luong);
    }

}
