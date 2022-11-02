package syspesa.menu;

import syspesa.executar.CadastroFornecedor;
import syspesa.executar.LancarDespesas;
import syspesa.executar.Relatorio;
import syspesa.executar.Sair;
import syspesa.executar.Executa;

/**
 *
 * @author barbara
 */
public enum MenuPrincipal implements Menu {

    LANCAR_DESPESAS("Lançar Despesas", new LancarDespesas()),
    CADASTRAR_FORNECEDORES("Cadastrar Fornecedores", new CadastroFornecedor()),
    RELATÓRIO_DE_DESPESAS("Relatório de Despesas", new Relatorio()),
    SAIR("Sair", new Sair());

    private String item;
    private Executa acao;

    MenuPrincipal(String item, Executa acao) {
        this.item = item;
        this.acao = acao;
    }

    @Override
    public String getItem() {
        return item;
    }

    @Override
    public Executa getAcao() {
        return acao;
    }

}


//Enumero as acões do menu principal e já adiciono qual classe ele tem que executar
