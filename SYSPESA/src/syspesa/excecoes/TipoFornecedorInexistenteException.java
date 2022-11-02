/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syspesa.excecoes;

/**
 *
 * @author babyo
 */
public class TipoFornecedorInexistenteException extends InvalidoException{
    
    public TipoFornecedorInexistenteException() {
        super("Tipo de Fornecedor não Existe!!!");
    }
    
}
