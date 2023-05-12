
import java.io.Serializable;
import java.util.*;


public class LOPHOC implements Serializable
{
    private String loph;
    private String GVCN;
    DSHOCSINH dshs = new DSHOCSINH();
    public String getLoph() { return loph; }
    public String getGVCN() { return GVCN; }
    public void setLoph(String loph, String GVCN) {
        this.loph = loph;
        this.GVCN = GVCN;
    }
    public LOPHOC() { }
    public LOPHOC(String loph, String GVCN)
    {
        this.loph = loph;
        this.GVCN = GVCN;
    }
    public void nhapLop()
    {
        System.out.print("Nhập lớp:");
        loph = new Scanner(System.in).nextLine();
        System.out.print("Nhập tên GVCN:");
        GVCN = new Scanner(System.in).nextLine();
        dshs.nhapDSHS();
    }
    public void xuatLop()
    {
        System.out.print("\nDanh sách lớp:" +loph);
        System.out.print("\nTên giáo viên chủ nhiệm:"+this.GVCN);
        dshs.xuatDSHS();
    }
    @Override
    public String toString() {
        return "LOPHOC{" +
                "loph='" + loph + '\'' +
                ", GVCN='" + GVCN + '\'' +
                ", dshs=" + dshs +
                '}';
    }
    public DSHOCSINH getDSHS() {
        return dshs;
    }
}
