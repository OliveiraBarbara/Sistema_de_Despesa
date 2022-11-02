package syspesa.despesas;

import java.io.Serializable;
import syspesa.fornecedor.Fornecedor;

/**
 *
 * @author barbara
 */

public class Despesas_Base implements Serializable {
    
    private String dataPagamento;
    private Fornecedor forne;

    public Despesas_Base(String dataPagamento, Fornecedor forne) {
        this.dataPagamento = dataPagamento;
        this.forne = forne;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Fornecedor getForne() {
        return forne;
    }

    public void setForne(Fornecedor forne) {
        this.forne = forne;
    }
        
}
//Nessa classe, fiz a classe pai das classe de despesa e criei alguns atributos que são comuns a todos.
