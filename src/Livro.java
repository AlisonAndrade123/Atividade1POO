public class Livro {
    String titulo;
    String autor;
    float preco;


    public Livro(String titulo, String autor, float preco){
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;


    }


    public void getInformacoes() {
        System.out.printf("%s - %s - R$%.2f", autor, titulo, preco);
    }




    public static void main(String[] args) {
        Livro livro1 = new Livro("A revolução dos bichos", "George Orwell", 36.99f);
        livro1.getInformacoes();




    }


}
