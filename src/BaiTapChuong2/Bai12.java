package BaiTapChuong2;

import java.util.Scanner;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 2/5/2026
 * TIME: 3:56 PM
 */
public class Bai12 {
    //thuat toan tim phan tu lon nhat
    public static int timKiem(int arr[][],int hang, int cot){
        int lonNhat = arr[0][0];
        for(int i=0;i<hang;i++){
            for(int j=0;j<cot;j++){
                if(lonNhat<arr[i][j]){
                     lonNhat = arr[i][j];
                    }
                }
            }
        return lonNhat;
    }

    public static void main(String[] args) {
        /*
        Viết chương trình nhập vào các phần tử cho một ma trận 2 chiều,
         sau đó tìm và hiển
        thị phần tử có giá trị lớn nhất trong ma trận đó.
        vd : int[][] matrix = {
          {1, 2, 3},
          {4, 5, 6},
          {7, 8, 9}
          };

         */
        // khai bao ma tran
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so hang cho mang : ");
        int hang = sc.nextInt();
        System.out.println("Nhap so cot cho mang : ");
        int cot = sc.nextInt();
        int[][] arr = new int[hang][cot];

        System.out.println("Nhap thong tin cho mang :");
        for(int i=0;i<hang;i++){
            for(int j=0;j<cot;j++){
                System.out.print("arr["+i+"]["+j+"] = ");
                arr[i][j]=sc.nextInt();
            }
        }

        //tim phan tu co gia tri lon nhat
        System.out.println("phan tu lon nhat trong ma tran la = "+timKiem(arr,hang,cot));
    }
}
