package com.nicolas.camillo.conversortrabalhoidadelombok.modelo;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Conversoridade {
    @Getter @Setter
    private byte idade;


    public double mostrarIdademes(){
        return (idade*12);
    }

    public double mostrarIdadeDias(){
        return (idade*365);
    }

    public double mostrarIdadesemanas(){
        return (idade*53);
    }
}
