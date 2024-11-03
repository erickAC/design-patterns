package strategy;

public class CalculadoraJuros {
    
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public double calcularJuros(double valor) {
        return strategy.calcular(valor);
    }


}
