package lamdeoopjavacuoiky;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/9/2026
 * TIME: 1:28 PM
 */
public class StudentManager implements IStudentManager{
    Scanner sc = new Scanner(System.in);
    @Override
    public void AddNewStudent(ArrayList<Student>studentlist){
        Student st = new Student();
        st.InputData();
        studentlist.add(st);
        System.out.println("Them hoc sinh thanh cong!");
    }
    public void DisplayStudent(ArrayList<Student>studentlist){
        for(Student i : studentlist){
            i.DisplayData();
        }
    }
    public void UpdateStudentById(ArrayList<Student>studentlist){
        System.out.println("nhap id can update: ");
        String Id = sc.nextLine();
        for(Student i : studentlist){
            if(i.getId().equals(Id)){
                System.out.println("cap update for student: "+i.getId());
                System.out.println("ten moi: ");
                String newname = sc.nextLine();
                i.setFullName(newname);
                System.out.println("update thanh cong !");
                break;
            }else {
                System.out.println("khong tim thay hs co id: "+Id);
                break;
            }
        }
    }
    public void RemoveStudentById(ArrayList<Student>studentlist){
        String Id = sc.nextLine();
        System.out.println("Nhap id can xoa: ");
        Id = sc.nextLine();
        for(Student i : studentlist){
            if(i.getId().equals(Id)){
                studentlist.remove(i);
                System.out.println("xoa thanh cong!");
                break;
            }else{
                System.out.println("khong tim thay hoc sinh co id: "+Id);
                break;
            }
        }
    }
}
