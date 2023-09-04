package WePlus.chap08;

public class Individu {
    String nom;
    String prenom;
    String dateNaissance;
    String adresse;
    String complement;
    String codePostal;
    String ville;
    public Individu() {
        nom = "";
        prenom = "";
        dateNaissance = "01/01/1900";
        adresse = "";
        complement = "";
        codePostal = "";
        ville = "";
    }

    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public String getDateNaissance() {
        return dateNaissance;
    }
    public String getAdresse() {
        return adresse;
    }
    public String getComplement() {
        return complement;
    }
    public String getCodePostal() {
        return codePostal;
    }
    public String getVille() {
        return ville;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public void setComplement(String complement) {
        this.complement = complement;
    }
    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }
    public void setVille(String ville) {
        this.ville = ville;
    }
    @Override
    public String toString() {
        return "Nom : " + getNom() +
                           "\nPrenom : " + getPrenom() +
                           "\nDate Naissance : " + getDateNaissance() +
                           "\nadresse : " + getAdresse() +
                           "\ncomplément : " + getComplement() +
                           "\nCode Postal : " + getCodePostal() +
                           "\nVille : " + getVille();
    }
}
