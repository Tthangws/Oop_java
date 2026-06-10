package lamdeoopjavacuoiky;

import java.util.Scanner;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/9/2026
 * TIME: 1:23 PM
 */
public class Student extends Person{
    Scanner sc = new Scanner(System.in);
    private double Score;

    @Override
    public void InputData(){
        super.InputData();
        System.out.println("Nhap diem: ");
        Score = sc.nextDouble();
    }
    @Override
    public void DisplayData(){
        super.DisplayData();
        System.out.println("Diem: "+Score);
    }
}
