package lamdeoopjavacuoiky;

import java.util.ArrayList;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/9/2026
 * TIME: 1:41 PM
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Student>mainlist = new ArrayList<>();
        StudentManager sm = new StudentManager();

        //them hoc sinh
        sm.AddNewStudent(mainlist);
        sm.AddNewStudent(mainlist);

        //hien thi
        sm.DisplayStudent(mainlist);

        //update
        sm.UpdateStudentById(mainlist);
        sm.UpdateStudentById(mainlist);

        //xoa
        sm.RemoveStudentById(mainlist);
        sm.RemoveStudentById(mainlist);
    }
}
