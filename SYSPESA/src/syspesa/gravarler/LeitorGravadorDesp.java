package syspesa.gravarler;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import syspesa.despesas.Despesas_Base;
import syspesa.excecoes.ErroDeGravacaoException;
import syspesa.excecoes.ErroDeLeituraException;

/**
 *
 * @author barbara
 */

public class LeitorGravadorDesp implements LeituraGravacaoDesp {

    @Override
    public void gravarDesp(List<Despesas_Base> despesas) throws ErroDeGravacaoException {
        File dir = new File("./dados");
        if (!dir.exists()) {
            dir.mkdir();
        }
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("./dados/despesas.dat"));
            out.writeObject(despesas);
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

//Nessa classe eu recebo um objeto do tipo Lista de Despesas e gravo as informações em um arquivo com o diretório de caminho relativo.

    @Override
    public List<Despesas_Base> lerDesp() throws ErroDeLeituraException, ClassNotFoundException {
        File dados = new File("./dados/despesas.dat");
        if (!dados.exists()) {
            return null;
        }
        ObjectInputStream in = null;
        ArrayList<Despesas_Base> despesas = null;
        try {
            in = new ObjectInputStream(new FileInputStream(dados));
            despesas = (ArrayList<Despesas_Base>) in.readObject();
        } catch (IOException ex) {
            throw new ErroDeLeituraException();
        } finally {
            try {
                in.close();
            } catch (IOException ex) {
                throw new ErroDeLeituraException();
            }
        }
        return despesas;
    }
}
//Nesse método a partir de um diretório relativo, leio as informações gravadas em arquivo atraves da Lista 