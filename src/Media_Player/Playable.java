package Media_Player;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 3/9/2026
 * TIME: 2:18 PM
 */
public interface Playable {
    /* Bài 1 (Dễ): Hệ thống phát Đa phương tiện (Media Player)
    Mục tiêu: Hiểu cách tạo bản hợp đồng và bắt các class khác nhau tuân thủ nó.

    Yêu cầu nghiệp vụ:

    Tạo interface tên là Playable. Trong đó khai báo đúng một phương thức: void play();
    Tạo class AudioPlayer (Máy nghe nhạc MP3) implements Playable. Khi gọi hàm play(), in ra màn hình: "Đang phát âm thanh: Tùng tùng chát chát..."
    Tạo class VideoPlayer (Trình phát Video MP4) implements Playable. Khi gọi hàm play(), in ra màn hình: "Đang phát hình ảnh: Phim hành động bom tấn..."

    Trong hàm Main:

    Tạo một biến kiểu Playable tên là media1 và gán cho nó đối tượng AudioPlayer. Gọi media1.play().
    Đổi media1 thành đối tượng VideoPlayer. Gọi lại media1.play().

📌 Kiến thức trọng tâm: Cậu sẽ thấy cùng một lệnh play(), nhưng hệ thống tự biết phải phát âm thanh hay hình ảnh tùy vào đối tượng thực tế được gán.

     */

    void play();
}
