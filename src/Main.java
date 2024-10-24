//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int score = 100; // счет
        int replenishment = 300; // сумма пополнения
        int rateBonus = 1; // ставка бонуса за каждые 100 рублей
        int rateReplenishment = 1000; // ставка пополнения для начисления бонусов
        int bonus = 0; // количество бонусов

        if (replenishment > rateReplenishment) {
            bonus = replenishment / 100;
            score = score + replenishment + bonus;
        } else {
            score = score + replenishment;
        }

        System.out.println("Итоговый счет = " + score);
        System.out.println("Количество бонусных рублей = " + bonus);
    }
}