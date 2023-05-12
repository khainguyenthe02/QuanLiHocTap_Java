
import java.io.IOException;
import java.util.*;

public class QLHTHS
{
    public static void main(String[] args) throws IOException
    {
        DSLOPHOC dslh = new DSLOPHOC();
        int chon;
        do{
            label111:
            while (true) {
                System.out.println("\n_____________________________________");
                System.out.println("| QUẢN LÍ HỌC TẬP CỦA HỌC SINH THPT |");
                System.out.println("| 1. Nhập danh sách và lưu vào file |");
                System.out.println("| 2. Hiển thị danh sách từ file     |");
                System.out.println("| 3. Tìm kiếm danh sách             |");
                System.out.println("| 4. Sắp xếp danh sách lớp học      |");
                System.out.println("| 5. Xóa đối tượng trong danh sách  |");
                System.out.println("| 6. Thêm lớp học                   |");
                System.out.println("| 0. Thoát chương trình             |");
                System.out.println("-------------------------------------");
                System.out.println("Mời bạn chọn:");
                chon = Integer.parseInt(new Scanner(System.in).nextLine());
                switch (chon) {
                    case 0:
                        System.exit(0);
                    case 1: {
                        dslh.nhapLH();
                        System.out.print("\nĐã nhập thành công!!!");
                        dslh.luuFile();
                    }
                    break;
                    case 2:dslh.docFile();dslh.xuatLH();break;
                    case 3:
                        int timkiem;
                        System.out.println("_____________________________________");
                        System.out.println("Tìm kiếm thông tin từ danh sách");
                        System.out.println("1. Tìm kiếm theo lớp");
                        System.out.println("2. Tìm kiếm theo mã học sinh");
                        System.out.println("0. Thoát chương trình");
                        System.out.println("Khác. Trở lại Menu chính");
                        System.out.println("_____________________________________");
                        System.out.println("Mời bạn chọn:");
                        timkiem = Integer.parseInt(new Scanner(System.in).nextLine());
                        switch (timkiem) {
                            case 0: System.exit(0);
                            case 1: dslh.timKiemLop();break;
                            case 2:
                                ///
                                String maHS;
                                System.out.print("\nNhập mã học sinh cần hiển thị:");
                                maHS = new Scanner(System.in).nextLine();
                                if (maHS == null || "".equals(maHS)) {
                                    System.out.print("\nVui lòng nhập lại!");
                                    break;
                                }
                                if (dslh != null) {
                                    List<LOPHOC> dslhX = dslh.getLh();
                                    if (dslhX != null) {
                                        for (LOPHOC lh: dslhX) {
                                            if (lh.getDSHS() != null && lh.getDSHS().getlHS() != null) {
                                                for (HOCSINH hs: lh.getDSHS().getlHS()) {
                                                    if (maHS.equalsIgnoreCase(hs.getMaHS())) {
                                                        lh.getDSHS().tableHead();
                                                        hs.xuatHS();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            break;
                            default:{ continue label111;}
                        }
                        break;
                    case 4:
                        int sapXep;
                        System.out.println("__________________________________________");
                        System.out.println("Sắp xếp đối tượng có trong danh sách");
                        System.out.println("0. Thoát chương trình");
                        System.out.println("1. Sắp xếp lớp học");
                        System.out.println("2. Sắp xếp Học sinh");
                        System.out.println("Khác. Trở lại menu chính");
                        System.out.println("------------------------------------------");
                        System.out.println("Mời bạn chọn:");
                        sapXep = Integer.parseInt(new Scanner(System.in).nextLine());
                        switch (sapXep) {
                            case 0: System.exit(0);
                            case 1: dslh.sapXepLop(); break;
                            case 2:
                                if (dslh != null) {
                                    List<LOPHOC> dslhX = dslh.getLh();
                                    if (dslhX != null) {
                                        for (LOPHOC lh : dslhX) {
                                            if (lh.getDSHS() != null && lh.getDSHS().getlHS() != null) {
                                                lh.getDSHS().sapXepHS();
                                            }
                                        }
                                    }
                                }
                                break;
                            default: { continue label111;}
                        } break ;

                    case 5:
                        int xoa;
                        System.out.println("__________________________________________");
                        System.out.println("Xóa đối tượng có trong danh sách");
                        System.out.println("0. Thoát chương trình");
                        System.out.println("1. Xóa lớp học");
                        System.out.println("2. Xóa Học sinh");
                        System.out.println("Khác. Trở lại menu chính");
                        System.out.println("------------------------------------------");
                        System.out.println("Mời bạn chọn:");
                        xoa = Integer.parseInt(new Scanner(System.in).nextLine());
                        switch (xoa)
                        {
                            case 0: System.exit(0);
                            case 1: dslh.xoaLop(); break;
                            case 2:
                                if (dslh != null) {
                                    List<LOPHOC> dslhX = dslh.getLh();
                                    if (dslhX != null) {
                                        for (LOPHOC lh : dslhX) {
                                            if (lh.getDSHS() != null && lh.getDSHS().getlHS() != null) {
                                                lh.getDSHS().xoaHS();
                                                }
                                            }
                                        }
                                    }
                                break;
                            default:{ continue label111; }
                        }
                        break;

                    case 6: {
                        dslh.themLop();
                        System.out.println("Thêm lớp thành công!");
                    }break;
                    case 7: while (true);
                }
            }
        }while (chon!=0);
    }
}
