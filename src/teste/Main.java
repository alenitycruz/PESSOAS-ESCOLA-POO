package teste;

public class Main {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Ananda", 14, "F");
        p[1] = new Pessoa("Victor", 9,"M");

        l[0] = new Livro("Mansfield Park", "Jane Austen", 300, p[0]);
        l[1] = new Livro("Sherlock Holmes", "Conan Boyle", 1000, p[0]);
        l[2] = new Livro("O Conde de Monte Cristo", "Alexandre Dumas", 500, p[1]);
    }
}
