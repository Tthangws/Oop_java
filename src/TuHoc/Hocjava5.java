package TuHoc;

import java.util.Random;
import java.util.Scanner;

public class Hocjava5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*Đề bài: Trò chơi Đoán số (Guess the Number)
        Máy tính sẽ chọn ngẫu nhiên một số từ 1 đến 100 (dùng Math.random()
        hoặc class Random).

        Cho người dùng nhập đoán số liên tục.

        Nếu số nhập < số bí mật: In ra "Thấp quá, đoán lại đi!".

        Nếu số nhập > số bí mật: In ra "Cao quá, giảm xuống!".

        Nếu đúng: In ra "Chúc mừng! Bạn đã đoán đúng sau X lần thử".

        Mục tiêu: Hiểu rõ vòng lặp while hoặc do-while (vì không biết trước số lần lặp) và cách điều khiển luồng chương trình.

         */

        Random rd=new Random();
        int solanthu=0;
        int ngaunhien=rd.nextInt(1,100);
        System.out.println("                   TRO CHOI DOAN SO MAY MAN KKKKK");
        while(true) {
            System.out.print("Hay nhap so ma ban doan : ");
            int a = sc.nextInt();
            ++solanthu;

            if(a>ngaunhien){
                System.out.println("===== lon qua ! doan lai diiii =====");
            }
            else if(a<ngaunhien){
                System.out.println("===== be qua ! doan lai diiii =====");
            }
            else {
                System.out.println("KKKKK     chuc mung ban da doan dung !!! sau "+solanthu+" lan thu haha");
                return;
            }
        }

    }
}


