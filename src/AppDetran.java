import javax.swing.JOptionPane;

public class AppDetran {
    public static void main(String[] args) throws Exception {
        
        Carro carro1 = new Carro();

        Proprietario prop1 = new Proprietario();

        carro1.setModelo(JOptionPane.showInputDialog("Digite o modelo do carro"));

        prop1.setNome(JOptionPane.showInputDialog("Digite o nome do proprietario!"));
        prop1.setCarros(carro1.getModelo()); 
    }
}
