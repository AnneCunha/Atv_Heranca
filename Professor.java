public class Professor extends Pessoa {
    public Professor(String nome, String telefone, String cpf, String senha, String endereco) {
        super(nome, telefone, cpf, senha, endereco);
    }

    @Override
    public void realizarLogin() {
        System.out.println("Tipo de usuário: Professor\n");
        super.realizarLogin();
    }
}
