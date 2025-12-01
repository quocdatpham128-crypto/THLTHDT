import java.util.Scanner;

public class NhanVienFullTime extends NhanVien {
    private double luongCoBan;
    private double heSoLuong;

    public NhanVienFullTime() {}

    public NhanVienFullTime(String maNV, String hoTen, int namSinh, String diaChi, String phongBan,
                            double luongCoBan, double heSoLuong) {
        super(maNV, hoTen, namSinh, diaChi, phongBan);
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma NV: "); maNV = sc.nextLine();
        System.out.print("Nhap ho ten: "); hoTen = sc.nextLine();
        System.out.print("Nhap nam sinh: "); namSinh = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap dia chi: "); diaChi = sc.nextLine();
        System.out.print("Nhap phong ban: "); phongBan = sc.nextLine();
        System.out.print("Nhap luong co ban: "); luongCoBan = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap he so luong: "); heSoLuong = Double.parseDouble(sc.nextLine());
    }

    @Override
    public double tinhLuong() {
        return luongCoBan * heSoLuong;
    }

    @Override
    public String xuat() {
        String s = "FULLTIME-" + maNV + " - " + hoTen + " - " + namSinh + " - " + diaChi + " - " + phongBan +" - " + tinhLuong();
        System.out.println(s); 
        return s;             
    }
}
