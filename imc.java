import javax.swing.*;

public class imc {
    // essa função recebe um id para imprimir a mensagem sobre o imc do usuário
    public static void Informacoes(int id) {
        if (id == 1) {
            JOptionPane.showMessageDialog(null, "Você está muito abaixo do peso!");
        } else if (id == 2) {
            JOptionPane.showMessageDialog(null, "Você está abaixo do peso!");
        } else if (id == 3) {
            JOptionPane.showMessageDialog(null, "Parabéns. Seu peso está Normal");
        } else if (id == 4) {
            JOptionPane.showMessageDialog(null, "Você está acima do peso");
        } else if (id == 5) {
            JOptionPane.showMessageDialog(null, "Você está em obesidade Grau 1");
        } else if (id == 6) {
            JOptionPane.showMessageDialog(null, "Você está em obesidade Grau 2 (severa)");
        } else if (id == 7) {
            JOptionPane.showMessageDialog(null, "Você está em obesidade Grau 3 (mórbida)");
        } else {
            JOptionPane.showMessageDialog(null, "Erro no cálculo do IMC.");
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
        JOptionPane.showMessageDialog(null, "Seu IMC é: " + imc);

        if (imc <= 17) {
            return 1;
        } else if (imc <= 18.49) {
            return 2;
        } else if (imc <= 24.99) {
            return 3;
        } else if (imc <= 29.99) {
            return 4;
        } else if (imc <= 34.99) {
            return 5;
        } else if (imc <= 39.99) {
            return 6;
        } else if (imc >= 40) {
            return 7;
        } else {
            return 0;
        }

    }

    public static void main(String[] args) {

        Informacoes(Mensagens());
    };

}