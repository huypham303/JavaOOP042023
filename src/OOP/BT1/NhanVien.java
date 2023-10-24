package OOP.BT1;

public class NhanVien {
    String name = "Phạm Đăng Huy";
    int age = 20;
    String address = "Hà Nội";
    String role = "Automation Test";

    public NhanVien() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public ThongTin(String name, int age, String address, String role) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.role = role;
    }

    @Override
    public String toString() {
        return "ThongTin{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", role='" + role + '\'' +
                '}';
    }


}
