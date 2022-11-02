package syspesa.validacao;

import syspesa.excecoes.TelefoneInvalidoException;

/**
 *
 * @author barbara
 */

public class ValidaTelefone implements Validacao{

    @Override
    public void validaCampo(String telefone) throws TelefoneInvalidoException{
        telefone = telefone.trim();
        if(!telefone.matches("\\(\\d{2}\\)\\d{4,5}-\\d{4}")){
            throw new TelefoneInvalidoException();
        }
    }
    
}

//A partir das expressões regulares eu verifico se o numero de telefone digitado segue esse padrão:(##)#####-#### ou (##)####-####