/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASm01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author WINDOWS10
 */
public class ServiceNhanVien {
    Scanner sc = new Scanner(System.in);
    ArrayList<NhanVien> NhanVienSV = new ArrayList<>();
    public void nhap() {
        int choose = 0;
        do {
            System.out.println("Nhap ma nhan vien");
            String maNV = sc.nextLine();
            System.out.println("Nhap ho va ten : ");
            String hoTen = sc.nextLine();
            System.out.println("Nhap Luong : ");
            double luong = Double.parseDouble(sc.nextLine());
            System.out.println("Nhan vien thuoc |1.HanhChinh|2.TiepThi|3.TruongPhong: ");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    String loaiNV = "HanhChinh";
                    NhanVien hc = new NhanVien(maNV, hoTen, luong, loaiNV);
                    NhanVienSV.add(hc);
                    break;
                case 2:
                    loaiNV = "TiepThi";
                    System.out.println("Nhap doanh so: ");
                    double doanhSo = Double.parseDouble(sc.nextLine());
                    System.out.println("Nhap Hoa Hong: ");
                    double hoaHong = Double.parseDouble(sc.nextLine());
                    NhanVien tt = new TiepThi(doanhSo, hoaHong, maNV, hoTen, luong, loaiNV);
                    NhanVienSV.add(tt);
                    break;
                case 3:
                    loaiNV = "TruongPhong";
                    System.out.println("Nhap Luong Trach Nhiem: ");
                    double luongTrachNhiem = Double.parseDouble(sc.nextLine());
                    NhanVien tp = new TruongPhong(luongTrachNhiem, maNV, hoTen, luong, loaiNV);
                    NhanVienSV.add(tp);
                    break;
                default:
                    System.out.println("Ban da nhap sai vui long nhap lai|1.HanhChinh|2.TiepThi|3.TruongPhong ");
            }
            System.out.println("Ban co muon thoat khong Y/N");
            String n = sc.nextLine();
            if (n.equalsIgnoreCase("y")) {
                break;
            }
        } while (choose <= 3);
    }

    public void xuat() {
        for (NhanVien nhanVien : NhanVienSV) {
            nhanVien.xuat();
        }

    }

    public void timKiem() {
        System.out.println("Nhap ma nhan vien can tim kiem: ");
        ArrayList<NhanVien> arrayListnv = new ArrayList<>();
        String timKiem = sc.nextLine();
        for (NhanVien nhanVien : NhanVienSV) {
            if (nhanVien.getMaNV().equalsIgnoreCase(timKiem)) {
                arrayListnv.add(nhanVien);
            }
        }
        if (arrayListnv.isEmpty()) {
            System.out.println("Nhan vien ban tim kiem khong co");
        } else {
            for (NhanVien nhanVien1 : arrayListnv) {
                nhanVien1.xuat();
            }
        }
    }

    public void xoaNhanVien() {
        System.out.println("Nhap ma nhan vien can xoa: ");
        String timKiem = sc.nextLine();
        for (NhanVien nhanVien : NhanVienSV) {
            if (nhanVien.getMaNV().equalsIgnoreCase(timKiem)) {
                boolean remove;
                remove = NhanVienSV.remove(nhanVien);
                System.out.println("Da xoa thanh cong");
                break;
            } else {
                System.out.println("Khong tim thay nhan vien can xoa");
            }
        }
    } 

    public void capNhatThongTin() {
        System.out.println("Nhap ma nhan vien can cap nhat: ");
        String timKiem = sc.nextLine();
        for (NhanVien nhanVien : NhanVienSV) {
            if (nhanVien.getMaNV().equalsIgnoreCase(timKiem)) {
                System.out.println("Nhap gia tri moi cho luong : ");
                nhanVien.setLuong(Double.parseDouble(sc.nextLine()));
                System.out.println("Chon chuc vu can cap nhat : ");
                System.out.println("|1.HanhChinh /t |2.TiepThi /t |3.TruongPhong");
                int chon = Integer.parseInt(sc.nextLine());
                switch (chon) {
                    case 1:
                        String loaiNV = "HanhChinh";
                    case 2:
                        loaiNV = "TiepThi";
                        System.out.println("Nhap Hoa Hong: ");
                        ((TiepThi) nhanVien).setHoaHong(Double.parseDouble(sc.nextLine()));
                        System.out.println("Nhap Doanh So: ");
                        ((TiepThi) nhanVien).setDoanhSo(Double.parseDouble(sc.nextLine()));
                        break;
                    case 3:
                        loaiNV = "TruongPhong";
                        System.out.println("Nhap Luong Trach Nhiem: ");
                        ((TruongPhong) nhanVien).setLuongTrachNhiem(Double.parseDouble(sc.nextLine()));
                        break;
                    default:
                        System.out.println("Ban da nhap sai vui long nhap lai|1.HanhChinh|2.TiepThi|3.TruongPhong ");
                }

            } else {
                System.out.println("Nhan vien can tim khong co");
            }

        }
    }

    public void TimKiemTheoKhoangLuong(double giaTren, double giaDuoi) {
        for (NhanVien nhanVien : NhanVienSV) {
            if (nhanVien.getLuong() >= giaTren && nhanVien.getLuong() <= giaDuoi) {
                System.out.println("Nhan vien can tim la: ");
                nhanVien.xuat();
            } else {
                System.out.println("Khong tim thay nhan vien can tim");
            }
        }
    }

    public void sapXepTheoHoTen() {
        Collections.sort(NhanVienSV, Comparator.comparing(NhanVien::getHoTen));
        for (NhanVien nhanVien : NhanVienSV) {
            nhanVien.xuat();

        }
    }

    public void sapXepTheoThuNhap() {
        Collections.sort(NhanVienSV, Comparator.comparing(NhanVien::getThuNhap));
        for (NhanVien nhanVien : NhanVienSV) {
            nhanVien.xuat();
        }
    }

    public void xuat5NhanVien() {
        int count = 0;
        Collections.sort(NhanVienSV, Comparator.comparing(NhanVien::getThuNhap));
        for (NhanVien nhanVien : NhanVienSV) {
            if (count <= 5) {
                nhanVien.xuat();
                count++;
            }

        }
    }

 
}
