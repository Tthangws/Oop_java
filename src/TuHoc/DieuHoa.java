package TuHoc;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 1/27/2026
 * TIME: 5:49 PM
 */
public class DieuHoa {
    private int nhietDo;
    private String hangSanXuat;

    //ham constructer
    DieuHoa(int nhietDo,String hangSanXuat){
            setNhietDo(nhietDo);//gọi hàm để kiểm tra nhiệt độ ch nếu gán thẳng this.nhietDo thì sẽ có lỗ hổng nhập nhiệt độ bao nhiêu nó cũng nhận

            this.hangSanXuat=hangSanXuat;
    }
    //ham tra ve nhiet do hien tai
    public int getNhietDo(){
        return nhietDo;
    }
    public String getHangSanXuat(){
        return hangSanXuat;
    }
    //ham cap nhat nhiet do
    public void setNhietDo(int nhietDoMoi){
        if(nhietDoMoi < 16 || nhietDoMoi > 30){
            System.out.println("nhiet do duoc chinh khong hop le !");
        }
        else {
            this.nhietDo = nhietDoMoi;
            System.out.println("da chinh nhiet do thanh cong !");
        }
    }
    //ham in ket qua
    public void in(){
        System.out.println("nhiet do dieu hoa hien tai : "+getNhietDo()+"`c");
        System.out.println("hang san xuat : "+getHangSanXuat());
    }

    public static void main(String[] args) {
       DieuHoa dieuhoa1=new DieuHoa(100,"pandasonic");
        dieuhoa1.setNhietDo(22);
       dieuhoa1.in();
    }
}
