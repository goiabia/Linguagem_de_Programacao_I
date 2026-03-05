using System;

class Calculadora
{
    static void Main()
    {
        Console.Write("Digite o primeiro número: ");
        double num1 = Convert.ToDouble(Console.ReadLine());

        Console.Write("Digite a operação (+, -, *, /): ");
        string op = Console.ReadLine();

        Console.Write("Digite o segundo número: ");
        double num2 = Convert.ToDouble(Console.ReadLine());

        double resultado = 0;

        switch (op)
        {
            case "+":
                resultado = num1 + num2;
                break;

            case "-":
                resultado = num1 - num2;
                break;

            case "*":
                resultado = num1 * num2;
                break;

            case "/":
                resultado = num1 / num2;
                break;

            default:
                Console.WriteLine("Operação inválida");
                return;
        }

        Console.WriteLine("Resultado: " + resultado);
    }
}
