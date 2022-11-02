package syspesa.validacao;

import syspesa.excecoes.CEPInvalidoException;

/**
 *
 * @author barbara
 */

public class ValidaCEP implements Validacao{


    @Override
    public void validaCampo(String cep) throws CEPInvalidoException{
        cep = cep.trim();
        if(!cep.matches("\\d{5}\\-\\d{3}")){
            throw new CEPInvalidoException();
        }

    }
    
}

//A partir das expressões regulares eu verifico se o cep segue o padrão: #####-###