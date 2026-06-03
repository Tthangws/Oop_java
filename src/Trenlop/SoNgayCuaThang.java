package Trenlop;




public class SoNgayCuaThang {
    int thang, nam;

    // Constructor
    public SoNgayCuaThang(int thang, int nam) {
        this.thang = thang;
        this.nam = nam;
    }

    // Ham tinh so ngay
    public void tinhSoNgay() {
        int ngay = 0;
        switch (thang) {
            case 1, 3, 5, 7, 8, 10, 12 -> ngay = 31;
            case 4, 6, 9, 11 -> ngay = 30;
            case 2 -> {
                // Kiem tra nam nhuan
                if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
                    ngay = 29;
                } else {
                    ngay = 28;
                }
            }
            default -> {
                System.out.println("Thang khong hop le");
                return;
            }
        }
        System.out.println("Thang " + thang + " nam " + nam + " co " + ngay + " ngay");
    }

    // Ham main
    public static void main(String[] args) {
        SoNgayCuaThang snt = new SoNgayCuaThang(5, 2025);
        snt.tinhSoNgay();
    }
}
