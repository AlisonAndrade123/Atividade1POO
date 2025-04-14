public class Estudante {
    String nome;
    int matricula;
    double n1, n2, n3;


    public Estudante(String nome, int matricula, double n1, double n2, double n3) {
        this.nome = nome;
        this.matricula = matricula;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }
    public double getMedia() {
        return (n1 + n2 + n3) / 3;
    }


    public String status() {
        return getMedia() >= 70 ? "Aprovado" : "Reprovado";
    }


    public static void main(String[] args) {
        Estudante estudante1 = new Estudante("João Silva", 12345, 75, 80, 90);
        Estudante estudante2 = new Estudante("Maria Oliveira", 67890, 50, 60, 65);


        System.out.println("Nome: " + estudante1.nome);
        System.out.println("Matrícula: " + estudante1.matricula);
        System.out.println("Média: " + estudante1.getMedia());
        System.out.println("Status: " + estudante1.status());


        System.out.println();


        System.out.println("Nome: " + estudante2.nome);
        System.out.println("Matrícula: " + estudante2.matricula);
        System.out.println("Média: " + estudante2.getMedia());
        System.out.println("Status: " + estudante2.status());
    }
}
