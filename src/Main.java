//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int score = 100; // на счету у клиента
        int replenish = 1500; // сумма пополнения
        int bonus;
        if (replenish > 1000) {
            bonus = (score + replenish) / 100;
        } else {
            bonus = 0;
        }
        int final_score = score + replenish + bonus;
        System.out.println("Ваш баланс:" + final_score);

    }
}