package BTVN_JAVA_ARR_LINK;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 4/20/2026
 * TIME: 2:15 PM
 */
public class slide18 {
    public static void main(String[] args) {
        // khai báo 1 ArrayList có tên là arrListString
        // có kiểu là String
        ArrayList<Float> arrListFloat = new ArrayList<>();

        // thêm các phần tử sử dụng phương thức add()
        // chữ f cho biết các số thêm vào là số thực
        // nếu không có chữ này thì trình biên dịch sẽ hiểu đây là số double
        // và sẽ báo lỗi dữ liệu
        arrListFloat.add(0.7f);
        arrListFloat.add(7.26f);
        arrListFloat.add(1.02f);
        arrListFloat.add(9.3f);

        // khai báo một Iterator có kiểu là Float
        Iterator<Float> iterator = arrListFloat.iterator();

        System.out.println("Các phần tử có trong arrListFloat là: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "\t");
        }
    }
}
