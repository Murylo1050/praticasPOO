import java.util.ArrayList;




public class Proprietario {


    public Proprietario(String nome,int CNH){
        this.cnh = CNH;
        this.nome = nome;
    }

    private String nome;
    int cnh;
    private ArrayList<Carro> carros = new ArrayList<Carro>();

    public void mostrarCarros(){
        for (Carro carro : carros) {
            System.out.println("Modelo: " + carro.getModelo());
        }
    }
    
    public int getCNH() {
        return cnh;
   }
    public void setCNH(int cNH) {
        this.cnh = cNH;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Carro> getCarros() {
        return carros;
    }
    public void setCarros(Carro carros){
        this.carros.add(carros);
    }
}
