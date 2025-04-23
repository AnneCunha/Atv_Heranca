public class Aluno extends Pessoa {
    public Aluno(String nome, String telefone, String cpf, String senha, String endereco) {
        super(nome, telefone, cpf, senha, endereco);
    }

    @Override
    public void realizarLogin() {
        System.out.println("Tipo de usuário: Aluno\n");
        super.realizarLogin();
    }
}
