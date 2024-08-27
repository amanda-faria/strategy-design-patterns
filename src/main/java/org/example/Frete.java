package org.example;

public class Frete {

    private float valor;

    public float getFrete() {
        return valor;
    }

    public void freteSimples(float valorBase, float valorDistancia) {
        CalculadoraFrete calculadora = new CalculadoraFrete(valorBase, valorDistancia);
        this.valor = calculadora.calcular(new FreteSimples());
    }

    public void freteExpresso(float valorBase, float valorDistancia) {
        CalculadoraFrete calculadora = new CalculadoraFrete(valorBase, valorDistancia);
        this.valor = calculadora.calcular(new FreteExpesso());
    }

    public void freteInternacional(float valorBase, float valorDistancia) {
        CalculadoraFrete calculadora = new CalculadoraFrete(valorBase, valorDistancia);
        this.valor = calculadora.calcular(new FreteInternacional());
    }

    public void freteGratis(float valorBase, float valorDistancia) {
        CalculadoraFrete calculadora = new CalculadoraFrete(valorBase, valorDistancia);
        this.valor = calculadora.calcular(new FreteGratis());
    }

}