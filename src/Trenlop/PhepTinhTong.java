package Trenlop;





    public class PhepTinhTong {
        // thuộc tính
        private double soA;
        private double soB;

        //Hàm khởi tạo (Constructor)
        public PhepTinhTong(double soA, double soB) {
            this.soA = soA;
            this.soB = soB;
        }

        //  tính tổng
        public double tinhTong() {
            return this.soA + this.soB;
        }

        public static void main(String[] args) {
            PhepTinhTong ptt = new PhepTinhTong(7, 6);
            System.out.println("tong 2 so la : " + ptt.tinhTong());
        }
    }
