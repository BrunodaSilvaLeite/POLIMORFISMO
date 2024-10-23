//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Instanciando os objetos
        Pessoa PessoaProf = new Professor("Alan Turing");
        Pessoa PessoaAluno = new Aluno("Joseph");

        //Utilizando o mesmo método, mas com as particularidades de cada classe
        System.out.println(PessoaProf.enviarEmail("Estou ansioso para a aula de hoje."));
        System.out.println(PessoaAluno.enviarEmail("Gostaria de saber mais sobre a prova."));
        }
    }
