package syspesa.executar;

import java.util.List;
import syspesa.despesas.Despesas_Base;
import syspesa.fornecedor.Fornecedor;

/**
 *
 * @author barbara
 */
public interface Executa {

    abstract public void executa(List<Fornecedor> fornecedores, List<Despesas_Base> despesas) throws Exception;
}

//Interface criada para padronizar as classes do menu, tornando-as mais eficiente e eficaz
