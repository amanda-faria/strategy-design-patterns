package org.example;

public class FreteExpesso implements Operacao {
    private float taxaExpresso = 15;


    public float calcular(float valorBase, float valorDistancia) {
        return valorBase + (valorDistancia * 2)  + taxaExpresso ;
    }
}
