package PrinterDevice;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 3/9/2026
 * TIME: 9:24 PM
 */
public class Main {
    static void taskPrintOnly(Printer p){
        p.printDoc();
    }
    static void taskScanOnly(Scanner s){
        s.scanDoc();
    }
    public static void main(String[] args) {
        SuperMachine sp1 = new SuperMachine();
        taskScanOnly(sp1);
        taskPrintOnly(sp1);
    }
}
