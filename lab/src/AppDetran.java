import java.util.ArrayList;

public class AppDetran {

    static void testaCriarProprietario(){
       

        Carro carro1 = new Carro("Chevette");

        Carro carro2 = new Carro("Uno");

        ArrayList<Carro> listaCarro = new ArrayList<Carro>();

        listaCarro.add(carro1);
        listaCarro.add(carro2);
        Proprietario  proprietario = new Proprietario("Marcelo Duarte", 333444774,listaCarro);

        proprietario.mostrarCarros();

    }

    static void testaCriarMulta(){
        Carro carro1 = new Carro("Fusca");

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
