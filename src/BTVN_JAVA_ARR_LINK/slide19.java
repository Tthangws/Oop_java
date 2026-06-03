package BTVN_JAVA_ARR_LINK;

import java.util.ArrayList;
import java.util.ListIterator;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 4/20/2026
 * TIME: 2:15 PM
 */
public class slide19 {
        public static void main(String[] args) {
            // khai báo 1 ArrayList có tên là arrListChar
            // có kiểu là Character
            ArrayList<Character> arrListChar = new ArrayList<>();

            arrListChar.add('a');
            arrListChar.add('e');
            arrListChar.add('b');
            arrListChar.add('c');

            // khai báo một ListIterator có kiểu là Character
            ListIterator<Character> listIterator = arrListChar.listIterator();

            // hiển thị các phần tử có trong arrListChar
            // bằng cách sử dụng ListIterator
            System.out.println("Các phần tử có trong arrListChar là: ");
            while (listIterator.hasNext()) {
                System.out.print(listIterator.next() + "\t");
            }
        }
    }
