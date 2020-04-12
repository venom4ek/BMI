import java.math.*;
import java.lang.*;

public class Main1 {
    public static void main(String[] args) {
        float imt1 = 16;          // Интерпретация показателей ИМТ
        float imt2 = 18.5f;      // Интерпретация показателей ИМТ
        float imt3 = 24.99f;     // Интерпретация показателей ИМТ
        float imt4 = 30f;        // Интерпретация показателей ИМТ
        int imt5 = 35;          // Интерпретация показателей ИМТ
        int imt6 = 40;          // Интерпретация показателей ИМТ

        int height = 196;       // Рост
        BigDecimal height2 = new BigDecimal(Math.pow(height, 2) / 10000); // рост^2 указывается в метрах
        BigDecimal weight = new BigDecimal(70);        // Вес
        BigDecimal height3 = height2.setScale(4, RoundingMode.CEILING);
        BigDecimal bmi = weight.divide(height2, RoundingMode.CEILING);
        System.out.println(height2);
        System.out.println(height3);
        System.out.println(bmi);
        double bmi1 = bmi.doubleValue(); // Перевод параметра в число
        if (bmi1 <= imt1) {
            System.out.println("Индекс вашего тела: " + bmi + ". Выраженный дефицит массы тела ");
        } else if (bmi1 > imt2) {
            System.out.println("Индекс вашего тела: " + bmi + ". Недостаточная (дефицит) масса тела");
            } else if (bmi1 < imt3) {
            System.out.println("Индекс вашего тела: " + bmi + ". Норма");
                } else if (bmi1 < imt4) {
            System.out.println("Индекс вашего тела: " + bmi + ". Избыточная масса тела (предожирение)");
                    } else if (bmi1 < imt5) {
            System.out.println("Индекс вашего тела: " + bmi + ". Ожирение");
                        } else if (bmi1 < imt6) {
            System.out.println("Индекс вашего тела: " + bmi + ". Ожирение резкое");
        } else {
            System.out.println("Индекс вашего тела: " + bmi + ". Очень резкое ожирение");
        }

    }
}
