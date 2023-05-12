
import java.util.*;
import java.io.Serializable;

public class HOCSINH extends PERSON implements Serializable
{
    private String maHS;
    DSBANGDIEM bd = new DSBANGDIEM();
    public void nhapHS()
    {
        System.out.print("Nhập mã học sinh:");
        maHS = new Scanner(System.in).nextLine();
        super.nhapPS();
        bd.nhapDiem();
    }
    public void xuatHS()
    {
        super.xuatPS();
        System.out.printf("%7s",maHS);
        bd.xuatDiem();
        System.out.printf("%5.0f", bd.TinhdiemTB());
        System.out.printf("%10s", Xeploai(bd.TinhdiemTB()));
    }
    public String Xeploai(float dtb){
        if(dtb>=8){
            return "Giỏi";
        }else if(dtb>=6.5){
            return "Khá";
        }else if(dtb>=5){
            return "TB";
        }
        return "Yếu";
    }
    public String getMaHS() { return maHS; }
    public DSBANGDIEM getBd() { return bd; }
    public void setMaHS(String maHS) { this.maHS = maHS; }
    public void setBd(DSBANGDIEM bd) { this.bd = bd; }
    @Override
    public String toString() {
        return "HOCSINH{" +
                "maHS='" + maHS + '\'' +
                ", bd=" + bd +
                '}';
    }
}
