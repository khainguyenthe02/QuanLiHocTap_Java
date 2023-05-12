
import java.io.Serializable;
import java.util.ArrayList;

public class DSBANGDIEM implements Serializable{
    private String txt[]={"Toán","Văn","Anh","KHTN","KHXH"};
    ArrayList<BANGDIEM> bd=new ArrayList<BANGDIEM>();
    public void nhapDiem()
    {
        for(int i=0;i<5;++i)
        {
            System.out.println("\nNhập điểm môn "+(txt[i])+ ":");
            BANGDIEM  diem =new BANGDIEM();
            diem.nhapMH();
            diem.setTenMon(txt[i]);
            this.bd.add(diem);
        }
    }
    public void xuatDiem(){
        for(BANGDIEM bDiem: bd)
        {
            bDiem.xuatMH();
        }
    }
    public float TinhdiemTB(){
        float s=0;
        for(BANGDIEM bd1:bd){
            s+=bd1.diemTB();
        }
        return s/5;
    }

}
