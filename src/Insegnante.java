public class Insegnante extends Personaggio{
    public String ruolo;


    public Insegnante(String nome, int exp, String ruolo) {
        super(nome, exp);
        this.ruolo = ruolo;
    }

    public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    public String partecipa() {
        return "Ho il ruolo: " + getRuolo();
    }

    @Override
    public String toString() {
        String txt = "";

        txt = super.toString() + "\nScheda Insegnante:\nMateria insegnata = " + getRuolo();

        return txt;
    }
}
