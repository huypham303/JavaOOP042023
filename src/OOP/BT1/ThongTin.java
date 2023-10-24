package OOP.BT1;

public class ThongTin {

    public static void main(String[] args) {
        NhanVien nhanVien = new NhanVien();

        System.out.println("Full Name: "+ nhanVien.getName());
        System.out.println("Address: "+ nhanVien.getAddress());
        System.out.println("Role: "+ nhanVien.getRole());
        System.out.println("Age: "+ nhanVien.getAge());
    }
}
