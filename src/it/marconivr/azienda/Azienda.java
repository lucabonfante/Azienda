package it.marconivr.azienda;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 4ai
 */
public class Azienda {
    
    private List<Dipendente> listDip =  new ArrayList<>();
    
    public int getTotStipendio(){
        int totStipendio = 0;
        for (Dipendente d : listDip){
            totStipendio += d.getStipendio();
        }
        return totStipendio;
    }
    
    public void addDipendente(Dipendente dipendente){
        listDip.add(dipendente);
    }
    
    
    public static void main(String[] args) {
        Azienda CadIT = new Azienda();
        
        Operaio Lorenzo = new Operaio(1, 10, 12);
        Impiegato Marco = new Impiegato(2,20, 10);
        Quadro Mario = new Quadro(3, 10, 20);
        Dirigente Luca = new Dirigente(4, 10, 20, 2000);
        
        
        CadIT.addDipendente(Lorenzo);
        CadIT.addDipendente(Luca);
        CadIT.addDipendente(Mario);
        CadIT.addDipendente(Marco);
        
        System.out.println("Tot stipendi: " + CadIT.getTotStipendio() + " €");
        
    }
    
}
