
import java.io.*;
import java.util.*;

public class DSHOCSINH implements Serializable
{
    private int i, n;
    private ArrayList<HOCSINH> lHS;
    public void nhapDSHS()
    {
        System.out.print("\nNhập số lượng HS:");
        n = new Scanner(System.in).nextInt();
        lHS= new ArrayList<>(n);
        for (i =0; i <n; i++ )
        {
            HOCSINH x = new HOCSINH();
            x.nhapHS();
            lHS.add(x);
            System.out.println();
        }
    }
    public void tableHead(){
        System.out.printf("\n%20s","HỌ TÊN");
        System.out.printf("%12s","NGÀY SINH");
        System.out.printf("%5s","GT");
        System.out.printf("%12s","ĐỊA CHỈ");
        System.out.printf("%7s","MÃ HS");
        System.out.printf("%5s","TOÁN");
        System.out.printf("%5s","VĂN");
        System.out.printf("%5s","ANH");
        System.out.printf("%5s","KTTN");
        System.out.printf("%5s","KHXH");
        System.out.printf("%5s", "ĐTB");
        System.out.printf("%10s", "XẾP LOẠI");
    }
    public void xuatDSHS()
    {
        tableHead();
        for (HOCSINH hs: lHS)
        {
            hs.xuatHS();
        }
        System.out.print("\n");
    }
    public void timKiemHS() {
        String chonHS;
        System.out.print("\nNhập mã học sinh cần hiển thị:");
        chonHS = new Scanner(System.in).nextLine();
        tableHead();
        if (lHS == null) return;
        for (HOCSINH k : lHS) {
            if (k.getMaHS().equalsIgnoreCase(chonHS)) {
                k.xuatHS();
            }
        }
    }
    public void xoaHS()
    {
        String maHocsinh;
        System.out.print("\n Nhập mã học sinh muốn xóa:");
        boolean a = true;
        maHocsinh = new Scanner(System.in).nextLine();
        for (i=0;i< lHS.size();i++)
        {
            if ( lHS.get(i).getMaHS().equalsIgnoreCase(maHocsinh))
            {
                lHS.remove(i);
                System.out.println("Xóa thành công!!!");
                a = false;
            }
        }
        xuatDSHS();
        if (a)
        {
            System.out.println("Không tồn tại học sinh có mã " +maHocsinh);
        }
    }
    public void sapXepHS()
    {
        Collections.sort(this.lHS, new Comparator<HOCSINH>() {
            @Override
            public int compare(HOCSINH HS1, HOCSINH HS2) {
                return (HS1.getMaHS().compareTo(HS2.getMaHS()));
            }
        });
        tableHead();
        for ( HOCSINH hs: lHS)
        {
            hs.xuatHS();
        }
    }

    public void luuFile() throws IOException
    {
        FileOutputStream fname = new FileOutputStream("hocsinh.txt");
        ObjectOutputStream out = new ObjectOutputStream(fname);
        out.writeObject(lHS);
        out.close();
        fname.close();
    }
    public void docFile()  {
        try{ FileInputStream fname = new FileInputStream("hocsinh.txt");
            ObjectInputStream in = new ObjectInputStream(fname);
            lHS = (ArrayList<HOCSINH>)in.readObject();
            n= lHS.size();
            in.close();
            fname.close();
        }catch (FileNotFoundException var5){
            System.out.println("\nĐọc File bị lỗi!!!");
        }
        catch (Exception var6){
            System.out.println("\nFile chưa có thông tin!!!");
        }
    }

    public ArrayList<HOCSINH> getlHS() {
        return lHS;
    }
}
