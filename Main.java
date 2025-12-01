import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        QuanLyNhanVien ql = new QuanLyNhanVien();
        ql.readFromFile(); 
        Scanner sc = new Scanner(System.in);
        int key;
        do{
            System.out.println("\n===== QUAN LY NHAN VIEN =====");
            System.out.println("1. Them NV FullTime");
            System.out.println("2. Them NV PartTime");
            System.out.println("3. Xoa NV theo ma");
            System.out.println("4. Hien thi danh sach");
            System.out.println("5. Ghi ra file");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            key = Integer.parseInt(sc.nextLine());

            switch(key){
                case 1: NhanVien n1 = new NhanVienFullTime(); n1.nhap(); ql.add(n1); break;
                case 2: NhanVien n2 = new NhanVienPartTime(); n2.nhap(); ql.add(n2); break;
                case 3: System.out.print("Nhap ma: "); ql.remove(sc.nextLine()); break;
                case 4: ql.show(); break;
                case 5: ql.writeToFile(); break;
            }
        }while(key!=0);
    }
}
