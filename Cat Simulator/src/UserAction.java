import java.util.Scanner;

/**
 * Created by VioLeY on 18.09.2014.
 */
public class UserAction {
    Scanner scanner = new Scanner(System.in);
    public boolean CheckAnswer(){
        String answer = scanner.next();
        return answer.equals("+");
    }
}
