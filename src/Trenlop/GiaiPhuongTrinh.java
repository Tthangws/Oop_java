package Trenlop;




public class GiaiPhuongTrinh {
    double a, b;

    // Constructor
    public GiaiPhuongTrinh(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // Ham giai
    public void giai() {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiem x = " + x);
        }
    }

    // Ham main
    public static void main(String[] args) {

        GiaiPhuongTrinh pt = new GiaiPhuongTrinh(5, 10);
        pt.giai();
    }
}
