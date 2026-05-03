public class Cachorro {
    // atributos
    String nome;
    String raca;
    int idade;
 
    // construtor: inicializa os atributos do objeto
    public Cachorro(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }
 
    // método: comportamento do cachorro
    public String latir() {
        return nome + "está latindo: Au Au!";
    }
 
    // método: comportamento do cachorro
    public String comer(String comida) {
        return nome + "está comendo" + comida + ".";
    }
 
    public static void main(String[] args) {
    // Criação de objetos (instâncias da classe Cachorro)
    Cachorro cachorro1 = new Cachorro("Rex", "Labrador", 3);
    Cachorro cachorro2 = new Cachorro("Bolinha", "Poodle", 5);

    // Acessando atributos dos objetos
    System.out.println("Nome: " + cachorro1.nome + ", Raça: " + cachorro1.raca + ", Idade: " + cachorro1.idade + " anos");
    System.out.println("Nome: " + cachorro2.nome + ", Raça: " + cachorro2.raca + ", Idade: " + cachorro2.idade + " anos");

    // Chamando métodos dos objetos
    System.out.println(cachorro1.latir());
    System.out.println(cachorro2.comer("ração"));
}
   
    }
}
