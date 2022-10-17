public class Golpe {

    private int cont=0;
    public Golpe(){
        switch (cont) {
            case 0:
                nomeGolpe = "Ataque fraco";
                poderOfensivo = 15;
                cont++;
                break;
            case 1:
                nomeGolpe = "Ataque medio";
                poderOfensivo = 25;
                cont++;
                break;
            case 2:
                nomeGolpe = "Ataque forte";
                poderOfensivo = 35;
                cont++;
                break;

            case 3:
                nomeGolpe = "Golpe giratorio";
                poderOfensivo = 50;
                cont=0;
                break;
        }
    }
    private String nomeGolpe;
    private int poderOfensivo;


    public String getNomeGolpe() {
        return nomeGolpe;
    }
    public void setNomeGolpe(String nomeGolpe) {
        this.nomeGolpe = nomeGolpe;
    }

    public int getPoderOfensivo() {
        return poderOfensivo;
    }
    public void setPoderOfensivo(int poderOfensivo) {
        this.poderOfensivo = poderOfensivo;
    }
}
