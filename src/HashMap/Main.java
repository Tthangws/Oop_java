package HashMap;

import java.util.HashMap;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 3/10/2026
 * TIME: 6:31 PM
 */
public class Main {
    public static void main(String[] args) {
        HashMap<String, Student> dictionary = new HashMap<>();
        //string la ma id sinh vien lam chia khoa
        dictionary.put("sv1",new Student("sv1","Nguyen trong thang",3.5));
        dictionary.put("sv2",new Student("sv2","Nguyen trong chien",3.7));
        dictionary.put("sv3",new Student("sv3","Le ngoc chan",3.4));

    }
}
