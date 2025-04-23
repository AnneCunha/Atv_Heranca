public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome, String telefone, String cpf, double salario) {
        super(nome, telefone, cpf);
        this.salario = salario;
    }

    @Override
    public void realizarLogin() {
        super.realizarLogin();
        System.out.println("Bonificação: R$ " + calcularBonificacao());
    }

    public double calcularBonificacao() {
        return salario * 0.10; // 10% de bonificação
    }
}
