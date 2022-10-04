public class Multa{

    public Multa(){
        contMulta++;
    }
    private int contMulta=0;
    private String infracao;
    private double valor;
    
    public String getInfracao() {
        return infracao;
    }
    public void setInfracao(String infracao) {
        this.infracao = infracao;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public int getContMulta(){
        return contMulta;
    }



}