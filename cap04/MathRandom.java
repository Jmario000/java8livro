package cap04;

import javax.swing.JOptionPane;

public class MathRandom {

    public static void main(String[] args) {
        String senha = "";
        for (int i = 0; i < 10; i++) {
            int num = (int) (Math.random() * 10);
            senha += num;
        }
        JOptionPane.showMessageDialog(null, "Senha gerada: " + senha);

        for (int cartao = 1; cartao <= 2; cartao++) {
            String numerosCartao = "";
            for (int numCartao = 0; numCartao <= 6; numCartao++) {
                int num = (int) (Math.random() * 100);
                numerosCartao += num + " ";
            }
            JOptionPane.showMessageDialog(null, "Números do cartão " + cartao + "\n" + numerosCartao);
        }
        System.exit(0);
    }
}
