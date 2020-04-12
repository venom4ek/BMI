public class DataService {
    public int comparison(double ibmi) {
        float imt1 = 16;          // Интерпретация показателей ИМТ
        float imt2 = 18.5f;      // Интерпретация показателей ИМТ
        float imt3 = 24.99f;     // Интерпретация показателей ИМТ
        float imt4 = 30f;        // Интерпретация показателей ИМТ
        int imt5 = 35;          // Интерпретация показателей ИМТ
        int imt6 = 40;          // Интерпретация показателей ИМТ
        int out = (int) ibmi;
        if (ibmi <= imt1) {
            System.out.println("Индекс вашего тела: " + out + ". Рекомендованна неделька в гостях у бабули :) ");
        } else if (ibmi < imt2) {
            System.out.println("Индекс вашего тела: " + out + ". Надо подкачаться :)");
        } else if (ibmi < imt3) {
            System.out.println("Индекс вашего тела: " + out + ". Так держать :)");
        } else if (ibmi < imt4) {
            System.out.println("Индекс вашего тела: " + out + ". Хорошего человека должно быть чуть больше, чем остальных :)");
        } else if (ibmi < imt5) {
            System.out.println("Индекс вашего тела: " + out + ". Хватит гостить у бабули :)");
        } else if (ibmi < imt6) {
            System.out.println("Индекс вашего тела: " + out + ". Пересмотрите свой рацион.");
        } else {
            System.out.println("Индекс вашего тела: " + out + ". Необходима консультация врача.");
        }
        return 0;
    }
}
