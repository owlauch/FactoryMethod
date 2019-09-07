/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.factorymethod;

/**
 *
 * @author owlauch
 */
public class ConexaoOracle extends Conexao {

    @Override
    public void conectar() {
        System.out.println("conectado ao banco Orocle");
    }

    @Override
    public void desconectar() {
        System.out.println("desconectado do banco Orocle");
    }

    @Override
    public String getData(String query) {
        return "seus daddos do banco Orocle";
    }

}
