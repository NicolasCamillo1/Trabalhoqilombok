package com.nicolas.camillo.conversormonetariolombok.controle;
import com.nicolas.camillo.conversormonetariolombok.modelo.Conversor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversorControle {
    @GetMapping("/")
    public String mensagem() {
        return "Seja Bem vindo ao Conversor Monetário do Nicao!";
    }

    @GetMapping("/cotacao")
    public String getCotacao() {
        Conversor a = new Conversor();

        a.setReal(10);

        return
                "\nDolar $: " +a.cotacaoDolar()+
                "\nEuro :" +a.cotacaoEuro();


    }
}
