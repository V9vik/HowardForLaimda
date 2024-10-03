import java.util.function.*;


public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c ;
        // Код работать не будет тк делится на 0
        // и выкидываться ошибка
        try {
            c = calc.divide.apply(a, b);
            calc.println.accept(c);
            // Код работать не будет тк делится на 0
        }catch (ArithmeticException e){
            System.out.println("Ошибка: " + e.getMessage());

        }
    }
}