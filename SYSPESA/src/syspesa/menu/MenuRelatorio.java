package syspesa.menu;

import syspesa.executar.Executa;
import syspesa.executar.RelatorioMes;
import syspesa.executar.RelatorioTDespesa;
import syspesa.executar.RelatorioTipo_Mes;

/**
 *
 * @author barbara
 */

public enum MenuRelatorio implements Menu {

    POR_MES("Por Mês", new RelatorioMes()),
    POR_TIPO_DESPESA("Por tipos de despesa", new RelatorioTDespesa()),
    POR_MES_E_TIPO_DESPESA("Por Mês e Tipo de Despesa", new RelatorioTipo_Mes());

    private String item;
    private Executa acao;

    MenuRelatorio(String item, Executa acao) {
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

//Enumero as acões do menu referente ao relatório e já adiciono qual classe ele tem que executar