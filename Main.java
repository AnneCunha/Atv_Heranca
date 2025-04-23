public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Anne", "99999-9999", "123.456.789-00");
        Professor professor = new Professor("André", "88888-8888", "987.654.321-00");
        Funcionario funcionario = new Funcionario("Paulo", "77777-7777", "111.222.333-44", 5000.00);

        aluno.realizarLogin();
        professor.realizarLogin();
        funcionario.realizarLogin();
    }
}
