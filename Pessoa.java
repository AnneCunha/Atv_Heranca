public class Pessoa {
    protected String nome;
    protected String telefone;
    protected String cpf;
    protected String senha;
    protected String endereco;

    public Pessoa(String nome, String telefone, String cpf, String senha, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.senha = senha;
        this.endereco = endereco;
    }

    public boolean autenticar(String senhaInformada) {
        return this.senha.equals(senhaInformada);
    }

    public void realizarLogin() {
        System.out.println("===== Login realizado com sucesso!=====");
        System.out.println("===== Dados do usuário =====\n");
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco);
    }

    public String getNome() {
        return nome;
    }
}
