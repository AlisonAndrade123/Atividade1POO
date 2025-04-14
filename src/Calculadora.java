public class Calculadora {


    public double soma(double a, double b){
        return a + b;
    }


    public double subtracao(double a, double b){
        return a - b;
    }


    public double multiplicacao(double a, double b){
        return a * b;
    }


    public double divisao(double a, double b){
        return a / b;
    }


    public static void main(String[] args) {
        Calculadora calcula = new Calculadora();


        System.out.println("soma: " + calcula.soma(10,2));
        System.out.println("soma: " + calcula.divisao(10,2));
        System.out.println("soma: " + calcula.multiplicacao(10,2));
        System.out.println("soma: " + calcula.subtracao(10,2));
    }
}
