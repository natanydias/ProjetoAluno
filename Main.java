public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Natany", 12345, 8.5, 7.0);
        Aluno aluno2 = new Aluno("Victor", 67890, 5.0, 6.0);

        System.out.println("Dados do Aluno 1:");
        aluno1.mostrarDados();
        aluno1.verificarAprovacao();

        System.out.println();

        aluno2.notaAv2 = 7.5;

        System.out.println("Dados do Aluno 2 (atualizado):");
        aluno2.mostrarDados();
        aluno2.verificarAprovacao();
    }
}
