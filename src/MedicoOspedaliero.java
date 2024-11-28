public class MedicoOspedaliero extends Medico{
    public String ospedale;


    public MedicoOspedaliero(String nome, int exp, String specializzazione, String ospedale) {
        super(nome, exp, specializzazione);
        this.ospedale = ospedale;
    }

    public String getOspedale() {
        return ospedale;
    }

    public void setOspedale(String ospedale) {
        this.ospedale = ospedale;
    }

    public String toString(){
        String txt = "";

        txt = "" + super.toString() + "\nOspedale = " + getOspedale();

        return txt;
    }
}
