import java.util.ArrayList;


public class Carro {

        static int numSequencial=0;
    
    public Carro(String modelo){
    this.modelo = modelo;
    
    
		char digitosPlaca[] =  {65,65,65,48,65};
		
		
		for (int i = 0; i < 3; i++) {
		    digitosPlaca[i]+= (int)(Math.random() * 25); 
		}
		
		digitosPlaca[3] += (int)(Math.random() * 9); ; // 57
		
	    digitosPlaca[4]+= (int)(Math.random() * 25); 
		
		this.placa = String.copyValueOf(digitosPlaca);
		
		this.placa+= String.format("%03d", numSequencial++);

        
    }
    private String modelo;
    private String placa;
    private ArrayList<Multa> multas = new ArrayList<Multa>();

    public void mostrarMultas(){
        for (Multa multa : multas) {
            System.out.println("Multa: "+ multa.getInfracao());
        }
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public ArrayList<Multa> getMultas() {
        return multas;
    }

    public void setMultas(Multa multas) {
        this.multas.add(multas);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    

    
}
