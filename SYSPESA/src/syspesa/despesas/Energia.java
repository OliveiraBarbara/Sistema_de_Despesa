package syspesa.despesas;

import syspesa.fornecedor.Fornecedor;

/**
 *
 * @author barbara
 */
public class Energia extends Despesas_Base {

    private String bandeira;
    private int qtdKW;
    private double valorTotal;
    private TipoDespesa tipo;

    public Energia(String bandeira, int qtdKW, double valorTotal, String dataPagamento, Fornecedor forne) {
        super(dataPagamento, forne);
        this.bandeira = bandeira;
        this.qtdKW = qtdKW;
        this.valorTotal = valorTotal;
        this.tipo = tipo.ENERGIA;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public int getQtdKW() {
        return qtdKW;
    }

    public void setQtdKW(int qtdKW) {
        this.qtdKW = qtdKW;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        String str = "Energia";
        str += "\nCNPJ do Fornecedor: " + super.getForne().getCnpj();
        str += "\nData do Pagamento: " + super.getDataPagamento();
        str += "\nBandeira Vigente: " + bandeira;
        str += "\nQuantidade em Kilowatts: " + qtdKW;
        str += "\nValor Total: " + valorTotal;
        return str;
    }
}
//Nessa classe, extendo da herança que criei alguns atributos que são comuns a todos e acrescento as específicas dessa classe.