package syspesa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import syspesa.despesas.Despesas_Base;
import syspesa.excecoes.InvalidoException;
import syspesa.fornecedor.Fornecedor;
import syspesa.gravarler.Carregador;
import syspesa.gravarler.LeitorGravadorDesp;
import syspesa.gravarler.LeitorGravadorForne;
import syspesa.menu.MenuPrincipal;
import syspesa.menu.MenuToString;

/**
 *
 * @author barbara
 */
public class Principal {

    public static void main(String[] args) throws Exception {
        boolean sair = false;
        try {
            List<Fornecedor> fornecedores = Carregador.carregarForne(new LeitorGravadorForne());
            List<Despesas_Base> despesas = Carregador.carregarDesp(new LeitorGravadorDesp());
            if (fornecedores == null) 
                fornecedores = new ArrayList<Fornecedor>();

            if (despesas == null)
                despesas = new ArrayList<Despesas_Base>();

            while (sair == false) {
                try {
                    int op = Integer.parseInt(JOptionPane.showInputDialog(MenuToString.menuToString(MenuPrincipal.values()) + "Digite a opção desejada: "));

                    MenuPrincipal item = MenuPrincipal.values()[op - 1];
                    item.getAcao().executa(fornecedores, despesas);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Valor Inválido", "SYSPESA", JOptionPane.ERROR_MESSAGE);
                } catch (InvalidoException ex) {
                    JOptionPane.showMessageDialog(null, "Erro de validação de campo: " + ex.getMessage(), "SYSPESA", JOptionPane.ERROR_MESSAGE);
                } catch (IndexOutOfBoundsException ex) {
                    JOptionPane.showMessageDialog(null, "Opção Inválida!", "SYSPESA", JOptionPane.ERROR_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado durante a execucao do programa" + ex.getMessage(), "SYSPESA", JOptionPane.ERROR_MESSAGE);
                }
            }

            MenuPrincipal.SAIR.getAcao().executa(fornecedores, despesas);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Problema de persistência: " + ex.getMessage(), "SYSPESA", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "A classe conta não foi encontrada;\nO programa será encerrrado", "SYSPESA", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado durante a execucao do programa" + ex.getMessage(), "SYSPESA", JOptionPane.ERROR_MESSAGE);
        }
    }
}
//Primeiro eu carrego os arquivos de fornecedor e despesas nas suas respectivas listas, caso eles não existam eu somente inicializo a lista;
//Depois, dentro de um enquanto eu mostro o menu principal e peço para digitar a opção desejada;
//Atravéz do enum do menu, eu direciono qual função deve ser excutada;
//Caso aconteça alguma coisa fora do padrão, é mostrado a exceção;
//Em seguida, quando aperto a opção 4 referente a sair, eu gravo as listas nos arquivos e fecho o programa;
//Caso aconteça algo a mais fora do padrão, é apresentado as exceção.