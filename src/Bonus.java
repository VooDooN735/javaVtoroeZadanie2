public class Bonus {
    public static void main(String[] args) {
        int balance = 100;
        int addBalance = 101;
        int bonus = addBalance / 100;


        if (addBalance > 1000) {
            System.out.println("Бонус: " + bonus + "р" + " Баланс: " + (balance + addBalance + bonus) + "р");
        } else {
            System.out.println("Бонус: " + 0 + "р" + " Баланс: " + (balance + addBalance) + "р");
        }

    }
}
