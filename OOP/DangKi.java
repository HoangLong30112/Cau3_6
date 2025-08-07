package Cau2.OOP;

import java.util.ArrayList;

public class DangKi
{
    private String maDK;
    private ArrayList<HocVien> dshocVien;
    private ArrayList<KhoaHoc> dskhoaHoc;

    public DangKi() {
        this.dshocVien = new ArrayList<>();
        this.dskhoaHoc = new ArrayList<>();
    }

    public DangKi(String maDK) {
        this.maDK = maDK;
    }

    public void themHocVien(HocVien hocVien){
        dshocVien.add(hocVien);
    }

    public void themKhoaHoc(KhoaHoc khoaHoc){
        dskhoaHoc.add(khoaHoc);
    }
    
    public void dkKhoaHoc(String maHV, String maKH){
        for(HocVien hv: dshocVien){
            if(maHV.equals(hv.getMaHV())){
                for(KhoaHoc kh: dskhoaHoc){
                    if(maKH.equals(kh.getMaKH())){
                        hv.dangkiKH(kh);
                    }
                }
            }
        }
    }

    public void hienthiDS(){
        for(HocVien hv: dshocVien){
            System.out.println(hv.toString());
        }
    }
}
