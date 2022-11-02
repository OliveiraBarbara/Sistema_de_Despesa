package syspesa.fornecedor;

/**
 *
 * @author barbara
 */
public enum TipoFornecedor {

    TIPO_ENERGIA("Energia", 2),
    TIPO_AGUA("Agua", 1),
    TIPO_SERVICOS("Servico", 3),
    TIPO_PRODUTOS("Produto", 4);

    private String valor;
    private int value;

    TipoFornecedor(String valor, int value) {
        this.valor = valor;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public String getValor() {
        return valor;
    }

}


//Enumero os tipos de fornecedores existentes, facilitando caso eu queira acrescentar mais