package WeekSeven;

//Source:
//http://soultionmanual.blogspot.com/2016/12/chapter-13-exercise-15-introduction-to.html

import java.math.BigDecimal;

public class Exercise13_15 {

    public static void main(String[] args) {

        BigRational bigRational = new BigRational(new BigDecimal(4), new BigDecimal(8));
        System.out.println(bigRational);
        bigRational = bigRational.multiply(bigRational);
        System.out.println(bigRational);
    }
}