public class Jogador {
    String nome;
    int nivel;
    int pontos;


    public Jogador(String nome) {
        this.nome = nome;
        this.nivel = 0;
        this.pontos = 0;
    }


    public void subirNivel() {
        this.nivel++;
    }


    public void ganharPontos(int pontos) {
        if (pontos > 0) {
            this.pontos += pontos;
        }
    }


    public String toString() {
        return "Jogador: " + nome + ", Nível: " + nivel + ", Pontos: " + pontos;
    }




    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Lucas");


        jogador1.subirNivel();
        jogador1.ganharPontos(10);


        System.out.println(jogador1);
    }
}
