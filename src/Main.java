public class Main {
    public static void main(String[] args) {
        int price = 1234;  // стоимость билета
        int a = 20;      // количество рублей для одной бонусной мили
        int b = price / a; // количество бонусных миль
        System.out.println("Вам начислено: " + b + " бонусная(ых) миля(ь)");
    }
}
