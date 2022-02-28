import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to the calculator");
        System.out.println("Enter a command");
        Calculator calculator = new Calculator();

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] command = line.split(" ");


            switch (command[0]) {
                case "add":
                    System.out.println(calculator.add(Integer.parseInt(command[1]), Integer.parseInt(command[2])));
                    break;
                case "subtract":
                    System.out.println(calculator.subtract(Integer.parseInt(command[1]), Integer.parseInt(command[2])));
                    break;
                case "multiply":
                    System.out.println(calculator.multiply(Integer.parseInt(command[1]), Integer.parseInt(command[2])));
                    break;
                case "divide":
                    System.out.println(calculator.divide(Integer.parseInt(command[1]), Integer.parseInt(command[2])));
                    break;
                case "fibonacci":
                    System.out.println(calculator.fibonacciNumberFinder(Integer.parseInt(command[1])));
                    break;
                case "binary":
                    System.out.println(calculator.intToBinaryNumber(Integer.parseInt(command[1])));
                    break;
            }











        }



    }

}
