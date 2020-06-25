package com.nicolas.camillo.conversortrabalhoidadelombok.controle;

import com.nicolas.camillo.conversortrabalhoidadelombok.modelo.Conversoridade;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversoridadeControle {

    @GetMapping("/")
    public String mensagem(){
        return "Seja Bem Vindo Ao Conversor de Idade!";
    }
    @GetMapping("/calculo")
    public String getConclusao(){

        Conversoridade c = new Conversoridade();

        c.setIdade((byte) 33);

        return "Resultados: "+c.getIdade()+
                "\nMeses: "+c.mostrarIdademes()+
                "\nSemanas: "+c.mostrarIdadesemanas()+
                "\nDias: "+c.mostrarIdadeDias();
    }

}
