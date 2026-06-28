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

    public ArrayList<Livre> rechercherParTitre(String titre){
        ArrayList<Livre> resultat = new ArrayList<Livre>();
        for(int i =0; i < livres.size(); i++){
            Livre l = livres.get(i);
            if(l.getTitre().equals(titre)){
                resultat.add(l);
            }
        }
        if(resultat.size() == 0){
            System.out.println("Aucun livre trouvé avec ce titre.");
        }
        return resultat;
    }
    public ArrayList<Livre> rechercherParAuteur(String auteur){
        ArrayList<Livre> res = new ArrayList<Livre>();
        for(int i = 0; i < livres.size(); i++){
            if(livres.get(i).getAuteur().equals(auteur)){
                res.add(livres.get(i));
            }
        }
        if(res.size()==0){
            System.out.println("Pas de livre.");
            
        }
        return res;
    }
    


// FONCTION RESERVATION
    public Reservation reserverLivre(Lvre livre, Emprunteur emprunteur){
        if (livre.isDisponible()){
            System.out.println("livre disponible")
        return null;
        }
        Reservation reservation = new Reservation(livre, emprunteur);
        reservation.add(reservation);
        System.out.println("Reservation ajoutr: " + reservation);
        return reservation;
    }
    public ArrayList<Reservation> getReservations(){
        return reservations;
    }
    @Override
    public String toString(){
        return "Bibliotheque{"+
                "livres=" + livres + ", reservations=" + reservations + "}"
                
    }
}
