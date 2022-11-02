/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syspesa.executar;

import java.util.List;
import javax.swing.JOptionPane;
import syspesa.despesas.Despesas_Base;
import syspesa.fornecedor.Fornecedor;

/**
 *
 * @author barbara
 */

public class RelatorioMes implements Executa {

    @Override
    public void executa(List<Fornecedor> fornecedores, List<Despesas_Base> despesas) {
        String mes = JOptionPane.showInputDialog("Digite o mês que deseja ver as despesas");//pede pro Usuário digitar o mês e o ano que deseja ver as despesas 
        for (int i = 0; i < despesas.size(); i++) {
            String mesx = despesas.get(i).getDataPagamento().substring(3, 5);
            if (mesx.equals(mes)) {
                JOptionPane.showMessageDialog(null, despesas.get(i).toString());
            }
        }
    }
}
//Nesse método eu mostro o relatório po mes e por tipo, pedindo para o usuário digitar qual mes deseja ver e comparo com os valor que eu já tenho armazenados no arquivo.
//Na linha 24 eu extraiu da string da data do pagamento somente o mês que foi digitado e em seguida comparo ele com o mes que o usuario quer.