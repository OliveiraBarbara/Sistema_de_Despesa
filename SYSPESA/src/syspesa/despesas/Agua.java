package syspesa.despesas;

import syspesa.fornecedor.Fornecedor;

/**
 *
 * @author barbara
 */
public class Agua extends Despesas_Base {

    private int qtdKL;
    private double valorTotal;
    private TipoDespesa tipo;

    public Agua(int qtdKL, double valorTotal, String dataPagamento, Fornecedor forne) {
        super(dataPagamento, forne);
        this.qtdKL = qtdKL;
        this.valorTotal = valorTotal;
        this.tipo = tipo.AGUA;
    }

    public int getQtdKL() {
        return qtdKL;
    }

    public void setQtdKL(int qtdKL) {
        this.qtdKL = qtdKL;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        String str = "Agua";
        str += "\nCNPJ do Fornecedor: " + super.getForne().getCnpj();
        str += "\nData do Pagamento: " + super.getDataPagamento();
        str += "\nQuantidade em Kilolitros: " + qtdKL;
        str += "\nValor Total: " + valorTotal;
        return str;
    }
}
//Nessa classe, extendo da herança que criei alguns atributos que são comuns a todos e acrescento as específicas dessa classe.