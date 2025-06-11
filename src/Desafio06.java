public class Desafio06 {
    public static void main(String[] args) {
        double preco = 150.00;
        String categoria;

        if (preco <= 50.0) {
            categoria = "Econômico";
        } else if (preco > 50.0 && preco <= 200.00) {
            categoria = "Intermediário";
        } else {
            categoria = "Premium";
        }

        System.out.println("Categoria do produto: " + categoria);
    }
}
