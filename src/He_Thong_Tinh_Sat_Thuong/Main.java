package He_Thong_Tinh_Sat_Thuong;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 4/14/2026
 * TIME: 7:15 PM
 */
public class Main {
    public static void main(String[] args) {
        Hero h1 = new Hero("Garen",1000,50);
        PhysicalDamage pd = new PhysicalDamage(200);
        TrueDamage td = new TrueDamage(300);

        h1.takeDamage(pd);
        h1.takeDamage(pd);
        h1.takeDamage(td);
        h1.takeDamage(td);
        h1.takeDamage(td);
    }
}
