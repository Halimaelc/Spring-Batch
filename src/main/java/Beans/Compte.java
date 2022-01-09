package Beans;

public class Compte {
	Long idcompte;
	float solde;
	public Compte(Long idcompte, float solde) {
		super();
		this.idcompte = idcompte;
		this.solde = solde;
	}
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdcompte() {
		return idcompte;
	}
	public void setIdcompte(Long idcompte) {
		this.idcompte = idcompte;
	}
	public float getSolde() {
		return solde;
	}
	public void setSolde(float solde) {
		this.solde = solde;
	}


}
