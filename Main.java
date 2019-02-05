/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args ){
        String x = "alice";
        String y = "bob";
        Scanner input = new Scanner(System.in);
        System.out.println("Hi user, what's your name?");
        String name = input.nextLine();
        name = name.toLowerCase();
        
        if(name.equals(x) || name.equals(y)){
            System.out.println("Hello " + name + "!");
        }
        else{
            System.out.println("Who are you?!?!?!");
        }
    }
}
