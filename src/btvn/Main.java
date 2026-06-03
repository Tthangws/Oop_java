package btvn;

import btvn3.Employee;

import java.util.ArrayList;


/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 4/13/2026
 * TIME: 1:08 PM
 */
public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("chien",20,"nam",23500000,3);
        Employee e2 = new Employee("thang",21,"nam",16550000,5);
        Employee e3 = new Employee("huong",17,"nu",19000450,2.5);
        Employee e4 = new Employee("vy",19,"nu",10000000,7);

        ArrayList<Employee>danhsach = new ArrayList<>();
        danhsach.add(e1);
        danhsach.add(e2);
        danhsach.add(e3);
        danhsach.add(e4);

        //sap xep theo luong giam dan
        for (int i = 0; i < danhsach.size() - 1; i++) {
            for (int j = 0; j < danhsach.size() - 1 - i; j++) {

                double luong1 = danhsach.get(j).TinhLuong();
                double luong2 = danhsach.get(j + 1).TinhLuong();

                if (luong1 < luong2) {
                    Employee temp = danhsach.get(j);
                    danhsach.set(j, danhsach.get(j + 1));
                    danhsach.set(j + 1, temp);
                }
            }
        }

        System.out.println("===== THONG TIN NHAN VIEN =====");
        //in thong tin theo luong giam dan
        for(Employee i : danhsach){

            i.inTT();
        }

    }
}
