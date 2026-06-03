package PrinterDevice;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 3/9/2026
 * TIME: 9:24 PM
 */
public class SuperMachine implements Printer,Scanner{
    @Override
    public void printDoc() {
        System.out.println("tai lieu dang duoc printer !");
    }

    @Override
    public void scanDoc() {
        System.out.println("tai lieu da duoc scan !");
    }
}
