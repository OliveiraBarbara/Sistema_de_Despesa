package syspesa.fornecedor;

import java.io.Serializable;

/**
 *
 * @author barbara
 */
public class Fornecedor implements Serializable {

    private String razaoSocial;
    private String nomeFantasia;
    private TipoFornecedor tipo;
    private String email;
    private String cnpj;
    private String fone;
    private int numImovel;
    private String cep;
    private String complemento;

    public Fornecedor(String razaoSocial, String nomeFantasia, TipoFornecedor tipo, String email, String cnpj, String fone, int numImovel, String cep, String complemento) {
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.tipo = tipo;
        this.email = email;
        this.cnpj = cnpj;
        this.fone = fone;
        this.numImovel = numImovel;
        this.cep = cep;
        this.complemento = complemento;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public int getNumImovel() {
        return numImovel;
    }

    public void setNumImóvel(int numImovel) {
        this.numImovel = numImovel;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public TipoFornecedor getTipo() {
        return tipo;
    }

    public void setTipo(TipoFornecedor tipo) {
        this.tipo = tipo;
    }

    public String infForne() {
        String str = "Fornecedor: ";
        str += "\nRazão Social: " + razaoSocial;
        str += "\nNome Fantasia: " + nomeFantasia;
        str += "\nTipo do Fornecedor: " + tipo;
        str += "\nE-mail: " + email;
        str += "\nCNPJ: " + cnpj;
        str += "\nTelefone: " + fone;
        str += "\nCEP: " + cep;
        str += "\nNúmero do Imovel: " + numImovel;
        str += "\nComplemento: " + complemento;
        return str;
    }

}


//Descrevo os atributos que cada fornecedor tem que ter, colocando os métodos de setar e mostrar, o construtor e já implementando um método para depois mostrar as informações quando necessária