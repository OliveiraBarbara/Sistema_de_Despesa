package syspesa.gravarler;

import java.util.List;
import syspesa.despesas.Despesas_Base;
import syspesa.excecoes.ErroDeGravacaoException;
import syspesa.excecoes.ErroDeLeituraException;

/**
 *
 * @author barbara
 */
public interface LeituraGravacaoDesp {

    public abstract void gravarDesp(List<Despesas_Base> despesas) throws ErroDeGravacaoException;

    public abstract List<Despesas_Base> lerDesp() throws ErroDeLeituraException, ClassNotFoundException;
}
//Classe para padronizar a leitura e gravação da Despesa no arquivo
