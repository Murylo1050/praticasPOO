public class Gladiador extends Combatente{

    public Gladiador(String identificacao) {
        super(identificacao);

         arma = new Arma();
         armadura = new Armadura();

        //TODO Auto-generated constructor stub
    }

    Arma arma;
    Armadura armadura;

    @Override
    public void atacar(Combatente adversario){
        if(Math.random()>0.5){
            adversario.defender(arma.getGolpe(0).getPoderOfensivo());
        }else{
            adversario.defender(arma.getGolpe(1).getPoderOfensivo());
        }

    }

    @Override
    public String toString() {
        String retorno = "Gladiador [identificacao=" + identificacao + ", arma=" + arma + ", armadura=" + armadura + "]";


        return retorno;
    }

    
   
     
}
