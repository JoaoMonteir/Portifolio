import javax.swing.JOptionPane;

public class Calculadora {

    public static void main(String[] args) {
        while (true) {
            String menu = "Escolha uma operação:\n"
                        + "1 - Adição\n"
                        + "2 - Subtração\n"
                        + "3 - Multiplicação\n"
                        + "4 - Divisão\n"
                        + "5 - Sair";
            
            int escolha = Integer.parseInt(JOptionPane.showInputDialog(menu));
            
            if (escolha == 5) {
                JOptionPane.showMessageDialog(null, "Encerrando a calculadora.");
                break;
            }

            double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
            double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
            double resultado = 0;

            switch (escolha) {
                case 1 -> {
                    resultado = num1 + num2;
                    JOptionPane.showMessageDialog(null, "Resultado da adição: " + resultado);
                }
                case 2 -> {
                    resultado = num1 - num2;
                    JOptionPane.showMessageDialog(null, "Resultado da subtração: " + resultado);
                }
                case 3 -> {
                    resultado = num1 * num2;
                    JOptionPane.showMessageDialog(null, "Resultado da multiplicação: " + resultado);
                }
                case 4 -> {
                    if (num2 == 0) {
                        JOptionPane.showMessageDialog(null, "Erro: divisão por zero.");
                    } else {
                        resultado = num1 / num2;
                        JOptionPane.showMessageDialog(null, "Resultado da divisão: " + resultado);
                    }
                }
                default -> JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }
    }
}