package syspesa.gravarler;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import syspesa.excecoes.ErroDeGravacaoException;
import syspesa.excecoes.ErroDeLeituraException;
import syspesa.fornecedor.Fornecedor;

/**
 *
 * @author barbara
 */

public class LeitorGravadorForne implements LeituraGravacaoForne {

    @Override
    public void gravarForne(List<Fornecedor> fornecedores) throws ErroDeGravacaoException {
        File dir = new File("./dados");
        if (!dir.exists()) {
            dir.mkdir();
        }
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("./dados/fornecedores.dat"));
            out.writeObject(fornecedores);
        } catch (IOException ex) {
            throw new ErroDeGravacaoException();
        } finally {
            try {
                out.close();
            } catch (IOException ex) {
                throw new ErroDeGravacaoException();
            }
        }
    }

//Nessa classe eu recebo um objeto do tipo Lista de Fornecedores e gravo as informações em um arquivo com o diretório de caminho relativo.
    @Override
    public List<Fornecedor> lerForne() throws ErroDeLeituraException, ClassNotFoundException {
        File dados = new File("./dados/fornecedores.dat");
        if (!dados.exists()) {
            return null;
        }
        ObjectInputStream in = null;
        ArrayList<Fornecedor> fornecedores = null;
        try {
            in = new ObjectInputStream(new FileInputStream(dados));
            fornecedores = (ArrayList<Fornecedor>) in.readObject();
        } catch (IOException ex) {
            throw new ErroDeLeituraException();
        } finally {
            try {
                in.close();
            } catch (IOException ex) {
                throw new ErroDeLeituraException();
            }
        }
        return fornecedores;
    }
}
//Nesse método a partir de um diretório relativo, leio as informações gravadas em arquivo atraves da Lista 