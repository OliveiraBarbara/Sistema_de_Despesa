package syspesa.executar;

import java.util.List;
import javax.swing.JOptionPane;
import syspesa.despesas.Despesas_Base;
import syspesa.excecoes.CNPJExistenteException;
import syspesa.excecoes.InvalidoException;
import syspesa.excecoes.TipoFornecedorInexistenteException;
import syspesa.fornecedor.Fornecedor;
import syspesa.fornecedor.TipoFornecedor;
import syspesa.operacao.AddFornecedor;
import syspesa.operacao.ProcuraCNPJ;
import syspesa.validacao.Valida;

/**
 *
 * @author barbara
 */
public class CadastroFornecedor implements Executa {

    @Override
    public void executa(List<Fornecedor> fornecedores, List<Despesas_Base> despesas) throws InvalidoException {
        String cnpj = JOptionPane.showInputDialog("Digite o CNPJ do Fornecedor: ");
        Valida.CNPJ.valida(cnpj);
        if (ProcuraCNPJ.procuraCnpj(cnpj, fornecedores, 0) != null) {
            throw new CNPJExistenteException();
        }
        String razaoSocial = JOptionPane.showInputDialog("Digite a Razão Social do Fornecedor: ");
        Valida.NOME.valida(razaoSocial);
        String nomeFant = JOptionPane.showInputDialog("Digite o Nome Fantasia do Fornecedor: ");
        Valida.NOME.valida(nomeFant);
        TipoFornecedor forne = null;
        int tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite o Tipo do Fornecedor:\n1-(AGUA)/2-(ENERGIA)/3-(SERVICO)/4-(PRODUTOS)"));
        if (tipo <= 0 || tipo >= 5) {
            throw new TipoFornecedorInexistenteException();
        }
        if (tipo == TipoFornecedor.TIPO_AGUA.getValue()) {
            forne = TipoFornecedor.TIPO_AGUA;
        } else if (tipo == TipoFornecedor.TIPO_ENERGIA.getValue()) {
            forne = TipoFornecedor.TIPO_ENERGIA;
        } else if (tipo == TipoFornecedor.TIPO_SERVICOS.getValue()) {
            forne = TipoFornecedor.TIPO_SERVICOS;
        } else if (tipo == TipoFornecedor.TIPO_PRODUTOS.getValue()) {
            forne = TipoFornecedor.TIPO_PRODUTOS;
        }
        String email = JOptionPane.showInputDialog("Digite o E-Mail do Fornecedor: ");
        Valida.EMAIL.valida(email);
        String fone = JOptionPane.showInputDialog("Digite o telefone do Fornecedor: ");
        Valida.TELEFONE.valida(fone);
        String cep = JOptionPane.showInputDialog("Digite o CEP do Fornecedor: ");
        Valida.CEP.valida(cep);
        int numImovel = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do imóvel do Fornecedor: "));
        int op = Integer.parseInt(JOptionPane.showInputDialog("Imóvel tem Complemnto: (1)SIM / (2)NÃO"));
        String comple = "";
        if (op == 1) {
            comple = JOptionPane.showInputDialog("Digite o Complemento Imóvel do Fornecedor: ");
        }
        Fornecedor fornecedor = new Fornecedor(razaoSocial, nomeFant, forne, email, cnpj, fone, numImovel, cep, comple);
        AddFornecedor.criaFornecedor(fornecedores, fornecedor);
    }
}
//Nesse método eu cadstro um Fornecedor, on primeiro eu peço para digitar o cnpj e verifico se ele é válido e em seguida verifico se eles já foi cadastrado ou não, caso sim eu mostro uma exceção.
//Sigo pedindo os demais atributos e validando eles.
//Quando peço o tipo do fornecedor, verifico se ele está correto e atribuo ele ao atributo do tipo TipoFornecedor.
//Em seguida continuo pedindo as informações dos atributos e verificando a validade deles.
//Por fim, crio um objeto do tipo Fornecedor e seto todos os atributo nesse objeto e em seguida, chamo a classe AddFronecedor para adiconar o objeto a Lista de Fornecedor.