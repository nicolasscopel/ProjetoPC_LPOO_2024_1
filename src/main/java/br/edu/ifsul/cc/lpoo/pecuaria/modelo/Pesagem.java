/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.pecuaria.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



/**
 *
 * @author 20222PF.CC0019
 */
@Entity
@Table(name = "tb_pesagem")
public class Pesagem implements Serializable{
    
    @Id
    @SequenceGenerator(name = "seq_pesagem", sequenceName = "seq_pesagem_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_pesagem", strategy = GenerationType.SEQUENCE)
    private Integer id;
    
    @Column(nullable = false, precision = 2)
    private Float peso;
    
    @ManyToOne
    @JoinColumn(name = "bovino_id", nullable = false)
    private Bovino bovino;

    public Pesagem() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Bovino getBovino() {
        return bovino;
    }

    public void setBovino(Bovino bovino) {
        this.bovino = bovino;
    }
    
    
    
}
