package org.example;

public class CalculadoraFrete {

    private float valorBase;
    private float valorDistancia;

    public CalculadoraFrete(float valorBase, float valorDistancia) {
        this.valorBase = valorBase;
        this.valorDistancia = valorDistancia;
    }

    public float calcular(Operacao operacao) {
        return operacao.calcular(valorBase, valorDistancia);
    }
}
