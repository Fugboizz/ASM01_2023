/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASm01;

/**
 *
 * @author WINDOWS10
 */
public class TiepThi extends NhanVien {

    private double doanhSo;
    private double hoaHong;

    public TiepThi(double doanhSo, double hoaHong, String maNV, String hoTen, double luong, String loaiNV) {
        super(maNV, hoTen, luong, loaiNV);
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }

    public TiepThi() {
    }

    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getHoaHong() {
        return hoaHong;
    }

    public void setHoaHong(double hoaHong) {
        this.hoaHong = hoaHong;
    }

    @Override
    public double getThuNhap() {
        return super.getLuong() + ((doanhSo * hoaHong) / 100);
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Ty le hoa hong la: " + hoaHong);
        System.out.println("Doanh so la: " + doanhSo);

    }
}
