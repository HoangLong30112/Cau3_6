package Cau2.OOP;

public class KhoaHoc
{
    private String maKH;
    private String tenKH;
    private String motaKH;
    private int price;

    public KhoaHoc(String maKH, String tenKH, String motaKH, int price) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.motaKH = motaKH;
        this.price = price;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getMotaKH() {
        return motaKH;
    }

    public void setMotaKH(String motaKH) {
        this.motaKH = motaKH;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "KhoaHoc{" +
                "maKH='" + maKH + '\'' +
                ", tenKH='" + tenKH + '\'' +
                ", motaKH='" + motaKH + '\'' +
                ", price=" + price +
                '}';
    }
}
