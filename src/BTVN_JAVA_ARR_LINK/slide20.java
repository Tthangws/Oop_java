package BTVN_JAVA_ARR_LINK;

import java.util.ArrayList;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 4/20/2026
 * TIME: 2:15 PM
 */
public class slide20 {
        public static void main(String[] args) {
            ArrayList<String> colors = new ArrayList<String>(3);

            colors.add("Red");
            colors.add("Blue");
            colors.add("Green");
            colors.add("Orange");
            colors.remove("Green");
            colors.add("Pink");
            colors.add("Yellow");

            System.out.println(colors.get(1));
            System.out.println(colors.contains("Orange"));
            System.out.println(colors.size());
            System.out.println(colors);
        }
    }

