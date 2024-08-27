package org.example;

public class FreteGratis implements Operacao{

    private float desconto = 0;

    public float calcular(float valorBase, float valorDistancia) {
        return (valorBase + (valorDistancia * 2) ) * 0;
    }
}
