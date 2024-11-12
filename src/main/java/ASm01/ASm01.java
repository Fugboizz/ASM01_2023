/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ASm01;

import java.util.Scanner;

/**
 *
 * @author WINDOWS10
 */
public class ASm01 {

    /**
     * @param args the command line arguments
     */
    private static ServiceNhanVien svnv = new ServiceNhanVien();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chao Mung Ban Đen Voi Phan Mem Quan Ly\n");
        System.out.println("+=============================================+^");
        System.out.println("| 1. Nhap Danh Sach Nhan Vien                 |");
        System.out.println("| 2. Xuat Danh Sach Nhan Vien                 |");
        System.out.println("| 3. Tim va Hien Thi Nhan Vien Theo Ma        |");
        System.out.println("| 4. Xoa Nhan Vien Theo Ma                    |");
        System.out.println("| 5. Cap Nhat Thong Tin Nhan Vien Theo Ma     |");
        System.out.println("| 6. Tim Kiem Nhan Vien Theo Khoang Luong     |");
        System.out.println("| 7. Sap Xep Nhan Vien Theo Ho Ten            |");
        System.out.println("| 8. Sap Xep Nhan Vien Theo Thu Nhap          |");
        System.out.println("| 9. Xuat 5 Nhan Vien Co Thu Nhap Cao Nhat    |");
        System.out.println("| 10. Thoat                                   |");
        System.out.println("+=============================================+");
        int a = 0;
        do {
            System.out.printf("Vui Long Chon Chuc Nang: ");
            try {
                a = Integer.parseInt(sc.nextLine());

                switch (a) {
                    case 1:
                        System.out.println("1. Nhap Danh Sach Nhan Vien");
                        svnv.nhap();
                        break;
                    case 2:
                        System.out.println("2. Xuat Danh Sach Nhan Vien");
                        svnv.xuat();
                        break;

                    case 3:
                        System.out.println("3. Tim va Hien Thi Nhan Vien Theo Ma");
                        svnv.timKiem();
                        break;

                    case 4:
                        System.out.println("4. Xoa Nhan Vien Theo Ma ");
                        svnv.xoaNhanVien();
                        break;

                    case 5:
                        System.out.println("5. Cap Nhat Thong Tin Nhan Vien Theo Ma");
                        svnv.capNhatThongTin();
                        break;

                    case 6:
                        System.out.println("6. Tim Kiem Nhan Vien Theo Khoang Luong");
                        System.out.println("Nhap luong toi da: ");
                        double giaTren = Double.parseDouble(sc.nextLine());
                        System.out.println("Nhap Luong Toi Thieu: ");
                        double giaDuoi = Double.parseDouble(sc.nextLine());
                        svnv.TimKiemTheoKhoangLuong(giaTren, giaDuoi);
                        break;

                    case 7:
                        System.out.println("7. Sap Xep Nhan Vien Theo Ho Ten");
                        svnv.sapXepTheoHoTen();
                        break;

                    case 8:
                        System.out.println("8. Sap Xep Nhan Vien Theo Thu Nhap");
                        svnv.sapXepTheoThuNhap();
                        break;

                    case 9:
                        System.out.println("9. Xuat 5 Nhan Vien Co Thu Nhap Cao Nhat");
                        svnv.xuat5NhanVien();
                        break;

                    case 10:
                        System.out.println("10. Ban Da Thoat Chuong Trinh");
                        break;
                    default:
                        System.out.println("Ban Da Nhap Sai Vui Long Chon Lai");
                }
            } catch (NumberFormatException e) {
                System.out.println("Nhap Sai Hay Nhap Lai");

            }
        } while (a != 10);

    }
}
