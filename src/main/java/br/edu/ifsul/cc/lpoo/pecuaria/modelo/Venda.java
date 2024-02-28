/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.pecuaria.modelo;

import java.util.Calendar;
import java.util.Collection;

/**
 *
 * @author 20222PF.CC0019
 */
public class Venda {
    
    private Integer id;
    private Float valor;
    private Calendar data;
    private String observacoes;
    
    private Funcionario funcionario;
    private Cliente cliente;
    private Collection<Bovino> bovino;
    
}
