package btvn4;

import java.util.ArrayList;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 4/13/2026
 * TIME: 4:01 PM
 */
public class thaotac extends phone {
    ArrayList<contact> dsct = new ArrayList<>();

    @Override
    void themmoi(String ten, String sdt) {
        for (contact i : dsct) {
            if (i.getTen().equals(ten)) {
                System.out.println("Tên này đã tôn tại !");
                return;
            }
        }
        dsct.add(new contact(ten, sdt));
        System.out.println("Thêm thành công!");
    }

    @Override
    void capnhat(String ten, String sdt) {
        for (contact c : dsct) {
            if (c.getTen().equals(ten)) {
                        System.out.println("Cập nhật thành công.");
                return;
            }
        }
        System.out.println("Không tìm thấy tên để cập nhật.");
    }

    @Override
    void xoa(String name) {
        dsct.removeIf(c -> c.getTen().equals(name));
        System.out.println("Đã xóa nếu tồn tại.");
    }

    @Override
    void timkiem(String name) {
        for (contact c : dsct) {
            if (c.getTen().equalsIgnoreCase(name)) {
                System.out.println("SĐT của " + name + " là: " + c.getSdt());
                return;
            }
        }
        System.out.println("Không tìm thấy.");
    }

    @Override
    void in() {
        for (contact c : dsct) {
            System.out.println(c.getTen() + " : " + c.getSdt());
        }
    }
}
