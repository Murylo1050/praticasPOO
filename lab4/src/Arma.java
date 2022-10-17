public class Arma {

    public Arma(){
        golpe[0] = new Golpe();
        golpe[1] = new Golpe();
    }

    private String descricao;
   

    private Golpe golpe[] = new Golpe[2];
    
    
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Golpe getGolpe(int posicao) {
        return golpe[posicao];
    }
    public void setGolpe(Golpe[] golpe) {
        this.golpe = golpe;
    }


    @Override
    public String toString() {
        String retorno = "Arma [descricao=" + descricao + "]";
        
        return retorno;
    }
}

