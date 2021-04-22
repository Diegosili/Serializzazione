/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializzazione;

import java.io.Serializable;

/**
 *
 * @author siliprandi.diego
 */
public class Studente implements Serializable{
    String nome, cognome;
    int numReg;
    
    public Studente(int numReg, String nome, String cognome) {
        this.numReg = numReg;
        this.nome = nome;
        this.cognome = cognome;
    }

    @Override
    public String toString() {
        return "Studente:" + "numero Registro = " + numReg +  ", nome = " + nome + ", cognome = " + cognome;
    }
    
    
}
