package decimals;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) {
        double d1 = 0.1;
        double d2 = 0.2;

        System.out.println(d2 + d1);

        BigDecimal big1 = new BigDecimal("0.359223894256");
        BigDecimal big2 = BigDecimal.TEN;

        System.out.println(big1);
        System.out.println(big2);

        System.out.println(big1.add(big2));
        System.out.println(big1.divide(big2, RoundingMode.DOWN));
        System.out.println(new BigDecimal("0.1").add(new BigDecimal("0.2")));

        System.out.println(big1.setScale(3, RoundingMode.UP));

        BigDecimal result = big1.subtract(big2);

        System.out.println(result);

    }
}
