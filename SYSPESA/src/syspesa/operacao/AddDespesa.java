package syspesa.operacao;

import java.util.List;
import syspesa.despesas.Despesas_Base;

/**
 *
 * @author barbara
 */

public class AddDespesa {
    
    public static void criaDespesa(List<Despesas_Base> despesas, Despesas_Base despesa) {
        despesas.add(despesa);
    }
}
//Nesse metodo eu adiciono a despesa que criei na lista de despesa