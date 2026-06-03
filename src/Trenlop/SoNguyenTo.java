package Trenlop;




    public class SoNguyenTo {
        //thuoc tinh
       private final int n;

        // Constructor
         SoNguyenTo(int n) {
            this.n = n;
        }

        // Ham kiem tra
        public void kiemtra(){
            for(int i = 2; i < this.n;i++){
                if(this.n % i == 0){
                    System.out.println("Khong phai so nguyen to !");
                    return;
                }
            }
            System.out.println("La so nguyen to !");
        }


        // Ham main chay luon
        public static void main(String[] args) {
            SoNguyenTo snt = new SoNguyenTo(7);
            snt.kiemtra();
        }
    }
