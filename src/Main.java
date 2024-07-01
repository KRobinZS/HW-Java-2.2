//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int Score = 100; // на счету у клиента
        int Replenish = 1500; // сумма пополнения
        int bonus;
        if (Replenish > 1000) {
            bonus = (Score + Replenish) / 100;
        } else {
            bonus = 0;
        }
        int finalScore = Score + Replenish + bonus;
        System.out.println("Ваш баланс:" + finalScore);

    }
}