package Cau2.OOP;

import java.util.ArrayList;
import java.util.List;

public class HocVien
{
    private String maHV;
    private String hotenHV;
    private String email;
    ArrayList<DangKi> dsDangKi;

    public HocVien(String maHV, String hotenHV, String email) {
        this.maHV = maHV;
        this.hotenHV = hotenHV;
        this.email = email;
        this.dsDangKi = new ArrayList<>();
    }

    public String getMaHV() {
        return maHV;
    }

    public void setMaHV(String maHV) {
        this.maHV = maHV;
    }

    public String getHotenHV() {
        return hotenHV;
    }

    public void setHotenHV(String hotenHV) {
        this.hotenHV = hotenHV;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<DangKi> getDsDangKi() {
        return dsDangKi;
    }

    public void setDsDangKi(ArrayList<DangKi> dsDangKi) {
        this.dsDangKi = dsDangKi;
    }

    public void dangkiKH(KhoaHoc kh){
        dsDangKi.add(new DangKi(this, kh));
    }

    public void xoaDKKH(KhoaHoc kh){
        for(int i = 0; i < dsDangKi.size(); i++){
            if(dsDangKi.get(i).getDskhoaHoc().equals(kh)){
                dsDangKi.remove(i);
                break;
            }
        }
    }

    public void hienthiDS(){
        System.out.println("Học viên: " + hotenHV);
        for(DangKi dk : dsDangKi){
            System.out.println("  Đã đăng ký khóa học: " + dk.getDskhoaHoc().getTenKH());
        }
    }


    @Override
    public String toString() {
        return "HocVien{" +
                "maHV='" + maHV + '\'' +
                ", hotenHV='" + hotenHV + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
