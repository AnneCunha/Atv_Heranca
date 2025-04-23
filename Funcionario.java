public class Funcionario extends Pessoa {
    private double salario;
    private String locacao;
    private int horasTrabalhadas;

    public Funcionario(String nome, String telefone, String cpf, String senha, String endereco,
                       double salario, String locacao, int horasTrabalhadas) {
        super(nome, telefone, cpf, senha, endereco);
        this.salario = salario;
        this.locacao = locacao;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public void realizarLogin() {
        System.out.println("Tipo de usuário: Funcionário\n");
        super.realizarLogin();
        System.out.println("Departamento: " + locacao);
        System.out.println("Horas trabalhadas: " + horasTrabalhadas);
        System.out.printf("Salário: R$ %.2f\n", salario);
        System.out.printf("Bonificação: R$ %.2f\n", calcularBonificacao());
    }

    public double calcularBonificacao() {
        return salario * 0.10;
    }
}

