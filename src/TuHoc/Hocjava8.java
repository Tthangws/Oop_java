package TuHoc;

import java.util.ArrayList;
import java.util.Scanner;

public class Hocjava8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> menu = new ArrayList<>();
         menu.add("phở bò");
         menu.add("bún chả");
         menu.add("cơm rang");
         menu.add("nuoc loc");
        System.out.println("menu cua quan chung toi la : "+menu);
        menu.set(0,"mi tom");
        menu.set(1,"bun bo hue");
        System.out.println("menu sau khi da thay doi : "+menu);
        menu.add(2,"banh mi");
        System.out.println(menu);
        System.out.println("mon an sang cho hom nay la : "+menu.get(2));
        menu.remove("nuoc loc");
        System.out.println(menu);

        //duyet qua danh sach tat ca cac phan tu trong arl
        for(int i=0;i<menu.size();i++){
            System.out.println("mon an thu "+(i+1)+" la : "+menu.get(i));
        }
        }
    }
