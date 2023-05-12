
import java.util.*;
import java.io.Serializable;

public class PERSON implements Serializable{
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private String diaChi;
    public PERSON() { }
    public PERSON(String hoTen, String ngaySinh, String gioiTinh, String diaChi)
    {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }
    public void nhapPS()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ tên:");
        hoTen =  sc.nextLine();
        System.out.print("Nhập ngày sinh:");
        ngaySinh = sc.nextLine();
        System.out.print("Nhập giới tính:");
        gioiTinh = sc.nextLine();
        System.out.print("Nhập địa chỉ:");
        diaChi = sc.nextLine();
    }
    public void xuatPS()
    {
        System.out.printf("\n%20s",hoTen);
        System.out.printf("%12s",ngaySinh);
        System.out.printf("%5s",gioiTinh);
        System.out.printf("%12s",diaChi);
    }
    public String getHoTen() { return hoTen; }
    public String getNgaySinh() { return ngaySinh; }
    public String getGioiTinh() { return gioiTinh; }
    public String getDiaChi() { return diaChi; }
    public void setHoTen(String hoTen) { this.hoTen = hoTen; }
    public void setNgaySinh(String ngaySinh) { this.ngaySinh = ngaySinh; }
    public void setGioiTinh(String gioiTinh) { this.gioiTinh = gioiTinh; }
    public void setDiaChi(String diaChi) { this.diaChi = diaChi; }
    @Override
    public String toString() {
        return "{" +
                "hoTen='" + hoTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}'+"\n";
    }
}
