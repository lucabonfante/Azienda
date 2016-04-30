package it.marconivr.azienda;

/**
 *
 * @author 4ai
 */
public class Operaio extends Dipendente{

    public Operaio(int id, int numOreLavorate, int numOreStraordinarie) {
        super(id, numOreLavorate, numOreStraordinarie);
    }
    
    @Override
    public int getStipendio(){
        int stipendio = super.getStipendio();
        return stipendio;
    }
    
    
    
}
