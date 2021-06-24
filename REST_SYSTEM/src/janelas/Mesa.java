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
public class Mesa {

    private String mesa;
    private String formPagamento;
    private double valorPago;

    public Mesa(String mesa, String formPagamento, double valorPago) {
        this.mesa = mesa;
        this.formPagamento = formPagamento;
        this.valorPago = valorPago;
    }

    public String getMesa() {
        return mesa;
    }

    public void setMesa(String mesa) {
        this.mesa = mesa;
    }

    public String getFormPagamento() {
        return formPagamento;
    }

    public void setFormPagamento(String formPagamento) {
        this.formPagamento = formPagamento;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }
}
//descrevo os atributos para criar uma objeto de mesa