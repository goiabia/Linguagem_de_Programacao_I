import java.util.Scanner;

public class ex1SistemaEstoqueP4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Produto poteChocolate = new Produto(nome: "Pote Chocolate 2L", estoqueReal: 15,
                estoqueIdeal: 100);
        Produto picoleLimao = new Produto(nome: "Picolé de Limão", estoqueReal: 50,
                estoqueIdeal: 100);

        // Testando a inteligência automatizada
        System.out.println("Chocolate precisa repor? " + poteChocolate.verificarNecessidadeCompra()); // True
        System.out.println("Limão precisa repor? " + picoleLimao.verificarNecessidadeCompra());       // False

        System.out.println(" -- Terminal de vendas do Dener --");
        System.out.println("Digite a quantidade de potes vendidos: ");

        try {
            int qtdvendida = Integer.parseInt(scanner.nextLine());
            poteChocolate.registrarSaida(qtdvendida);

        } catch (NumberFormatException e) {

            System.out.println("\n[Erro de Sistema]. Operação cancelada.");
            System.out.println("Valor digitado inválido. Por favor, insira apenas números inteiros (Ex: 15).");

        } finally {
            System.out.println("[Sistema] Liberando recursos de memória...]");
            scanner.close();
        }
    }
}