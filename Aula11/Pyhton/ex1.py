class Cachorro:
    # metódo construtor: inicializa os atributos do objeto
    def __init__(self,nome,raca,idade):
        self.nome = nome
        self.raca = raça
        self.idade = idade
   
    # método: comportamento do cachorro
    def latir(self):
        return f"{self.nome} está latindo: Au Au!"
 
    # método: comportamento do cachorro
    def comer(self, comida):
        return f"{self.nome} está comendo {comida}"

    # criação de objetos (instâncias da classe Cachorro)
    cachorro1 = Cachorro("Rex", "Labrador", 3)
    cachorro2 = Cachorro("Bolinha", "Poodle", 5)
    
    # acessando atributos dos objetos
    print(f"Nome: {cachorro1.nome}, Raça: {cachorro1.raca}, Idade: {cachorro1.idade} anos")
    print(f"Nome: {cachorro2.nome}, Raça: {cachorro2.raca}, Idade: {cachorro2.idade} anos")
    
    # chamando métodos dos objetos
    print(cachorro1.latir())
    print(cachorro2.comer("ração"))
