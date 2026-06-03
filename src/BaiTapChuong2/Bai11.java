package BaiTapChuong2;

import java.util.Scanner;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 2/2/2026
 * TIME: 5:56 PM
 */
public class Bai11 {

    //thuat toan sap xep
    public static void insertion_sort(int arr[],int n) {
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
    //thuat toan in ham
    public static void xuatRaManHinh(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ; ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so phan tu cho mang : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Phan tu thu : "+(i+1));
            arr[i]=sc.nextInt();
        }
        System.out.println("mang truoc khi sap xep la : ");
        xuatRaManHinh(arr,n);
        insertion_sort(arr,n);
        System.out.println("\nmang sau khi sap xep la : ");
        xuatRaManHinh(arr,n);

    }
}
