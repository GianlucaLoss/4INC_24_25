public class Medico extends Personaggio{
    public String specializzazione;


    public Medico(String nome, int exp, String specializzazione) {
        super(nome, exp);
        this.specializzazione = specializzazione;
    }

    public String getSpecializzazione() {
        return specializzazione;
    }

    public void setSpecializzazione(String specializzazione) {
        this.specializzazione = specializzazione;
    }

    public String partecipa(){
        return "Ho la specializzazione di: " + getSpecializzazione();
    }

    public String partecipa(double numero){
        return "Ho la specializzazione di: " + getSpecializzazione() + " " + numero;
    }

    public String toString(){
        String txt = "";

        txt = super.toString() + "\nScheda del medico:\nSpecializzazione = " + getSpecializzazione();

        return txt;
    }
}
