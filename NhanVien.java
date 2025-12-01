import java.io.Serializable;

public abstract class NhanVien implements INhanVien, Serializable {
    protected String maNV, hoTen, diaChi, phongBan;
    protected int namSinh;

    public NhanVien() {}
    public NhanVien(String maNV, String hoTen, int namSinh, String diaChi, String phongBan) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
        this.phongBan = phongBan;
    }
}

