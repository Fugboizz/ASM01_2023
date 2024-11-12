/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AssignmentGD2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Kung
 */
public class NhanVienService {

    Scanner sc = new Scanner(System.in);
    ArrayList<NhanVien> ds = new ArrayList<>();
//Y1

    public void inpdefault() {
        NhanVien nv1 = new NhanVien("02", "Nhân Viên A", "Nhân viên hành chính.");
        nv1.setThuNhap(7000000);
        ds.add(nv1);
        NhanVien nv2 = new NhanVien("03", "Nhân Viên B", "Trưởng phòng.");
        nv2.setThuNhap(17000000);
        ds.add(nv2);
        NhanVien nv3 = new NhanVien("04", "Nhân Viên C", "Nhân viên tiếp thị.");
        nv3.setThuNhap(9000000);
        ds.add(nv3);
        NhanVien nv4 = new NhanVien("05", "Nhân Viên D", "Nhân viên hành chính.");
        nv4.setThuNhap(15000000);
        ds.add(nv4);
        NhanVien nv5 = new NhanVien("06", "Nhân Viên E", "Nhân viên tiếp thị.");
        nv5.setThuNhap(20000000);
        ds.add(nv5);
        NhanVien nv6 = new NhanVien("07", "Nhân Viên F", "Trưởng phòng.");
        nv6.setThuNhap(10000000);
        ds.add(nv6);
        NhanVien nv7 = new NhanVien("08", "Nhân Viên G", "Nhân viên hành chính.");
        nv7.setThuNhap(17000000);
        ds.add(nv7);
        NhanVien nv8 = new NhanVien("09", "Nhân Viên H", "Nhân viên hành chính.");
        nv8.setThuNhap(15000000);
        ds.add(nv8);
    }

    public void inp() {
        int i = ds.size();
        boolean check = true;
        do {
            System.out.println("Nhân viên thứ " + (i + 1) + " :");
            i++;
            NhanVien nv = new NhanVien();
            do {
                check = true;
                nv.inpid();
                for (NhanVien d : ds) {
                    if (nv.getId().equalsIgnoreCase(d.getId())) {
                        check = false;
                    }
                }
                if (!check) {
                    System.out.println("! ID đã tồn tại");
                }
            } while (!check);
            nv.inpnv();
            if (nv.getCv().contains("Nhân viên tiếp thị.")) {
                TiepThi nvtt = new TiepThi();
                nvtt.inptt();
                nv.setThuNhap((nvtt.getDoanhSo() / 100 * nvtt.getTiLeHoaHong()) + nv.getLuongCoBan());
            } else if (nv.getCv().contains("Trưởng phòng.")) {
                TruongPhong nvtp = new TruongPhong();
                nvtp.inptp();
                nv.setThuNhap(nv.getLuongCoBan() + nvtp.getLuongTrachNhiem());
            } else {
                nv.setThuNhap(nv.getLuongCoBan());
            }
            if (nv.getThuNhap() < 9000000) {
            } else if (nv.getThuNhap() <= 15000000) {
                nv.setThuNhap((nv.getThuNhap() + 1000000) * 0.9);
            } else {
                nv.setThuNhap((nv.getThuNhap() - 15000000) * 0.88 + 16000000 * 0.9);
            }
            ds.add(nv);
            System.out.print("Ấn phím \"Y\" để nhập tiếp hoặc phím bất kỳ để thoát : ");
        } while (sc.nextLine().equalsIgnoreCase("y"));
    }

    public void out() {
        if (!ds.isEmpty()) {
            int i = 1;
            for (NhanVien nv : ds) {
                System.out.println("Nhân viên thứ " + i + " :");
                nv.outnv();
                i++;
            }
        } else {
            System.out.println("Danh sách trống.");
        }
    }

    public void findnv() {
        String find;
        boolean check = true;
        if (!ds.isEmpty()) {
            do {
                System.out.print("Nhập mã cần tìm: ");
                find = sc.nextLine();
                for (NhanVien nv : ds) {
                    if (nv.getId().equalsIgnoreCase(find)) {
                        nv.outnv();
                        check = false;
                        break;
                    } else {
                        check = true;
                    }
                }
                if (check) {
                    System.out.println("Nhân viên không tồn tại.");
                }
                System.out.print("Ấn phím \"Y\" để tìm tiếp hoặc phím bất kỳ để thoát : ");
            } while (sc.nextLine().equalsIgnoreCase("y"));
        } else {
            System.out.println("Danh sách trống.");
        }
    }

    public void delete() {
        String find;
        if (!ds.isEmpty()) {
            do {
                boolean check = true;
                System.out.println("Mời bạn nhập mã NV cần xóa");
                find = sc.nextLine();
                for (NhanVien nv : ds) {
                    if (nv.getId().equalsIgnoreCase(find)) {
                        ds.remove(nv);
                        check = true;
                        break;
                    } else {
                        check = false;
                    }
                }
                if (check) {
                    System.out.println("DONE.");
                } else {
                    System.out.println("Nhân viên không tồn tại.");
                }
                if (ds.isEmpty()) {
                    System.out.println("Đã xóa hết.");
                    break;
                }
                System.out.print("Ấn phím \"Y\" để xóa tiếp hoặc phím bất kỳ để thoát : ");
            } while (sc.nextLine().equalsIgnoreCase("y"));
        } else {
            System.out.println("Danh sách trống.");
        }
    }

    public void update() {
        String find;
        boolean check = true;
        if (!ds.isEmpty()) {
            do {
                System.out.print("Nhập mã cần tìm: ");
                find = sc.nextLine();
                for (NhanVien nv : ds) {
                    if (nv.getId().equalsIgnoreCase(find)) {
                        int idcv = 0;
                        System.out.print("- Họ và Tên: ");
                        nv.setName(sc.nextLine());
                        System.out.println("1: NVHC || 2: NVTT || 3: Trưởng Phòng");
                        do {
                            System.out.print("- Chức vụ: ");
                            idcv = Integer.parseInt(sc.nextLine());
                            switch (idcv) {
                                case 1 ->
                                    nv.setCv("Nhân viên hành chính.");
                                case 2 ->
                                    nv.setCv("Nhân viên tiếp thị.");
                                case 3 ->
                                    nv.setCv("Trưởng phòng.");
                                default ->
                                    System.out.println("vui lòng nhập từ 1 đến 3.");
                            }
                        } while (idcv < 1 || idcv > 3);
                        do {
                            System.out.print("- Lương cơ bản: ");
                            nv.setLuongCoBan(Double.parseDouble(sc.nextLine()));
                        } while (nv.getLuongCoBan() < 5000000);
                        if (nv.getCv().contains("Nhân viên tiếp thị.")) {
                            TiepThi nvtt = new TiepThi();
                            nvtt.inptt();
                            nv.setThuNhap(nvtt.getDoanhSo() / 100 * nvtt.getTiLeHoaHong() + nv.getLuongCoBan());
                        } else if (nv.getCv().contains("Trưởng phòng.")) {
                            TruongPhong nvtp = new TruongPhong();
                            nvtp.inptp();
                            nv.setThuNhap(nv.getLuongCoBan() + nvtp.getLuongTrachNhiem());
                        } else {
                            nv.setThuNhap(nv.getLuongCoBan());
                        }
                        if (nv.getThuNhap() < 9000000) {
                        } else if (nv.getThuNhap() <= 15000000) {
                            nv.setThuNhap((nv.getThuNhap() - 9000000) * .9);
                        } else {
                            nv.setThuNhap(nv.getThuNhap() * 0.88);
                        }
                        check = false;
                        break;
                    } else {
                        check = true;
                    }
                }
                if (check) {
                    System.out.println("Nhân viên không tồn tại.");
                }
                System.out.print("Ấn phím \"Y\" để sửa tiếp hoặc phím bất kỳ để thoát.");
            } while (sc.nextLine().equalsIgnoreCase("y"));
        } else {
            System.out.println("Danh sách trống.");
        }
    }

    public void findluong() {
        boolean check = true;
        int i = 1;
        int lmax;
        int lmin;
        if (!ds.isEmpty()) {
            do {
                System.out.println("Nhập khoảng cần tìm: ");
                System.out.print("Min: ");
                lmin = Integer.parseInt(sc.nextLine());
                do {
                    System.out.print("Max: ");
                    lmax = Integer.parseInt(sc.nextLine());
                    if (lmax < lmin) {
                        System.out.println("! Max không thể nhỏ hơn Min.");
                    }
                } while (lmax < lmin);
                System.out.println("Danh sách nhân viên có thu nhập trong khoảng " + lmin + " đến " + lmax + " :");
                for (NhanVien nv : ds) {
                    if (nv.getThuNhap() >= lmin && nv.getThuNhap() <= lmax) {
                        System.out.println(i + ":");
                        i++;
                        nv.outnv();
                        check = false;
                    }
                }
                if (check) {
                    System.out.println("Nhân viên không tồn tại.");
                }
                System.out.print("Ấn phím \"Y\" để tìm tiếp hoặc phím bất kỳ để thoát.");
            } while (sc.nextLine().equalsIgnoreCase("y"));
        } else {
            System.out.println("Danh sách trống.");
        }
    }

    public void alphab() {
        if (!ds.isEmpty()) {
            Comparator<NhanVien> comp = new Comparator<NhanVien>() {
                @Override
                public int compare(NhanVien o1, NhanVien o2) {
                    return o1.getName().compareTo(o2.getName());
                }
            };
            Collections.sort(ds, comp);
            System.out.println("DONE.");
        } else {
            System.out.println("Danh sách trống.");
        }
    }

    public void sxthunhap() {
        if (!ds.isEmpty()) {
            Comparator<NhanVien> comp = new Comparator<NhanVien>() {
                @Override
                public int compare(NhanVien o1, NhanVien o2) {
                    if (o1.getThuNhap() > o2.getThuNhap()) {
                        return 1;
                    } else if (o1.getThuNhap() < o2.getThuNhap()) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            };
            Collections.sort(ds, comp);
            System.out.println("DONE.");
        } else {
            System.out.println("Danh sách trống.");
        }
    }

    public void top5() {
        if (!ds.isEmpty()) {
            int i = 0;
            int dem = 1;
            int bac = 0;
            double[] top = new double[ds.size()];
            for (NhanVien x : ds) {
                top[i] = x.getThuNhap();
                x.setCheckprint(true);
                i++;
            }
            Arrays.sort(top);
            if (ds.size() < 5) {
                for (int j = ds.size() - 1; j > 0; j--) {
                    bac = 1;
                    for (NhanVien x : ds) {
                        if (x.getThuNhap() == top[j] && x.isCheckprint()) {
                            System.out.println("Nhân viên top " + dem + " :");
                            x.outnv();
                            x.setCheckprint(false);
                            bac++;
                        }
                    }
                    dem += bac;
                }
            } else {

                for (int j = ds.size() - 1; j > 0; j--) {
                    //System.out.print(" " + top[j]);
                    bac = 0;
                    for (NhanVien x : ds) {
                        if (x.getThuNhap() == top[j] && x.isCheckprint()) {
                            System.out.println("Nhân viên top " + dem + " :");
                            x.outnv();
                            x.setCheckprint(false);
                            bac++;
                        }
                    }
                    dem += bac;
                    if (dem > 5) {
                        break;
                    }
                }
            }
        } else {
            System.out.println("Danh sách trống.");
        }
    }
}
