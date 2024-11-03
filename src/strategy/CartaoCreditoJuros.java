package strategy;

public class CartaoCreditoJuros implements Strategy{

    @Override
    public double calcular(double valor) {
        return valor * 0.1;
    }
    
}
