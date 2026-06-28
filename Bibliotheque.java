import java.util.ArrayList;
/**
 * Commentaire Javadoc ajouté
 * Sur la Classe Biblioteque
 */
public class Bibliotheque {
    private ArrayList<Livre> livres;
    public Bibliotheque() {
        livres = new ArrayList<>();
    }
    public void ajouterLivre(Livre livre) {
        livres.add(livre);
    }
    public void supprimerLivre(Livre livre) {
        livres.remove(livre);
    }
    public ArrayList<Livre> getLivres() {
        return livres;
    }

    public void afficherLivres() {
        if(livres != null) {
            for (Livre livre : livres) {
                System.out.println(livre);
            }
        }
    }

    

}