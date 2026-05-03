public class SistemaInsumos {
    public static void main(String[] args) {
        int mesAtual = 5; // maio

        // Insumo válido
        Insumo amendoimFresco = new Insumo("Amendoim Torrado",   20, 8);
        System.out.println(amendoimFresco.getNome() + " está válido? "
            + amendoimFresco.estaValido(mesAtual));          // true

        // Insumo vencido
        Insumo amendoimMurcho = new Insumo("Amendoim Granulado", 5, 3);
        System.out.println(amendoimMurcho.getNome() + " está válido? "
            + amendoimMurcho.estaValido(mesAtual));          // false + alerta

        // Mês inválido — setter bloqueia
        Insumo amendoimErrado = new Insumo("Amendoim Salgado",  10, 13);
        System.out.println("Validade mantida: "
            + amendoimErrado.getMesValidade());              // 0 (valor original)
    }
}
