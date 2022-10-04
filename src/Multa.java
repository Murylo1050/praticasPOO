public class Multa{
    private int contMulta=0;

    public Multa(){
        contMulta++;
    }
    
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
    public void qtdMultasCriadas(){
        System.out.println("Foram criadas " + contMulta + " multas!");
    }



}