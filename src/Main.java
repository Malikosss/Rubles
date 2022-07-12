public class Main {
    public static void main(String[] args) {

        int x = 1000; // сумма пополнения счета
        int y = 100; // начальный счет
        int bonus; // итоговая сумма с учетом бонусов

        if (x <= 999) {
            bonus = y + x;
        } else {
            bonus = y + x + x / 100;
        }

        System.out.println("Итоговая сумма на вашем счете:" + (bonus));

    }
}
