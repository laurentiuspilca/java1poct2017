public class Angajat {
    private String nume;
    private double salariu;
    private Functie functie;
    
    public Angajat(String nume, double salariu, Functie functie) {
        this.nume = nume;
        this.salariu = salariu;
        this.functie = functie;
    }
    
    public String getNume() {
        return nume;
    }
    
    public void setNume(String nume) {
        this.nume = nume;
    }
    
    public double getSalariu() {
        return salariu;
    }
    
    public void setSalariu(double salariu) {
        this.salariu = salariu;
    }
    
    public Functie getFunctie() {
        return functie;
    }
    
    public void setFunctie(Functie functie) {
        this.functie = functie;
    }
    
    public String toString() {
        return nume + " / " + salariu + " / " + functie;
    }
    
    
    
    
    
    
}