import javax.swing.*;

public class imc {
    // essa função recebe um id para imprimir as mensagens ao usuário
    public static void Informacoes(int id) {
        if (id == 1) {
            JOptionPane.showMessageDialog(null, "Você está muito abaixo do peso!");
        } else if (id == 2) {
            JOptionPane.showMessageDialog(null, "Você está abaixo do peso!");
        } else if (id == 3) {
            JOptionPane.showMessageDialog(null, "Peso Normal");
        } else if (id == 4) {
            JOptionPane.showMessageDialog(null, "Mensagem 4");
        } else if (id == 5) {
            JOptionPane.showMessageDialog(null, "Mensagem 5");
        } else if (id == 6) {
            JOptionPane.showMessageDialog(null, "Mensagem 6");
        } else if (id == 0) {
            JOptionPane.showMessageDialog(null, "Erro");
        }

    }

    // essa função exibe as caixas de diálogo pedido as informações peso e altura ao
    // usuários e
    // armazenando nas variáveis. em seguida retorna um id para exibir uma
    // observação sobre seu peso.
    public static int Mensagens() {
        String peso;
        String altura;
        float pesoint;
        float alturaint;
        Float imc;

        peso = JOptionPane.showInputDialog("Digite o seu peso em quilogramas.");
        pesoint = Integer.parseInt(peso);
        altura = JOptionPane.showInputDialog("Digite a sua altura em centímetos.");
        alturaint = Integer.parseInt(altura);
        imc = (pesoint / (alturaint * alturaint) * 10000);

        if (imc <= 17) {
            return 1;
        } else if (imc <= 18.49) {
            return 2;
        } else if (imc <= 24.99) {
            return 3;
        } else if (imc <= 34.99) {
            return 4;
        } else if (imc <= 39.99) {
            return 5;
        } else if (imc >= 40) {
            return 6;
        } else {
            return 0;
        }

    }

    public static void main(String[] args) {

        Informacoes(Mensagens());
    };

}