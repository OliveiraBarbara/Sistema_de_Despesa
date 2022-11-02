package syspesa.executar;

import java.util.List;
import javax.swing.JOptionPane;
import syspesa.despesas.Despesas_Base;
import syspesa.excecoes.InvalidoException;
import syspesa.fornecedor.Fornecedor;
import syspesa.menu.MenuRelatorio;
import syspesa.menu.MenuToString;

/**
 *
 * @author barbara
 */
public class Relatorio implements Executa {

    @Override
    public void executa(List<Fornecedor> fornecedores, List<Despesas_Base> despesas) throws InvalidoException, Exception {
        String op = JOptionPane.showInputDialog(MenuToString.menuToString(MenuRelatorio.values()) + "Digite qual opção deseja:");
        int opx = Integer.parseInt(op);

        MenuRelatorio item = MenuRelatorio.values()[opx - 1];
        item.getAcao().executa(fornecedores, despesas);
    }
}

//Nesse método eu peço pra ele mostrar o menu do relatório e peço para o usuário digitar a opção deseja e em seguida eu executo a ação.