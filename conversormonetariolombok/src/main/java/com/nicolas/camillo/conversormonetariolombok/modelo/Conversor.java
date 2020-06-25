package com.nicolas.camillo.conversormonetariolombok.modelo;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Conversor {

    @Getter @Setter
    private double real;


    public double cotacaoDolar(){
        return real*5.15;
    }

    public double cotacaoEuro(){
        return real*5.83;
    }
}
