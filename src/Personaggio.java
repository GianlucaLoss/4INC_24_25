public class Personaggio {
    public String nome;
    public int exp;


    public Personaggio(String nome, int exp) {
        this.nome = nome;
        this.exp = exp;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public String partecipa(){
        return "Sto lavorando da: " + exp;
    }
    public String partecipa(String unita){
        return "Sto lavorando da: " + exp + unita;
    }



    public String toString(){
        String txt = "";

        txt = "Scheda personaggio:\nNome = " + getNome() + ", Punti esperienza = " + getExp();

        return txt;
    }
}
