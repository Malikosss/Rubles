public class Main {
    public static void main(String[] args) {

        int replenishment = 1000; // сумма пополнения счета
        int initialAmount = 100; // начальный счет
        int finalAmount; // итоговая сумма с учетом бонусов

        if (replenishment <= 999) {
            finalAmount = initialAmount + replenishment;
        } else {
            finalAmount = initialAmount + replenishment + replenishment / 100;
        }

        System.out.println("Итоговая сумма на вашем счете:" + (finalAmount));

    }
}
