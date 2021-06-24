/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janelas;

/**
 *
 * @author barbara
 */
public class Item {

    private String nomeItem;
    private double valorUni;

    public Item(String nomeItem, double valorUni) {
        this.nomeItem = nomeItem;
        this.valorUni = valorUni;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public double getValorUni() {
        return valorUni;
    }

    public void setValorUni(double valorUni) {
        this.valorUni = valorUni;
    }

    @Override
    public boolean equals(Object obj) {
        Item outro = (Item) obj;  //metodo verifica se os itens são iguais
        return this.nomeItem.equals(outro.getNomeItem());
    }
}
//nesta classe eu descrevo quais atributos preciso para ter meu objeto item
