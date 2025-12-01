import java.util.Scanner;

public class NhanVienPartTime extends NhanVien {
    private int soGioLam;
    private double luongTheoGio;
    private String viTriThucTap;

    public NhanVienPartTime() {}

    public NhanVienPartTime(String maNV, String hoTen, int namSinh, String diaChi, String phongBan,
                            int soGioLam, double luongTheoGio, String viTriThucTap) {
        super(maNV, hoTen, namSinh, diaChi, phongBan);
        this.soGioLam = soGioLam;
        this.luongTheoGio = luongTheoGio;
        this.viTriThucTap = viTriThucTap;
    }

    public int getSoGioLam() { return soGioLam; }
    public void setSoGioLam(int soGioLam) { this.soGioLam = soGioLam; }

    public double getLuongTheoGio() { return luongTheoGio; }
    public void setLuongTheoGio(double luongTheoGio) { this.luongTheoGio = luongTheoGio; }

    public String getViTriThucTap() { return viTriThucTap; }
    public void setViTriThucTap(String viTriThucTap) { this.viTriThucTap = viTriThucTap; }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma NV: "); maNV = sc.nextLine();
        System.out.print("Nhap ho ten: "); hoTen = sc.nextLine();
        System.out.print("Nhap nam sinh: "); namSinh = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap dia chi: "); diaChi = sc.nextLine();
        System.out.print("Nhap phong ban: "); phongBan = sc.nextLine();
        System.out.print("Nhap so gio lam: "); soGioLam = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap luong theo gio: "); luongTheoGio = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap vi tri thuc tap: "); viTriThucTap = sc.nextLine();
    }

    @Override
    public double tinhLuong() {
        return soGioLam * luongTheoGio;
    }
@Override
    public String xuat() {
        String s = "PARTTIME-" + maNV + "-" + hoTen + " -" + namSinh + " - " + diaChi + " - " + phongBan +
                   "Vi tri: " + viTriThucTap + " - " + tinhLuong();
        System.out.println(s);
        return s;
    }
}
