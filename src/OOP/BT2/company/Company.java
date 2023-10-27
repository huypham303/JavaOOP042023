package OOP.BT2.company;

import OOP.BT2.Person.Person;

public class Company {
    public static void main(String[] args) {
        Person person = new Person();

        System.out.println("Tên là: "       + person.getName() + "\n"
                            + "Tuổi: "      + person.getAge() + "\n"
                            + "Giới Tính: " + person.getGender());
    }
}
