import java.io.*;
import java.util.*;

public class QuanLyNhanVien {
    private ArrayList<NhanVien> list = new ArrayList<>();

    //== Đọc từ file ===========================
    public void readFromFile() {
        try {
            File file = new File("Quanlynhanvien_input.txt");
            if(!file.exists()) return;
            Scanner sc = new Scanner(file);

            while(sc.hasNextLine()){
                String[] data = sc.nextLine().split(";");
                if(data[0].equalsIgnoreCase("FULLTIME")){
                   list.add(new NhanVienFullTime(
                            data[1], data[2], Integer.parseInt(data[3]), data[4], data[5],
                            Double.parseDouble(data[6]), Double.parseDouble(data[7])
                    ));
                } else if(data[0].equalsIgnoreCase("PARTTIME")){
                    list.add(new NhanVienPartTime(
                            data[1], data[2], Integer.parseInt(data[3]), data[4], data[5],
                            Integer.parseInt(data[6]), Double.parseDouble(data[7]), data[8]
                    ));
                }
            }
            sc.close();
        } catch(Exception e){
            System.out.println("Loi khi doc file: " + e.getMessage());
        }
    }
     public void writeToFile(){
        try{
            FileWriter fw = new FileWriter("Quanlynhanvien_output.txt");
            for(NhanVien nv : list){
                if(nv instanceof NhanVienFullTime)
                    fw.write(((NhanVienFullTime) nv).xuat()+"\n");
                else if(nv instanceof NhanVienPartTime)
                    fw.write(((NhanVienPartTime) nv).xuat()+"\n");
            }
            fw.close();
        }catch(Exception e){
            System.out.println("Loi ghi file: " + e.getMessage());
        }
    }
     public void add(NhanVien nv){ list.add(nv); }

    public void remove(String ma){
        boolean removed = list.removeIf(n -> n.maNV.equals(ma));
        if(removed) System.out.println("Da xoa neu ton tai.");
        else System.out.println("Khong tim thay nhan vien!");
    }

    public void show(){
        if(list.isEmpty()) System.out.println("Danh sach rong !");
        else list.forEach(NhanVien::xuat);
    }
}
