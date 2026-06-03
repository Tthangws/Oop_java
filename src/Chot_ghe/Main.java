package Chot_ghe;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 4/14/2026
 * TIME: 8:20 PM
 */
public class Main {
    public static void main(String[] args) {
        Seat s1 = new Seat("A1",100000);
        try{
            s1.bookSeat();
            s1.bookSeat();
        }
        catch(SeatTakenException e){
            System.out.println("Đã xảy ra lỗi! "+e.getMessage());
        }
    }

}
