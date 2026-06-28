public class Reservation {
    private Livre livre;
    private String nomEmprunteur;  
    private String dateReservation;

    public Reservation(Livre livre, String nomEmprunteur, String dateReservation) {
        this.livre = livre;
        this.nomEmprunteur = nomEmprunteur;
        this.dateReservation = dateReservation;
    }
    public Livre getLivre() {
        return livre;
    }
    public String getNomEmprunteur() {
        return nomEmprunteur;
    }
    public String getDateReservation() {
        return dateReservation;
    }




    
}
