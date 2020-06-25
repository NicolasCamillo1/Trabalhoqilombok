package com.nicolas.camillo.trabalhocalculadoralombok.modelo;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Calculadora {


    @Getter @Setter
    private double valor1;
    @Getter @Setter
    private double valor2;

    public double calcularSomar(){
        return valor1+valor2;
    }

    public double calcularSubtracao(){
        return valor1-valor2;
    }

    public double calcularMultiplicacao(){
        return valor1*valor2;
    }

    public double calcularDivisao(){
        return valor1/valor2;
    }

}
