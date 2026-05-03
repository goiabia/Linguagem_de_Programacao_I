#include <iostream>
#include <string>
using namespace std;

class Produto {
private:
    string nome;
    double preco;
    int quantidade;
    string categoria;

public:
    Produto(string n, double p, int q, string c)
        : nome(n), preco(p), quantidade(q), categoria(c) {}

    string aplicarDesconto(double percentual) {
        preco -= preco * (percentual / 100);
        return "Novo preco de '" + nome + "': R$ " + to_string(preco);
    }

    string atualizarEstoque(int qtd) {
        quantidade += qtd;
        return "Estoque de '" + nome + "': " + to_string(quantidade) + " unidades";
    }

    string exibirDetalhes() {
        return "Produto: " + nome + " | Categoria: " + categoria
             + " | Preco: R$ " + to_string(preco)
             + " | Qtd: " + to_string(quantidade);
    }

    string verificarDisponibilidade() {
        return quantidade > 0 ? "Disponivel" : "Indisponivel";
    }
};

int main() {
    Produto p1("Notebook", 3500.00, 10, "Eletronicos");
    Produto p2("Cadeira Gamer", 1200.00, 5, "Moveis");
    Produto p3("Mouse", 150.00, 0, "Perifericos");

    cout << p1.exibirDetalhes() << endl;
    cout << p2.aplicarDesconto(10) << endl;
    cout << p3.verificarDisponibilidade() << endl;

    return 0;
}
