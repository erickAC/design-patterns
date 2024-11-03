package strategy;

public class Main {
    
    public static void main(String[] args) {
       
        CalculadoraJuros calculadoraJuros = new CalculadoraJuros();

        calculadoraJuros.setStrategy(new CartaoCreditoJuros());
        System.out.println("O valor é " + calculadoraJuros.calcularJuros(10));

        calculadoraJuros.setStrategy(new CartaoDebitoJuros());
        System.out.println("O valor é " + calculadoraJuros.calcularJuros(10));

    }

}
