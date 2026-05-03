#include <iostream>
#include <string>
 
class Cachorro{
 
public:
    // atributos
    std::string nome;
    std::string raca;
    int idade
 
    // construtor: inicializa os atributos do objeto
    Cachorro(std::string n, std::string r, int i) {
        nome = n;
        raca = r;
        idade = i;
    }
 
    // método: comportamento do cachorro
    std::string latir(){
        return nome + "está latindo: Au Au!"
    }
 
    // método: comportamento do cachorro
    std::string comer(std::string comida) {
        return nome + "está comendo" + comida + ".";
    }
};
 
int main() {
    return 0;

int main() {
    // Criação de objetos (instâncias da classe Cachorro)
    Cachorro cachorro1("Rex", "Labrador", 3);
    Cachorro cachorro2("Bolinha", "Poodle", 5);

    // Acessando atributos dos objetos
    std::cout << "Nome: " << cachorro1.nome << ", Raça: " << cachorro1.raca 
              << ", Idade: " << cachorro1.idade << " anos" << std::endl;

    std::cout << "Nome: " << cachorro2.nome << ", Raça: " << cachorro2.raca 
              << ", Idade: " << cachorro2.idade << " anos" << std::endl;

    // Chamando métodos dos objetos
    std::cout << cachorro1.latir() << std::endl;
    std::cout << cachorro2.comer("ração") << std::endl;

    return 0;
}
}
