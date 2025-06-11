public class Desafio01 {
    public static void main(String[] args) {
        String nome = "Luis Fernando Souza Pinto";
        int idade = 21;
        double altura = 1.73;
        boolean estudante = true;

        String saida = String.format("""
                Nome: %s
                Idade: %d
                Altura: %.2f
                É estudante: %b
                """,
                nome,
                idade,
                altura,
                estudante
        );

        System.out.println(saida);
    }
}
