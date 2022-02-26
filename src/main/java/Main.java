import java.util.Scanner;



public class Main {

    int main() {

        System.out.println("Welcome to the calculator");
        System.out.println("Enter a command");
        Calculator calculator = new Calculator();

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String command = sc.next();

            if (command.equals("add")) {
                System.out.println("Enter a number");
                int firstNum = Integer.parseInt(sc.next());
                System.out.println("Enter a number");
                int secondNum = Integer.parseInt(sc.next());
                calculator.add(firstNum, secondNum);
            }
        }



        return 0;
    }

}
