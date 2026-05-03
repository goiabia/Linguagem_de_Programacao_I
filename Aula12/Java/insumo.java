public class Insumo {

    // Passo 1: Atributos privados
    private String nome;
    private int quantidade;
    private int mesValidade;

    public Insumo(String nome, int quantidade, int mesValidade) {
        this.nome       = nome;
        this.quantidade = quantidade;
        // Usa o setter no construtor para já aplicar a validação
        this.mesValidade = 0;
        setMesValidade(mesValidade);
    }

    // Passo 2: O Filtro de Sanidade (Nível Intermediário)
    public void setMesValidade(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mesValidade = mes;
        } else {
            System.out.println("ERRO: Mês '" + mes + "' inválido para '"
                + this.nome + "'. Informe entre 1 e 12. Valor original mantido.");
        }
    }

    public int getMesValidade() { return this.mesValidade; }
    public String getNome()     { return this.nome; }

    // Passo 3: A Trava de Segurança Final (Nível Avançado)
    public boolean estaValido(int mesAtual) {
        if (this.mesValidade < mesAtual) {
            System.out.println("ALERTA: Risco de Amendoim Murcho! '"
                + this.nome + "' está VENCIDO (validade: mês "
                + this.mesValidade + ", mês atual: " + mesAtual + ").");
            return false;
        }
        return true;
    }
}
