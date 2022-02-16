package captainCiaoCiao;

import java.math.BigDecimal;

public class Circle {
    public static void main(String[] args) {

        int x = 100, y = 110;

        double r = Math.random()*10+10;

        System.out.println(  "<svg height=\"100\" width=\"1000\">\n"
                + " <circle cx=\"" + x + "\" cy=\"" + y + "\" r=\"" + r + "\" />\n"
                + "</svg>" );

        long millon = 1000000000;
        System.out.println(millon*millon);

        BigDecimal big = BigDecimal.valueOf(0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+-1);
        System.out.println(big);

    }
}
