package syspesa.despesas;

/**
 *
 * @author barbara
 */
public enum TipoDespesa {

    AGUA(1),
    ENERGIA(2),
    SERVIÇOS(3),
    PRODUTOS(4);

    private int valor;

    TipoDespesa(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}

//Enumero os tipos de despesas existentes, facilitando caso eu queira acrescentar mais