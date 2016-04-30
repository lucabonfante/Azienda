package it.marconivr.azienda;

/**
 *
 * @author 4ai
 */

// massimo 50 ore straordinarie
public class Quadro extends Impiegato{

    public Quadro(int id, int numOreLavorate, int numOreStraordinarie) {
        super(id, numOreLavorate, numOreStraordinarie);
    }
    
    @Override
    public int getStipendio(){
        int stipendio = super.getStipendio();
        return stipendio;
    }
    
}
