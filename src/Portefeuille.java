public class Portefeuille {
  private Cryptomonnaie monnaie;
  private double montant; // Soit le nombre de jetons
  private String proprietaire;

  public Portefeuille(Cryptomonnaie monnaie, double montant, String proprietaire){
      this.monnaie      = monnaie;
      this.montant      = montant;
      this.proprietaire = proprietaire;
  }

  /**
   * Cette fonction vous permet de transférer des devises du portefeuille actuel 
   * vers le portefeuille de destination pour le montant indiqué. Le type de devise 
   * (nom du Jeton) doit être le même entre les deux portefeuilles et le montant 
   * du portefeuille actuel doit être supérieur ou égal à celui indiqué.
   * @param destination 
   * @param montantJetons
   * @return Vrai si la transaction a été effectuée, faux sinon.
   */
  public boolean transfertDevise(Portefeuille destination, double montantJetons) {
      // Vérifier si le montant à transférer est valide
      if (montantJetons <= 0 || montantJetons > this.montant) {
          return false; // La transaction ne peut pas être effectuée
      }

      // Vérifier si les deux portefeuilles utilisent la même devise (Cryptomonnaie)
      if (!this.monnaie.equals(destination.monnaie)) {
          return false; // La transaction ne peut pas être effectuée
      }

      // Effectuer le transfert
      this.montant -= montantJetons;
      destination.montant += montantJetons;

      return true; // La transaction a été effectuée avec succès
  }


    /**
   * Cette fonction vous permet d'acheter des jetons de la 
   * crypto-devise en fonction de leur valeur en euros. 
   * Le résultat est l'augmentation des jetons de la crypto-monnaie.
   * @param montantEuros Valeur d'achat en euros 
   * @return true si le montant en euros est supérieur ou égal à 0 
   */
    public boolean achatDevise(double montantEuros) {
        // Vérifier si le montant en euros est valide
        if (montantEuros < 0) {
            return false; // Montant invalide
        }

        // Calculer le nombre de jetons à acheter en fonction de la valeur en euros
        double montantJetons = montantEuros / this.monnaie.getValeurDeJeton();

        // Augmenter le montant de jetons dans le portefeuille
        this.montant += montantJetons;

        return true; // L'achat a été effectué avec succès
    }


    /**
   * Valide si le proprietaire passé en parametre est celui
   * qui as le portefeuille
   * @param proprietaire
   * @return true si les nom du propriétaire est correct
   */
  public boolean estProprietaire (String proprietaire){
        return (proprietaire.equals(this.proprietaire))?true:false;
  }

  /**
   * 
   * @return La valeur en euros du Portefeuille. 
   * Autrement dit, le monant de jetons multiplié par la valeur des jetons. 
   */
  public double valeurEnEuros(){
      return this.montant * this.monnaie.getValeurDeJeton();
  }

  public String getProprietaire() {
      return proprietaire;
  }

  public Cryptomonnaie getMonnaie() {
      return monnaie;
  }

  public double getMontant() {
      return montant;
  }

  @Override
  public String toString() {
      return String.format("%10s",proprietaire) + " : "
           + String.format("%10.1f", montant)   + " x " 
           + this.monnaie.toString()            + " = "
           + String.format("%10.1f", valeurEnEuros());
  }

}
