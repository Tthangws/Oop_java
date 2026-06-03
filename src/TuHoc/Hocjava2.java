package TuHoc;

import java.util.Scanner;

public class Hocjava2{
    public static void main(String[] args) {
        /*Viết chương trình nhập vào 2 số nguyên a, b và một ký tự phép tính (+, -, *, /).
         In ra kết quả của phép tính đó.
         Ví dụ:Input: 10, 5, +  Output: 15.  Input: 10, 0, /  Output: Khong the chia cho 0!
         Gợi ý: Dùng Scanner để nhập.
          Dùng switch(phepTinh) để xử lý từng trường hợp
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("moi nhap so nguyen thu nhat : ");
        double a= sc.nextDouble();
        System.out.println("moi nhap so nguyen thu hai : ");
        double b= sc.nextDouble();
        System.out.println("moi nhap toan tu : ");
        char phepTinh=sc.next().charAt(0);//java khong co nextChar(); nên phải dùng hàm này để đọc 1 ký tự đầu tiên
        //ví duj nếu nhập "hello" thì máy sẽ chỉ nhận chữ 'h';
        double ketQua;

        switch(phepTinh){
            case '+':
                ketQua=a+b;
                System.out.println("ket qua la : "+ketQua);
                break;

            case '-':
                ketQua=a-b;
                System.out.println("ket qua la : "+ketQua);
                break;

            case '/':
                if(b==0){
                    System.out.println("khong the chia het cho 0 !");
                    return;
                }
                ketQua=a/b;
                System.out.println("ket qua la : "+ketQua);
                break;

            default :
                System.out.println("khong hop le vui long nhap lai !");
                break;
        }



    }
}