import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        char op = sc.next().charAt(0);

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        double resultado = 0;

        switch(op) {
            case '+':
                resultado = num1 + num2;
                break;

            case '-':
                resultado = num1 - num2;
                break;

            case '*':
                resultado = num1 * num2;
                break;

            case '/':
                resultado = num1 / num2;
                break;

            default:
                System.out.println("Operação inválida");
                return;
        }

        System.out.println("Resultado: " + resultado);
    }
}
