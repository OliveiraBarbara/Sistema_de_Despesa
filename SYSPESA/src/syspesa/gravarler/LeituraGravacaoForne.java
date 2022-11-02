package syspesa.gravarler;

import java.util.List;
import syspesa.excecoes.ErroDeGravacaoException;
import syspesa.excecoes.ErroDeLeituraException;
import syspesa.fornecedor.Fornecedor;

/**
 *
 * @author barbara
 */
public interface LeituraGravacaoForne {

    public abstract void gravarForne(List<Fornecedor> fornecedores) throws ErroDeGravacaoException;

    public abstract List<Fornecedor> lerForne() throws ErroDeLeituraException, ClassNotFoundException;

}
//Classe para padronizar a leitura e gravação do Fornecedor no arquivo
