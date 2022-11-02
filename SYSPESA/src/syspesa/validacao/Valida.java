package syspesa.validacao;

import syspesa.excecoes.InvalidoException;

/**
 *
 * @author barbara
 */

public enum Valida {

    CNPJ(new ValidaCNPJ()),
    CEP(new ValidaCEP()),
    EMAIL(new ValidaEmail()),
    NOME(new ValidaNome()),
    DATA(new ValidaData()),
    TELEFONE(new ValidaTelefone());

    private Validacao validacao;

    Valida(Validacao validacao) {
        this.validacao = validacao;
    }

    public void valida(String campo) throws InvalidoException {
        validacao.validaCampo(campo);
    }
}

//Nesse enum eu elenco todos os métodos que serão implementados na area de validação
