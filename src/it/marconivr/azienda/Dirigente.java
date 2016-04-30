package it.marconivr.azienda;

/**
 *
 * @author 4ai
 */
public class Dirigente extends Impiegato{
    
    private int _bonus;

    public Dirigente(int id, int numOreLavorate, int numOreStraordinarie, int bonus) {
        super(id, numOreLavorate, numOreStraordinarie);
        this._bonus = bonus;
    }
    
    @Override
    public int getStipendio(){
        int stipendio = super.getStipendio() + this._bonus;
        return stipendio;
    }
    
}
