package syspesa.despesas;

import syspesa.fornecedor.Fornecedor;

/**
 *
 * @author barbara
 */
public class Servico extends Despesas_Base {

    private String descricao;
    private double valorTotal;
    private TipoDespesa tipo;

    public Servico(String descricao, double valorTotal, String dataPagamento, Fornecedor forne) {
        super(dataPagamento, forne);
        this.descricao = descricao;
        this.valorTotal = valorTotal;
        this.tipo = tipo.SERVIÇOS;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        String str = "Serviço:";
        str += "\nCNPJ do Fornecedor: " + super.getForne().getCnpj();
        str += "\nDescrição:" + descricao;
        str += "\nData do Pagamento:" + super.getDataPagamento();
        str += "\nValor Total:" + valorTotal;
        return str;
    }
}
//Nessa classe, extendo da herança que criei alguns atributos que são comuns a todos e acrescento as específicas dessa classe.
