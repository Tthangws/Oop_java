package BoLocNoiDung_DuLieuRac;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 4/2/2026
 * TIME: 1:28 AM
 */
public class Main {
    public static void main(String[] args) throws ToxicContenException {
        TextAnalyzer ta = new TextAnalyzer(7);
        ta.textReading("ngu%% giet bom chem");
    }
}
