package syspesa.executar;

import java.util.List;
import syspesa.despesas.Despesas_Base;
import syspesa.excecoes.ErroDeGravacaoException;
import syspesa.fornecedor.Fornecedor;
import syspesa.gravarler.Gravador;
import syspesa.gravarler.LeitorGravadorDesp;
import syspesa.gravarler.LeitorGravadorForne;

/**
 *
 * @author barbara
 */

public class Sair implements Executa {

    @Override
    public void executa(List<Fornecedor> fornecedores, List<Despesas_Base> despesas) throws ErroDeGravacaoException {
        Gravador.gravarDesp(new LeitorGravadorDesp(), despesas);
        Gravador.gravarForne(new LeitorGravadorForne(), fornecedores);
        System.exit(0);
    }

}

//Nesse método eu gravo as listas de forncedor e despesas nos seus respectivos arquivos e depois encerro o programa