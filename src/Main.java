//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int score = 100; // исходный баланс
        int replenish = 1100; // сумма пополнения
        int bonus;
        if (replenish > 1000) {
            bonus = replenish / 100;
        } else {
            bonus = 0;
        }
        int finalScore = score + replenish + bonus;
        System.out.println("Начислено бонусов:" + bonus);
        System.out.println("Ваш баланс:" + finalScore);

    }
}