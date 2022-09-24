import java.util.ArrayList;

public class Proprietario {
    private String nome;
    private ArrayList<String> carros = new ArrayList<String>();
    
 
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<String> getCarros() {
        return carros;
    }
    public void setCarros(ArrayList<String> carros) {
        this.carros = carros;

    }
}
