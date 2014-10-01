import java.io.Console;
/**
 * Created by VioLeY on 18.09.2014.
 */
public class Programm {
    public static void main(String[] args) {
        System.out.println("Небольшой симулятор котейки.\nУправление : + = да, - = нет :)");
        Cat ourLazyCat = new Cat();
        ourLazyCat.WakeUp();
    }
}
