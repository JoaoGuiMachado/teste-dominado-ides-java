package br.com.objeto;

public class RodarAplicacao {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.setCor("azul");
        carro1.setModelo("BMW Série 3");
        carro1.setCapacidadeTanque(59);
        
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.valorCombustivel(6.39));

        Carro carro2 = new Carro("cinza", "Mercedes-Benz Classe C", 66);

        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.valorCombustivel(6.46));

    }
}
