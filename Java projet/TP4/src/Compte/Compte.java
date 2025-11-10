package Compte;

public class Compte {
	public Double solde;

	public Compte(Double soldeInitial) {
		solde = soldeInitial;
		}

	public void deposer(Double montant) {
		if (montant > 0) {
			solde = solde + montant;
			System.out.println("Dépôt de " + montant + " DT effectué avec succès.");
			} else {
				System.out.println("Le montant du dépôt doit être positif !");
				}
		}

	public void retirer(Double montant) {
		if (montant > 0 && montant <= solde) {
			solde = solde - montant;
			System.out.println("Retrait de " + montant + " DT effectué avec succès.");
			} else if (montant > solde) {
				System.out.println("Solde insuffisant pour ce retrait !");
				} else {
					System.out.println("Le montant du retrait doit être positif !");
					}
		}
	public void verserVers(Compte autreCompte, Double montant) {
		if (montant > 0 && montant <= solde) {
			this.solde -= montant;
			autreCompte.solde += montant;
			System.out.println("Versement de " + montant + " DT vers le compte destinataire effectué avec succès.");
			} else if (montant > solde) {
				System.out.println("Solde insuffisant pour effectuer ce versement !");
				} else {
					System.out.println("Le montant du versement doit être positif !");
					}
		}

	public void afficher() {
		System.out.println("Solde actuel : " + solde + " DT");
		}
	}