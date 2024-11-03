package strategy;

public class CartaoDebitoJuros implements Strategy{

    @Override
    public double calcular(double valor) {
        return valor * 0.2;
    }
    
}
