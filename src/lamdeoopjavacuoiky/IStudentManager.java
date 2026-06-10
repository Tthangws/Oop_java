package lamdeoopjavacuoiky;

import java.util.ArrayList;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/9/2026
 * TIME: 1:26 PM
 */
public interface IStudentManager {
    void AddNewStudent(ArrayList<Student> studentlist);
    void DisplayStudent(ArrayList<Student> studentlist);
    void UpdateStudentById(ArrayList<Student> studentlist);
    void RemoveStudentById(ArrayList<Student> studentlist);

}
