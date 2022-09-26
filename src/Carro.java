import java.util.ArrayList;


public class Carro {
    
    public Carro(String modelo,char[] placa){
    this.modelo = modelo;
    this.placa = placa; 
}
    private String modelo;
    private char[] placa = new char[7];
    private ArrayList<Multa> multas = new ArrayList<Multa>();

    public void mostrarMultas(){
        for (Multa multa : multas) {
            System.out.println("Multa: "+ multa.getInfracao());
        }
    }

    public char[] getPlaca() {
        return placa;
    }

    public void setPlaca(char[] placa) {
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
