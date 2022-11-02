package syspesa.validacao;

import syspesa.excecoes.DataInvalidoException;

/**
 *
 * @author barbara
 */

public class ValidaData implements Validacao{

    @Override
    public void validaCampo(String data) throws DataInvalidoException{
        data = data.trim();
        if(!data.matches("\\d{2}\\/\\d{2}\\/\\d{4}")){
            throw new DataInvalidoException();
        }
    }
    
}


//A partir das expressões regulares eu verifico se a data são inseridas no formato dd/MM/yyyy.
