public class Main {
    public static void main(String[] args) {

        int initialBalance = 100;
        int deposit = 1100;
        int bonusPerHundred = 1;
        int bonus = 0;

        if (deposit > 1000) {
            bonus = (deposit) / 100 * bonusPerHundred;
        }

        int totalBalance = initialBalance + deposit + bonus;

        System.out.println("Итоговый счет: " + totalBalance + " рублей");
        System.out.println("Количество бонусных рублей: " + bonus + " рублей");
    }
}
