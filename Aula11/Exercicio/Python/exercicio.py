class Produto:
    def __init__(self, nome, preco, quantidade, categoria):
        self.__nome = nome
        self.__preco = preco
        self.__quantidade = quantidade
        self.__categoria = categoria

    def aplicar_desconto(self, percentual):
        self.__preco -= self.__preco * (percentual / 100)
        return f"Novo preço de '{self.__nome}': R$ {self.__preco:.2f}"

    def atualizar_estoque(self, qtd):
        self.__quantidade += qtd
        return f"Estoque de '{self.__nome}': {self.__quantidade} unidades"

    def exibir_detalhes(self):
        return (f"Produto: {self.__nome} | Categoria: {self.__categoria} "
                f"| Preço: R$ {self.__preco:.2f} | Qtd: {self.__quantidade}")

    def verificar_disponibilidade(self):
        return "Disponível" if self.__quantidade > 0 else "Indisponível"

# Instanciando 3 objetos
p1 = Produto("Notebook", 3500.00, 10, "Eletrônicos")
p2 = Produto("Cadeira Gamer", 1200.00, 5, "Móveis")
p3 = Produto("Mouse", 150.00, 0, "Periféricos")

print(p1.exibir_detalhes())
print(p2.aplicar_desconto(10))
print(p3.verificar_disponibilidade())
