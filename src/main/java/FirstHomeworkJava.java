public class FirstHomeworkJava {
    public static void main(String[] args) {



        addition();
        System.out.println();
        equalsNotEquals();
        System.out.println();
        excess();
        System.out.println();
        combination();
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
    private static void combination() {
        int x = 32;
        double y = 3.2;
        double sumDouble = x + y;
        double differenceDouble = x - y;
        double productDouble = x * y;
        double quotientDouble = x / y;

        int sumInt = (int) (x + y);
        int differenceInt = (int) (x - y);
        int productInt = (int) (x * y);
        int quotientInt = (int) (x / y);

        System.out.println("Сумма " + sumDouble);
        System.out.println("Разность " + differenceDouble);
        System.out.println("Умножение " + productDouble);
        System.out.println("Деление " + quotientDouble);
        System.out.println("Сумма " + sumInt);
        System.out.println("Разность " + differenceInt);
        System.out.println("Умножение " + productInt);
        System.out.println("Деление " + quotientInt);
    }
}
