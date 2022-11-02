package syspesa.gravarler;

import java.util.List;
import syspesa.despesas.Despesas_Base;
import syspesa.excecoes.ErroDeLeituraException;
import syspesa.fornecedor.Fornecedor;

/**
 *
 * @author barbara
 */
public class Carregador {

    public static List<Fornecedor> carregarForne(LeituraGravacaoForne arq) throws ErroDeLeituraException, ClassNotFoundException {
        return arq.lerForne();
    }

    public static List<Despesas_Base> carregarDesp(LeituraGravacaoDesp arq) throws ErroDeLeituraException, ClassNotFoundException {
        return arq.lerDesp();
    }
}
//Classe com métodos estáticos que auxilia na leitura dos arquivos