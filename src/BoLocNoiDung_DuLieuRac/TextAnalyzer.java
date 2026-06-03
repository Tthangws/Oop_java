package BoLocNoiDung_DuLieuRac;

import java.util.HashMap;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 4/2/2026
 * TIME: 12:17 AM
 */
public class TextAnalyzer {
    private HashMap<String, Integer> blackList;
    private int maxAllowerScore;

    // constructer
    public TextAnalyzer(int maxAllowerScore) {
        this.blackList = new HashMap<>();
        this.maxAllowerScore = maxAllowerScore;

        blackList.put("dao", 1);
        blackList.put("chem", 2);
        blackList.put("cheo", 1);
        blackList.put("bom", 3);
        blackList.put("ngu", 1);
        blackList.put("giet", 3);
    }

    //ham doc van ban va cham diem oc hai
    public void textReading(String text) throws ToxicContenException {
        int totalToxicityScore = 0;
        // xoa ky tu dac biet
        String cleaned = text.replaceAll("[^a-zA-Z0-9\\s]", "");
        //dua ve chu thuong
        String lower = cleaned.toLowerCase();
        //tach cau ra thanh tung tu
        String[] words = lower.split(" ");
        //quet loi
        for (String i : words) {
            if (blackList.containsKey(i)) {
                totalToxicityScore += blackList.get(i);
            }
            if (totalToxicityScore > maxAllowerScore) {
                throw new ToxicContenException("Văn bản bị chặn! Điểm độc hại: " + totalToxicityScore);
            }
        }
        System.out.println("Văn bản an toàn. Điểm độc hại: " + totalToxicityScore);
    }
}
