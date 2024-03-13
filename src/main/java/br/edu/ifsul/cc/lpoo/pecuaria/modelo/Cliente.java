/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.pecuaria.modelo;

import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author 20222PF.CC0019
 */
@Entity
@Table(name = "tb_cliente")
@DiscriminatorValue("C")
public class Cliente extends Pessoa {
    
    @Column(nullable = false, length = 14)
    private String cnpj;
    
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar data_ultima_compra;
    
    @Column(nullable = true, precision = 2)
    private Float valor_compras;

    public Cliente() {
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Calendar getData_ultima_compra() {
        return data_ultima_compra;
    }

    public void setData_ultima_compra(Calendar data_ultima_compra) {
        this.data_ultima_compra = data_ultima_compra;
    }

    public Float getValor_compras() {
        return valor_compras;
    }

    public void setValor_compras(Float valor_compras) {
        this.valor_compras = valor_compras;
    }
    
    
    
    
}
