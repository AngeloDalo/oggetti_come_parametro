
public class Persona {
    String nome;
    String cognome;
    int eta;
    String colore;

    //chiamato automaticamente
    Persona(String nome, String cognome, int eta, String colore){
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.colore = colore;
    }

    public String toString(){
        String stringa = this.nome + "\n" + this.cognome + "\n" + this.eta + "\n" + this.colore;
        return stringa;
    }

    void saluta(Persona personaDaSalutare){
        System.out.println("ciao " + personaDaSalutare.nome + " io sono " + this.nome);
    }
}