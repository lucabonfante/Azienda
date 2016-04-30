package it.marconivr.azienda;

/**
 *
 * @author 4ai
 */
public abstract class Dipendente {
    
    private int _id;
    private int _numOreLavorate;
    private int _numOreStraordinarie;
    
    final static int _pagaOra = 7;     //Stipendio all'ora
    final static int _maxStraordinario = 0;

    

    public Dipendente(int id, int numOreLavorate, int numOreStraordinarie) {
        this._id = id;
        this._numOreLavorate = numOreLavorate;
        this._numOreStraordinarie = numOreStraordinarie;
    }
    
    
    public int getStipendio(){
        int stipendio = 0;
        stipendio = this._numOreLavorate * Dipendente._pagaOra;
        return stipendio;
    }
    
}
