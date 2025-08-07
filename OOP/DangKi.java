package Cau2.OOP;

import java.util.ArrayList;

public class DangKi
{
    private HocVien dshocVien;
    private KhoaHoc dskhoaHoc;

    public DangKi() {
        this.dshocVien = dshocVien;
        this.dskhoaHoc = dskhoaHoc;
    }

    public DangKi(HocVien dshocVien, KhoaHoc dskhoaHoc) {
        this.dshocVien = dshocVien;
        this.dskhoaHoc = dskhoaHoc;
    }

    public HocVien getDshocVien() {
        return dshocVien;
    }

    public void setDshocVien(HocVien dshocVien) {
        this.dshocVien = dshocVien;
    }

    public KhoaHoc getDskhoaHoc() {
        return dskhoaHoc;
    }

    public void setDskhoaHoc(KhoaHoc dskhoaHoc) {
        this.dskhoaHoc = dskhoaHoc;
    }

}
