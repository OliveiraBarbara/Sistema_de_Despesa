package syspesa.gravarler;

import java.util.List;
import syspesa.despesas.Despesas_Base;
import syspesa.excecoes.ErroDeGravacaoException;
import syspesa.fornecedor.Fornecedor;

/**
 *
 * @author barbara
 */
public class Gravador {

    public static void gravarForne(LeituraGravacaoForne arq, List<Fornecedor> fornecedores) throws ErroDeGravacaoException {
        arq.gravarForne(fornecedores);
    }

    public static void gravarDesp(LeituraGravacaoDesp arq, List<Despesas_Base> despesas) throws ErroDeGravacaoException {
        arq.gravarDesp(despesas);
    }
}
//Classe estática que auxilia na gravação dos das listas nos arquivos.