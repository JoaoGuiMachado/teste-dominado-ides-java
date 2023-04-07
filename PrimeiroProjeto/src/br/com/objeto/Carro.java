package br.com.objeto;

public class Carro {
    String cor;
    String modelo;
    int capacidadeTanque;
    
    Carro(){

    }
    
    Carro(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    void setCor(String cor) {
        this.cor = cor;
    }
    String getCor() {
        return cor;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }
    String getModelo() {
        return modelo;
    }

    int getCapacidadeTanque() {
        return capacidadeTanque;
    }
    void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    double totalValorTanque(double valorCombustivel) {
        return capacidadeTanque * valorCombustivel;
    }

    public char[] valorCombustivel(double d) {
        return null;
    }
    
}


