public class FirstHomeworkJava {
    public static void main(String[] args) {

        addition();
        System.out.println();
        equalsNotEquals();
        System.out.println();
        excess();
        System.out.println();

    }
    private static void addition() {
        int x = 32;
        int y = 23;
        System.out.println("Сумма 'x + y' = " + (x + y));
        System.out.println("Вычитание 'a - b' = " + (x - y));
        System.out.println("Умножение 'a * b' = " + (x * y));
        System.out.println("Деление 'a / b' = " + (x / y));
        System.out.println("Остаток от деления 'a % b' = " + (x % y));
    }
    private static void equalsNotEquals() {
        int x = 111;
        int y = 222;
        System.out.println("Равенство 'x == y' = " + (x == y));
        System.out.println("Неравенство 'x != y' = " + (x != y));
        System.out.println("Больше 'x > y' = " + (x > y));
        System.out.println("Меньше 'x < y' = " + (x < y));
        System.out.println("Больше или равно 'x >= y' = " + (x >= y));
        System.out.println("Меньше или равно 'x <= y' = " + (x <= y));

    }
    private static void excess() {
        Long hyperLong = Long.MAX_VALUE;
        short aShort = 32767;
        short bShort = 1;
        short sumShort = (short) (aShort + bShort);

        System.out.println("Переполнение MAX_VALUE: " + hyperLong);
        System.out.println("Переполнение Short: " + sumShort);
    }
}
