
//Criando uma classe abstrata Pessoa
abstract class Pessoa {
    protected String nome;

    public Pessoa(String nome) {

        this.nome = nome;
    }

    public  String enviarEmail(String mensagem){
        return mensagem;
    }
}

    // Classe extend Pessoa
class Professor extends Pessoa {

    //obtendo nome da pessa através da superclasse
    public Professor(String nome) {
        super(nome);
    }

    // Utilizando Override para indicar que estou sobrescrevendo um método da classe pai
    @Override
    //Utilizando  metodo
    public String enviarEmail(String mensagem) {

        return "Olá Prof." + nome + " !"  + mensagem;
    }
}

    // Classe extend Aluno
class Aluno extends Pessoa {

    public Aluno(String nome) {
        super(nome);
    }
        // Utilizando Override para indicar que estou sobrescrevendo um método da classe pai
    @Override
    public String enviarEmail(String mensagem) {
        return "Olá Aluno." + nome + " !"  + mensagem;
    }
}

