package syspesa.executar;

import java.util.List;
import javax.swing.JOptionPane;
import syspesa.despesas.Agua;
import syspesa.despesas.Despesas_Base;
import syspesa.despesas.Energia;
import syspesa.despesas.Produto;
import syspesa.despesas.Servico;
import syspesa.despesas.TipoDespesa;
import syspesa.excecoes.CNPJInexistenteException;
import syspesa.excecoes.DispesaInexistenteException;
import syspesa.excecoes.InvalidoException;
import syspesa.excecoes.QuantidadeException;
import syspesa.excecoes.ValorException;
import syspesa.fornecedor.Fornecedor;
import syspesa.operacao.AddDespesa;
import syspesa.operacao.ProcuraCNPJ;
import syspesa.validacao.Valida;

/**
 *
 * @author barbara
 */
public class LancarDespesas implements Executa {

    @Override
    public void executa(List<Fornecedor> fornecedores, List<Despesas_Base> despesas) throws InvalidoException {

        int op = Integer.parseInt(JOptionPane.showInputDialog("Digite qual é o Número da Despesa:\n1-(AGUA)/2-(ENERGIA)/3-(SERVICO)/4-(PRODUTOS)"));
        double valor;
        int qtd;

        if (op <= 0 || op >= 5) {
            throw new DispesaInexistenteException();
        }

        String data = JOptionPane.showInputDialog("Digite a Data do Pagamento da Despesa:");
        Valida.DATA.valida(data);

        if (op == TipoDespesa.AGUA.getValor()) {
            String cnpj = JOptionPane.showInputDialog("Digite o CNPJ do Fornecedor da Despesa:");
            Valida.CNPJ.valida(cnpj);
            Fornecedor forne = ProcuraCNPJ.procuraCnpj(cnpj, fornecedores, op);
            if (forne == null) {
                throw new CNPJInexistenteException();
            }
            qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite foi a quantidade de quiloLitros de água gasta:"));
            if (qtd < 0) {
                throw new QuantidadeException();
            }
            valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o foi o valor final gasto na despesa de Agua:"));
            if (valor < 0) {
                throw new ValorException();
            }
            Despesas_Base despesa = new Agua(qtd, valor, data, forne);
            AddDespesa.criaDespesa(despesas, despesa);
        } else if (op == TipoDespesa.ENERGIA.getValor()) {
            String cnpj = JOptionPane.showInputDialog("Digite o CNPJ do Fornecedor da Despesa:");
            Valida.CNPJ.valida(cnpj);
            Fornecedor forne = ProcuraCNPJ.procuraCnpj(cnpj, fornecedores, op);
            if (forne == null) {
                throw new CNPJInexistenteException();
            }
            qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite foi a quantidade de quiloWatts de energia consumida:"));
            if (qtd < 0) {
                throw new QuantidadeException();
            }
            valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o foi o valor final gasto na despesa de Energia:"));
            if (valor < 0) {
                throw new ValorException();
            }
            String bandeira = JOptionPane.showInputDialog("Digite a Bandeira Vigente na Despesa de Energia:");
            Despesas_Base despesa = new Energia(bandeira, qtd, valor, data, forne);
            AddDespesa.criaDespesa(despesas, despesa);
        } else if (op == TipoDespesa.PRODUTOS.getValor()) {
            String cnpj = JOptionPane.showInputDialog("Digite o CNPJ do Fornecedor da Despesa:");
            Valida.CNPJ.valida(cnpj);
            Fornecedor forne = ProcuraCNPJ.procuraCnpj(cnpj, fornecedores, op);
            if (forne == null) {
                throw new CNPJInexistenteException();
            }
            qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do Produto:"));
            if (qtd < 0) {
                throw new QuantidadeException();
            }
            valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor unitário do Produto:"));
            if (valor < 0) {
                throw new ValorException();
            }
            Despesas_Base despesa = new Produto(valor, qtd, data, forne);
            AddDespesa.criaDespesa(despesas, despesa);
        } else if (op == TipoDespesa.SERVIÇOS.getValor()) {
            String cnpj = JOptionPane.showInputDialog("Digite o CNPJ do Fornecedor da Despesa:");
            Valida.CNPJ.valida(cnpj);
            Fornecedor forne = ProcuraCNPJ.procuraCnpj(cnpj, fornecedores, op);
            if (forne == null) {
                throw new CNPJInexistenteException();
            }
            String desc = JOptionPane.showInputDialog("Digite a Descrição do Serviço:");
            valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor total do Serviço:"));
            if (valor < 0) {
                throw new ValorException();
            }
            Despesas_Base despesa = new Servico(desc, valor, data, forne);
            AddDespesa.criaDespesa(despesas, despesa);
        }
    }
}
//Nesse método eu cadatro um despesa.
//Primeiramente eu peço para o usuario digitar uma opção e se essa opçao não estiver dentro do padrão (entre 0 e 5) eu executo um exceção.
//Depois peço para ser digitado a data e verifico se ela está dentro do padrão.
//Depois, a partir da opção digitada pelo usuario, comparo com os tipos cadastrado para ver em qual despesa ela entra.
//Em seguida, peço o cnpj e verifico se está valido e depois vejo se está cadastrado e se refere ao tipo pedido.
//Se o fornecedor for igual a nulo eu lanço uma exceção dizento que esse fornecedor não está cadastrado ou não condiz com o tipo digitado
//Continuo pedindo cada atributo referente a cada tipo e quando necessário mostra a exceção.
//E, por fim eu contruo o objeto despesa referente ao tipo que foi pedido e em seguida adiciono ele a lista de despesas atravez da classe que foi criada
