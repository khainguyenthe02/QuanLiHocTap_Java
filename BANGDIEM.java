
import java.util.*;
import java.io.Serializable;

public class BANGDIEM implements Serializable
{
    private String tenMon;
    private float diemHS1;
    private float diemHS2;
    private float diemHS3;

    public BANGDIEM(String tenMon, float diemHS1, float diemHS2, float diemHS3)
    {
        this.tenMon = tenMon;
        this.diemHS1 = diemHS1;
        this.diemHS2 = diemHS2;
        this.diemHS3 = diemHS3;
    }
    public BANGDIEM(){}

    public String getTenMon() { return tenMon; }
    public float getDiemHS1() { return diemHS1; }
    public float getDiemHS2() { return diemHS2; }
    public float getDiemHS3() { return diemHS3; }
    public void setTenMon(String tenMon) { this.tenMon = tenMon; }
    public void setDiemHS1(float diemHS1) { this.diemHS1 = diemHS1; }
    public void setDiemHS2(float diemHS2) { this.diemHS2 = diemHS2; }
    public void setDiemHS3(float diemHS3) { this.diemHS3 = diemHS3; }
    public void nhapMH()
    {
        Scanner SC=new Scanner(System.in);
        System.out.print("Nhập điểm HS1:");
        this.diemHS1=Float.parseFloat(SC.nextLine());
        System.out.print("Nhập điểm HS2:");
        this.diemHS2=Float.parseFloat(SC.nextLine());
        System.out.print("Nhập điểm HS3:");
        this.diemHS3=Float.parseFloat(SC.nextLine());
    }
    public void xuatMH() { System.out.printf("%5.0f",diemTB()); }
    public float diemTB(){ return (this.diemHS1+this.diemHS2*2+this.diemHS3*3)/6; }

    @Override
    public String toString() {
        return "BANGDIEM{" +
                "tenMon='" + tenMon + '\'' +
                ", diemHS1=" + diemHS1 +
                ", diemHS2=" + diemHS2 +
                ", diemHS3=" + diemHS3 +
                '}';
    }
}
