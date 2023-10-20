import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int a = number();
        int b = number();
        char o=operation();
        int result=calculator(a, b, o);

        System.out.println(result);

    }

    public static int number() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        while (!scanner.hasNextInt()){
            scanner.next();
            System.out.println("Некоректное число");
        }
        int num=scanner.nextInt();
        return num;

    }

    public static char operation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите операцию: ");
        while (!scanner.hasNext()){
            scanner.next();
            System.out.println("Такой операции нет");
        }
        char op=scanner.next().charAt(0);
        return op;

    }

    public static int calculator(int a,int b, char o) {
        int result = 0;
        switch (o) {
            case '+':
                result=a+b;
                break;
            case '-':
                result=a-b;
                break;
            case '*':
                result=a*b;
                break;
            case '/':
                result=a/b;
                break;
            default:
                System.out.println("Повторите попытку");
                result=calculator(a,b,operation());

        }
        return result;
    }
}