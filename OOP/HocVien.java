package Cau2.OOP;

import java.util.ArrayList;
import java.util.List;

public class HocVien
{
    private String maHV;
    private String hotenHV;
    private String email;
    private ArrayList<KhoaHoc> maKH;

    public HocVien(String maHV, String hotenHV, String email) {
        this.maHV = maHV;
        this.hotenHV = hotenHV;
        this.email = email;
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

    public List<KhoaHoc> getMaKH() {
        return maKH;
    }

    public void setMaKH(ArrayList<KhoaHoc> maKH) {
        this.maKH = maKH;
    }

    public void dangkiKH(KhoaHoc kh){
        maKH.add(kh);
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
