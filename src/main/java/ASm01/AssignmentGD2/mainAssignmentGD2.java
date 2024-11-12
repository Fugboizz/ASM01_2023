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
public class mainAssignmentGD2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVienService qly = new NhanVienService();
       // inmenu();
        //qly.inpdefault();
        int menu;
        do {
            inmenu();
            System.out.println("===============================================");
            System.out.print("Mời bạn chọn chức năng: ");
            menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 11 -> {
                    qly.inpdefault();
                    System.out.println("Tự động thêm dữ liệu.");
                }
                case 1 -> {
                    System.out.println("Y1: Nhập danh sách nhân viên từ bàn phím.");
                    qly.inp();
                }
                case 2 -> {
                    System.out.println("Y2: Xuất danh sách nhân viên ra màn hình.");
                    qly.out();
                }
                case 3 -> {
                    System.out.println("Y3 : Tìm và hiển thị nhân viên theo mã nhập từ bàn phím.");
                    qly.findnv();
                }
                case 4 -> {
                    System.out.println("Y4 : Xóa nhân viên theo mã nhập từ bàn phím. ");
                    qly.delete();
                }
                case 5 -> {
                    System.out.println("Y5 : Cập nhật thông tin nhân viên theo mã nhập từ bàn phím.");
                    qly.update();
                }
                case 6 -> {
                    System.out.println("Y6 : Tìm các nhân viên theo khoảng lương nhập từ bàn phím.");
                    qly.findluong();
                }
                case 7 -> {
                    System.out.println("Y7 : Sắp xếp nhân viên theo họ và tên.");
                    qly.alphab();
                    qly.out();
                }
                case 8 -> {
                    System.out.println("Y8 : Sắp xếp nhân viên theo thu nhập.");
                    qly.sxthunhap();
                    qly.out();
                }
                case 9 -> {
                    System.out.println("Y9 : Xuất 5 nhân viên có thu nhập cao nhất.");
                    qly.top5();
                }
                case 0 -> {
                    System.out.println("Kết thúc trương trình.");
                }
                default -> {
                    System.out.println("Vui lòng nhập 0-9.");
                }
            }
        } while (menu != 0);
    }

    public static void inmenu() {
        System.out.println("===============================================");
        System.out.println("\t\tMenu:");
        System.out.println("Y1 : Nhập danh sách nhân viên từ bàn phím.");
        System.out.println("Y2 : Xuất danh sách nhân viên ra màn hình.");
        System.out.println("Y3 : Tìm và hiển thị nhân viên theo mã nhập từ bàn phím.");
        System.out.println("Y4 : Xóa nhân viên theo mã nhập từ bàn phím. ");
        System.out.println("Y5 : Cập nhật thông tin nhân viên theo mã nhập từ bàn phím.");
        System.out.println("Y6 : Tìm các nhân viên theo khoảng lương nhập từ bàn phím.");
        System.out.println("Y7 : Sắp xếp nhân viên theo họ và tên.");
        System.out.println("Y8 : Sắp xếp nhân viên theo thu nhập.");
        System.out.println("Y9 : Xuất 5 nhân viên có thu nhập cao nhất.");
    }
}
