package syspesa.operacao;

import java.util.List;
import syspesa.fornecedor.Fornecedor;
import syspesa.fornecedor.TipoFornecedor;

/**
 *
 * @author barbara
 */

public class ProcuraCNPJ {
    
    public static Fornecedor procuraCnpj(String cnpj, List<Fornecedor> fornecedores, int despesa) {//Esse método procura na Lista de Fornecedores que é passado por parâmetro o CNPJ de um fornecedor também passado por parâmetro, ele percorre toda a lista comparando com os cnpj's que já estão salvos e se tiver na lista o método retorna o fornecedor ou retorna null caso não tenha. 
        if (despesa == 0){
            for (int i = 0; i < fornecedores.size(); i++) {
                if (fornecedores.get(i).getCnpj().equals(cnpj))
                    return fornecedores.get(i);     
            }
            return null;
        }else{ //Nessa parte comparo o cnpj que foi digita e o tipo de despesa para ver se os dois são do mesmo fornecedor e se tiver na lista o método retorna o fornecedor ou retorna null caso não tenha. 
            for (int i = 0; i < fornecedores.size(); i++) {
                if (fornecedores.get(i).getCnpj().equals(cnpj) && fornecedores.get(i).getTipo().getValue() == despesa)
                    return fornecedores.get(i);     
            }
            return null;
        }
    }
    
   
}
