package it.marconivr.azienda;

/**
 *
 * @author 4ai
 */

//massimo 20 ore straordinarie
public class Impiegato extends Dipendente{
    
    final static int _pagaBase = 1500;

    public Impiegato(int id, int numOreLavorate, int numOreStraordinarie) {
        super(id, numOreLavorate, numOreStraordinarie);
           
    }

    @Override
    public int getStipendio(){
        int stipendio = Impiegato._pagaBase;
        return stipendio;
    }
    
    
}
