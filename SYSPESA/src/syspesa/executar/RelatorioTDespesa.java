package syspesa.executar;

import java.util.List;
import javax.swing.JOptionPane;
import syspesa.despesas.Despesas_Base;
import syspesa.fornecedor.Fornecedor;

/**
 *
 * @author barbara
 */
public class RelatorioTDespesa implements Executa {

    @Override
    public void executa(List<Fornecedor> fornecedores, List<Despesas_Base> despesas) {
        int tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo de despesas que deseja ver:\n1-(AGUA)/2-(ENERGIA)/3-(SERVICO)/4-(PRODUTOS)"));
        for (int i = 0; i < despesas.size(); i++) {
            if (despesas.get(i).getForne().getTipo().getValue() == tipo) {
                JOptionPane.showMessageDialog(null, despesas.get(i).toString());
            }
        }
    }

}
//Nesse método eu mostro o relatório por tipo de despesa, pedindo para o usuário digitar qual tipo deseja ver e comparo com os valor que eu já tenho armazenados no arquivo.
