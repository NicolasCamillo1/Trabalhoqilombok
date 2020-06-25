package com.nicolas.camillo.trabalhocalculadoralombok.controle;


import com.nicolas.camillo.trabalhocalculadoralombok.modelo.Calculadora;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calculadoraControle {

    @GetMapping("/")
    public String mensagem() {
        return "Bem vindo a calculadora";
    }
    @GetMapping("/calcular")
        public String getCalcular(){

            Calculadora c = new Calculadora();

            c.setValor1(10);
            c.setValor2(5);

            return "Valor 1:"+c.getValor1()+
                    "\nValor 2:"+c.getValor2()+
                    "\nSoma: "+c.calcularSomar()+
                    "\nSubtracao: "+c.calcularSubtracao()+
                    "\nMultiplicacao: "+c.calcularMultiplicacao()+
                    "\nDivisao: "+c.calcularDivisao();
        }
    }

