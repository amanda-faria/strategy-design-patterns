package org.example;

public class FreteInternacional implements Operacao{

    private float taxaInternacional = 35;


    public float calcular(float valorBase, float valorDistancia) {
        return valorBase + (valorDistancia * 2)  + taxaInternacional ;
    }
}
