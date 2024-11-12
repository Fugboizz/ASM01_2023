/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASm01;

/**
 *
 * @author WINDOWS10
 */
public class TruongPhong extends NhanVien {

    private double luongTrachNhiem;

    public TruongPhong(double luongTrachNhiem, String maNV, String hoTen, double luong, String loaiNV) {
        super(maNV, hoTen, luong, loaiNV);
        this.luongTrachNhiem = luongTrachNhiem;
    }

    public TruongPhong() {
    }

    public double getLuongTrachNhiem() {
        return luongTrachNhiem;
    }

    public void setLuongTrachNhiem(double luongTrachNhiem) {
        this.luongTrachNhiem = luongTrachNhiem;
    }

    @Override
    public double getThuNhap() {
        return super.getLuong() + this.luongTrachNhiem;
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Luong trach nhiem la: " + luongTrachNhiem);
    }
}
