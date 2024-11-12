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
public class TruongPhong extends NhanVien {

    private double luongTrachNhiem;

    Scanner sc = new Scanner(System.in);

    public TruongPhong(double luongTrachNhiem, String id, String name, String cv, double luongCoBan) {
        super(id, name, cv, luongCoBan);
        this.luongTrachNhiem = luongTrachNhiem;
    }

    public TruongPhong(double luongTrachNhiem) {
        this.luongTrachNhiem = luongTrachNhiem;
    }

    public double getLuongTrachNhiem() {
        return luongTrachNhiem;
    }

    public void setLuongTrachNhiem(double luongTrachNhiem) {
        this.luongTrachNhiem = luongTrachNhiem;
    }

    public TruongPhong() {
    }

    public void inptp() {
        System.out.print("- Lương trách nhiệm : ");
        luongTrachNhiem = Double.parseDouble(sc.nextLine());
    }
}
