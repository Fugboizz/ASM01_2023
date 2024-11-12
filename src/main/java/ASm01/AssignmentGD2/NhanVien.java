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
public class NhanVien {

    private String id;
    private String name;
    private String cv;
    private double luongCoBan;
    private double thuNhap;
    private boolean checkprint;

    Scanner sc = new Scanner(System.in);

    public NhanVien(String id, String name, String cv) {
        this.id = id;
        this.name = name;
        this.cv = cv;
    }
    
    public NhanVien(String id, String name, String cv, double luongCoBan) {
        this.id = id;
        this.name = name;
        this.cv = cv;
        this.luongCoBan = luongCoBan;
    }

    public NhanVien() {
    }

    public NhanVien(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getThuNhap() {
        return thuNhap;
    }

    public void setThuNhap(double thuNhap) {
        this.thuNhap = thuNhap;
    }

    public boolean isCheckprint() {
        return checkprint;
    }

    public void setCheckprint(boolean checkprint) {
        this.checkprint = checkprint;
    }
    
    

    public void inpid() {
        System.out.print("- ID nhân viên: ");
        id = sc.nextLine();
    }

    public void inpnv() {
        int idcv = 0;
        System.out.print("- Họ và Tên: ");
        name = sc.nextLine();
        System.out.println("1: NVHC || 2: NVTT || 3: Trưởng Phòng");
        do {
            System.out.print("- Chức vụ: ");
            idcv = Integer.parseInt(sc.nextLine());
            switch (idcv) {
                case 1 ->
                    cv = ("Nhân viên hành chính.");
                case 2 ->
                    cv = ("Nhân viên tiếp thị.");
                case 3 ->
                    cv = ("Trưởng phòng.");
                default ->
                    System.out.println("vui lòng nhập từ 1 đến 3.");
            }
        } while (idcv < 1 || idcv > 3);
         do {            
            System.out.print("- Lương cơ bản: ");
            luongCoBan = Double.parseDouble(sc.nextLine());
        } while (luongCoBan < 5000000);
    }

    public void updnv() {
        int idcv = 0;
        System.out.print("- Họ và Tên: ");
        name = sc.nextLine();
        System.out.println("1: NVHC || 2: NVTT || 3: Trưởng Phòng");
        do {
            System.out.print("- Chức vụ: ");
            idcv = Integer.parseInt(sc.nextLine());
            switch (idcv) {
                case 1 ->
                    cv = ("Nhân viên hành chính.");
                case 2 ->
                    cv = ("Nhân viên tiếp thị.");
                case 3 ->
                    cv = ("Trưởng phòng.");
                default ->
                    System.out.println("vui lòng nhập từ 1 đến 3.");
            }
        } while (idcv < 1 || idcv > 3);
        do {            
            System.out.print("- Lương cơ bản: ");
            luongCoBan = Double.parseDouble(sc.nextLine());
        } while (luongCoBan < 5000000);
    }

    public void outthnhap() {
        System.out.println("- ID nhân viên: " + id);
        System.out.printf("- Thu nhập sau thuế: %.0f VND\n",thuNhap);
    }
    
    public void outnv() {
        System.out.println("- ID nhân viên: " + id);
        System.out.println("- Họ và Tên: " + name);
        System.out.println("- Chức vụ: " + cv);
        System.out.printf("- Thu nhập sau thuế: %.0f VND\n",thuNhap);
    }
}
