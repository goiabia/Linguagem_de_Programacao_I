public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    private String categoria;

    public Produto(String nome, double preco, int quantidade, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.categoria = categoria;
    }

    public String aplicarDesconto(double percentual) {
        this.preco -= this.preco * (percentual / 100);
        return "Novo preço de '" + nome + "': R$ " + String.format("%.2f", preco);
    }

    public String atualizarEstoque(int qtd) {
        this.quantidade += qtd;
        return "Estoque de '" + nome + "': " + quantidade + " unidades";
    }

    public String exibirDetalhes() {
        return "Produto: " + nome + " | Categoria: " + categoria
             + " | Preço: R$ " + String.format("%.2f", preco)
             + " | Qtd: " + quantidade;
    }

    public String verificarDisponibilidade() {
        return quantidade > 0 ? "Disponível" : "Indisponível";
    }

    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 3500.00, 10, "Eletrônicos");
        Produto p2 = new Produto("Cadeira Gamer", 1200.00, 5, "Móveis");
        Produto p3 = new Produto("Mouse", 150.00, 0, "Periféricos");

        System.out.println(p1.exibirDetalhes());
        System.out.println(p2.aplicarDesconto(10));
        System.out.println(p3.verificarDisponibilidade());
    }
}
