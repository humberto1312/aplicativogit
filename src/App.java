public class App {
    public static void main(String[] args) throws Exception {

        Pessoa pessoa1 = new Pessoa("João", 20);
        System.out.println(pessoa1.falar());
        Pessoa pessoa2 = new Pessoa("Maria", 30);
        System.out.println(pessoa2.falar());
    }

    private static class Pessoa {
        private String nome;
        private int idade;

        public Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public String falar() {
            return "Oi, eu sou " + nome + " e tenho " + idade + " anos.";
        }

        public String getNome() {
            return nome;
        }

        public int getIdade() {
            return idade;
        }
    }
}
