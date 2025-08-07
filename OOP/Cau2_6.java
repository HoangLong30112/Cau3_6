package Cau2.OOP;

import java.util.ArrayList;

public class Cau2_6 {
    public static void main(String[] args) {

        ArrayList<HocVien> dsHocVien = new ArrayList<>();

        HocVien hv1 = new HocVien("HV01", "Nguyễn Văn A", "a@gmail.com");
        HocVien hv2 = new HocVien("HV02", "Trần Thị B", "b@gmail.com");

        dsHocVien.add(hv1);
        dsHocVien.add(hv2);

        ArrayList<KhoaHoc> dsKhoaHoc = new ArrayList<>();

        KhoaHoc kh1 = new KhoaHoc("KH01", "Java", "Lập trình Java cơ bản", 1000000);
        KhoaHoc kh2 = new KhoaHoc("KH02", "Python", "Python cho người mới bắt đầu", 1200000);

        dsKhoaHoc.add(kh1);
        dsKhoaHoc.add(kh2);

        System.out.println("====DANH SÁCH HỌC VIÊN====");
        hv1.hienthiDS();
        hv2.hienthiDS();

        // Đăng ký
        hv1.dangkiKH(kh1);
        hv1.dangkiKH(kh2);

        hv2.dangkiKH(kh1);

        // Hiển thị
        System.out.println("====DANH SÁCH MÔN HỌC ĐÃ ĐĂNG KÍ====");
        hv1.hienthiDS();
        hv2.hienthiDS();

        // Xoá 1 đăng ký
        System.out.println("====KIỂM TRA DANH SÁCH ĐÃ XÓA====");
        hv1.xoaDKKH(kh1);
        hv1.hienthiDS();
        hv2.hienthiDS();
    }
}
