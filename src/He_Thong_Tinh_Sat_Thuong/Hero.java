package He_Thong_Tinh_Sat_Thuong;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 4/14/2026
 * TIME: 7:13 PM
 */
public class Hero {
    private String name; //ten nv
    private double hp; //mau nv
    private double armor;//giap phep/vat ly chung

    //constructer
    public Hero(String name, double hp, double armor){
        this.name = name;
        this.hp = hp;
        this.armor = armor;
    }

    //ham gay sat thuong
    public void takeDamage(Damage d) {
        double realDanage = d.caculateDamage(this.armor);
        this.hp -= realDanage;
        if (this.hp > 0) {
            System.out.println(this.name + " Vừa nhận " + realDanage + " sát thương thực tế.Máu còn: " + this.hp);
        }
        else System.out.println(this.name+" vừa nhận thêm "+realDanage+" sát thương thực thế.Máu đã cạn, he/she die!");
    }
}
