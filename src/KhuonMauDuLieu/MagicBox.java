package KhuonMauDuLieu;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 3/15/2026
 * TIME: 8:27 PM
 */
public class MagicBox<T> {
    private T item;

    //ham cat do
    public void putItem(T item){
        this.item = item;
        System.out.println("Đã cất đồ vào hộp ma thuật !");
    }

    //ham lay ra
    public T getItem(){
        return this.item;
    }
}

