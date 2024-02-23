/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Samuelson
 */
    public class venda_bean {
    private String Data;
    private int valor;
    private String obervacao;
public String  getData (){
    return Data;
}
public void setData(String Data){
    this.Data = Data;
}

public int getvalor(){
    return valor;
}

public void setvalor(int valor){
    this.valor = valor;
}

public String  getobervacao (){
    return obervacao;
}
public void setobervacao(String obervacao){
    this.obervacao = obervacao;
}
    }