package KhuonMauDuLieu;

import HashMap.Student;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 3/15/2026
 * TIME: 8:36 PM
 */
public class Main {
    public static void main(String[] args) {
        MagicBox<String> stringBox = new MagicBox<>();
        stringBox.putItem("Hello");

        MagicBox<Integer> numberBox = new MagicBox<>();
        numberBox.putItem(99);

        MagicBox<Student> studentBox = new MagicBox<>();
        Student sv = new Student("2421050142","Nguyen Trong Thang",3.72);
        studentBox.putItem(sv);

        System.out.println("Du lieu tu cac hop : \n"+stringBox.getItem()+"\n"+numberBox.getItem()+"\n"+studentBox.getItem());
    }

}
