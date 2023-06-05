import javax.swing.*;

public class imc {

    public static void main(String[] args) {

        String peso;
        String altura;
        float pesoint;
        float alturaint;
        Float imc;

        peso = JOptionPane.showInputDialog("Digite o seu peso em quilogramas.");
        pesoint = Integer.parseInt(peso);
        altura = JOptionPane.showInputDialog("Digite a sua altura em centímetos.");
        alturaint = Integer.parseInt(altura);
        imc = pesoint / (alturaint * alturaint);
        JOptionPane.showMessageDialog(null, "Seu imc é: " + imc);
    }
}