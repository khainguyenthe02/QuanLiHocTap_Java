
import java.util.*;
import java.io.*;

public class DSLOPHOC implements Serializable
{
    private  int i,n;
    private  ArrayList<LOPHOC> lh = new ArrayList<>();
    public void nhapLH()
    {
        System.out.print("\nNhập số lượng lớp:");
        n =  Integer.parseInt(new Scanner(System.in).nextLine());
        for (i=0;i<n;i++)
        {
            LOPHOC x= new LOPHOC();
            x.nhapLop();
            this.lh.add(x);
        }
    }
    public void xuatLH()
    {
        for ( LOPHOC lop: lh)
        {
            System.out.print("\n");
            lop.xuatLop();
        }
    }
    public void timKiemLop()
    {
        String chonlop;
        System.out.print("\n Nhập lớp cần hiển thị:");
        chonlop = new Scanner(System.in).nextLine();
        for (LOPHOC lop : lh) {
            if (lop.getLoph().equalsIgnoreCase(chonlop)){
                lop.xuatLop();
            }
        }
    }
    public void themLop()
    {
        System.out.println("Nhập số lượng lớp bạn muốn thêm:");
        int them = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println("NHẬP THÔNG TIN LỚP BẠN MUỐN THÊM");
        for ( i=0; i< them;i++)
        {
            LOPHOC l = new LOPHOC();
            l.nhapLop();
            lh.add(l);
        }
        System.out.println("DANH SÁCH SAU KHI THÊM");
        for (LOPHOC lp: lh)
        {
            lp.xuatLop();
        }

    }
    public void sapXepLop()
    {
        Collections.sort(this.lh, new Comparator<LOPHOC>() {
            @Override
            public int compare(LOPHOC l1, LOPHOC l2) {
                return (l1.getLoph().compareTo(l2.getLoph()));
            }
        });
        for ( LOPHOC lop: lh) { lop.xuatLop(); }
    }
    public void xoaLop()
    {
        String tenLop;
        System.out.print("\n Nhập tên lớp muốn xóa:");
        boolean a = true;
        tenLop = new Scanner(System.in).nextLine();
        for (i=0;i< lh.size();i++) {
            if ( lh.get(i).getLoph().equalsIgnoreCase(tenLop)) {
                lh.remove(i);
                System.out.println("Xóa thành công!!!");
                a = false;
            }
            xuatLH();
        }

        if (a) {
            System.out.println("Không tồn tại lớp " +tenLop);
        }
    }
    public void luuFile() throws IOException
    {
        try {
            FileOutputStream fname = new FileOutputStream("lophoc.txt");
            ObjectOutputStream out = new ObjectOutputStream(fname);
            out.writeObject(lh);
            System.out.println("Lưu file thành công!");
            out.close();
            fname.close();
        } catch (Exception ex)
        {
            ex.printStackTrace();
        }

    }
    public void docFile()  {
        try{ FileInputStream fname = new FileInputStream("lophoc.txt");
            ObjectInputStream in = new ObjectInputStream(fname);
            lh = (ArrayList)in.readObject();
            n= lh.size();
            in.close();
            fname.close();
        }catch (FileNotFoundException var5){
            System.out.println("\nĐọc File bị lỗi!!!");
        }
        catch (Exception var6){
            System.out.println("\nFile chưa có thông tin!!!");
        }
    }

    public ArrayList<LOPHOC> getLh() {
        return lh;
    }
}
