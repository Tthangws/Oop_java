package TuHoc;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 1/27/2026
 */
public class Sach {
    String tieuDe;
    String tacGia;
    int namXuatBan;
    //ham constructer
    Sach(String tieuDe,String tacGia,int namXuatBan){
        this.tieuDe=tieuDe;
        this.tacGia=tacGia;
        this.namXuatBan=namXuatBan;
    }

    //ham in
    public void inThongTin(){
        System.out.println("sach: "+tieuDe+" - Tac gia: "+tacGia+" - "+namXuatBan);

    }

    public static void main(String[] args) {
        Sach quyen1=new Sach("De Men Phieu Luu Ky","To hoai",1941);
        quyen1.inThongTin();
        Sach quyen2=new Sach("Harry Potter","J.K.Rowling",1997);
        quyen2.inThongTin();
    }

}
