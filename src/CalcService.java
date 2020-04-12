import java.math.*;
import java.lang.*;

public class CalcService {

    public double calc(double weight, int height) {
        BigDecimal decweight = new BigDecimal(weight);
        BigDecimal mheight = BigDecimal.valueOf((Math.pow(height, 2) / 10000)); // рост^2 указывается в метрах
        BigDecimal bmi = decweight.divide(mheight, 2, RoundingMode.HALF_UP); // расчитываем BMI масс/рост^2
        BigDecimal bmi1 = bmi.setScale(0, RoundingMode.HALF_UP); // округляем до целого
        double ibmi = bmi1.intValue(); // переводим Бигдесемикал в дабл
        //      System.out.println(mheight);
        //      System.out.println(bmi);
        //      System.out.println(bmi1);
        //      System.out.println(ibmi);
        return ibmi;
    }

}
