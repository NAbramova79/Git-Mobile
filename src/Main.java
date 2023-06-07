// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int initialBalance = 100; // Начальный баланс
        int topup = 1200; // Сумма пополнения

        boolean valid = topup >= 1000; // Условие для начисления бонуса

        int percent = valid ? 1 : 0;

        int bonus = topup * percent / 100;

        System.out.println("Количество бонусных рублей:");
        System.out.println(bonus);
        System.out.println("Итоговый счет:");
        System.out.println(initialBalance + topup + bonus);
    }
}