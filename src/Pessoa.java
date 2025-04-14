public class Pessoa {


    String nome;
    int idade;
    String endereco;


    public Pessoa(String nome, int idade, String endereco){
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;


    }


    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Alison", 19, "Esperança-PB");


        System.out.println(pessoa1.nome);
        System.out.println(pessoa1.idade);
        System.out.println(pessoa1.endereco);


    }
}
