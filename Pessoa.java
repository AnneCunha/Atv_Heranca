public class Pessoa {
    protected String nome;
    protected String telefone;
    protected String cpf;

    public Pessoa(String nome, String telefone, String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public void realizarLogin() {
        System.out.println(nome + " fez login no sistema.");
    }
}
