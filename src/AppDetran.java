

public class AppDetran {

    static void testaCriarProprietario(){
        Proprietario  proprietario = new Proprietario("Marcelo Duarte", 333444774);

        proprietario.setCarros(new Carro("Chevette","AFD3KJ2".toCharArray()));

        proprietario.setCarros(new Carro("Uno", "JKN3HH4".toCharArray()));

        proprietario.mostrarCarros();

    }

    static void testaCriarMulta(){
        Carro carro1 = new Carro("Fusca", "FHG4ERV".toCharArray());

        Multa multa1 = new Multa();

        multa1.setInfracao("Violacao de semaforo");
        multa1.setValor(147.65);

        carro1.setMultas(multa1);


        Multa multa2 = new Multa();

        multa2.setInfracao("Pneu excessivamente desgastado");
        multa2.setValor(95.60);

        carro1.setMultas(multa2);

        carro1.mostrarMultas();

        
    }


    public static void main(String[] args) throws Exception {
       
        testaCriarProprietario();

        testaCriarMulta();
    }
}
