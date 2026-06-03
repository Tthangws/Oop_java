package TuHoc;

import java.util.Scanner;

public class Hocjava1 {
    public static Scanner sc = new Scanner(System.in);
    public static double chieuCao,canNang,bMI;

    public static double calculateBMI(double canNang, double chieuCao) {
        return Math.round(canNang/(Math.pow(chieuCao, 2)));
    }

    public static void main(String[] args) {
        System.out.println("vui long nhap chieu cao : ");
        chieuCao=sc.nextDouble();
        sc.nextLine();

        System.out.println("vui long nhap can nang : ");
        canNang=sc.nextDouble();

        bMI = calculateBMI(canNang, chieuCao);
        System.out.print("Va ket qua la: " + bMI);

        if(bMI<15) {
            System.out.println("\nthan hinh qua gay !");
        }
            else if(bMI>=15&&bMI<16){
                System.out.println("\nthan hinh gay !");
            }
            else if(bMI>=16&&bMI<18.5){
                System.out.println("\nthan hinh hoi gay !");
            }
            else if(bMI>=18.5&&bMI<25){
                System.out.println("\nthan hinh binh thuong !");
            }
            else if(bMI>=25&&bMI<30){
                System.out.println("than hinh hoi beo !");
            }
            else if(bMI>=30&&bMI<35){
                System.out.println("than hinh beo !");
            }
            else {
                System.out.println("than hinh qua beo");
            }


    }
}
