import java.math.*;
import java.lang.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DataService comparison = new DataService();
        CalcService calculate = new CalcService();

        System.out.print("Введите ваш рост(в см): ");
        Scanner scanh = new Scanner(System.in);
        int height = scanh.nextInt();

        System.out.print("Введите ваш вес(в кг): ");
        Scanner scanw = new Scanner(System.in);
        double weight = scanw.nextInt();

        double raschet = calculate.calc(weight, height); // передаем данные (рост и вес) в CalcService
        double datas = comparison.comparison(raschet); // полученные данные из Calc Service передаем в DataService

    }
}
