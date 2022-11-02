package syspesa.operacao;

import java.util.List;
import syspesa.fornecedor.Fornecedor;

/**
 *
 * @author barbara
 */

public class AddFornecedor {

    public static void criaFornecedor(List<Fornecedor> fornecedores, Fornecedor fornecedor) {
        fornecedores.add(fornecedor);
    }
}
//Nesse metodo eu adiciono o fornecedor que criei na lista de fornecedores