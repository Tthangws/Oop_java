package TuHoc;

import java.util.Scanner;

public class Hocjava6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        /*Bài 3: Làm quen với Mảng (Array) & Chuỗi (String)
        Đề bài: Kiểm tra chuỗi đối xứng (Palindrome)
        Viết chương trình nhập vào một chuỗi ký tự (ví dụ: "madam", "level", "radar").
        Kiểm tra xem chuỗi đó có phải là chuỗi đối xứng hay không (đọc xuôi hay ngược đều giống nhau).

        Yêu cầu nâng cao: Không dùng hàm có sẵn như StringBuilder.reverse(), hãy dùng vòng lặp để so sánh từng ký tự.
        Mục tiêu: Rèn luyện tư duy thao tác với chỉ số (index) của mảng/chuỗi.
        Đây là bài tập kinh điển trong các buổi phỏng vấn xin việc sau này.
         */

        System.out.println("nhap chuoi ban muon kiem tra doi xung :");
        String chuoi=sc.nextLine();
        for(int i=0;i<chuoi.length();i++){
            char dau=chuoi.charAt(i);
            char cuoi=chuoi.charAt(chuoi.length()-1-i);
            if(dau!=cuoi){
                System.out.println("chuoi khong doi xung !");
                return;
            }
        }
        System.out.println("chuoi la doi xung !");
    }
}
