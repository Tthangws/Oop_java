package Chot_ghe;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 4/14/2026
 * TIME: 8:20 PM
 */
public class Seat {
    private String seatID;
    private boolean isBooked;
    private double price;

    //constructer
    Seat(String seatID,double price){
        this.seatID = seatID;
        this.price = price;
    }
    public void bookSeat()throws SeatTakenException{
        if(isBooked == true){
            throw new SeatTakenException("Ghế này đã có người nhanh tay đặt mất rồi!");
        }
        else {
            isBooked = true;
            System.out.println("Đặt ghế thành công!");
        }
    }
}
