package syspesa.despesas;

import syspesa.fornecedor.Fornecedor;

/**
 *
 * @author barbara
 */
public class Produto extends Despesas_Base {

    private int qtdProduto;
    private double precoUni;
    private TipoDespesa tipo;

    public Produto(double precoUni, int qtdProduto, String dataPagamento, Fornecedor forne) {
        super(dataPagamento, forne);
        this.precoUni = precoUni;
        this.qtdProduto = qtdProduto;
        this.tipo = tipo.PRODUTOS;
    }

    public int getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    public double getPrecoUni() {
        return precoUni;
    }

    public void setPrecoUni(double precoUni) {
        this.precoUni = precoUni;
    }

    @Override
    public String toString() {
        String str = "Produto:";
        str += "\nCNPJ do Fornecedor: " + super.getForne().getCnpj();
        str += "\nData do Pagamento: " + super.getDataPagamento();
        str += "\nQuantidade do Produto: " + qtdProduto;
        str += "\nValor Unitário: " + precoUni;
        str += "\nValor Total:" + (qtdProduto * precoUni);
        return str;
    }
}
//Nessa classe, extendo da herança que criei alguns atributos que são comuns a todos e acrescento as específicas dessa classe.
