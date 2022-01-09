package Beans;

import java.util.Date;

public class Transaction {
	Long idTransation;
	float montant;
	Date dateTransaction;
	Date dateDebit;
	
	private Compte compte;
	public Compte getCompte() {
		return compte;
	}
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	public Long getIdTransation() {
		return idTransation;
	}
	public void setIdTransation(Long idTransation) {
		this.idTransation = idTransation;
	}
	public float getMontant() {
		return montant;
	}
	public void setMontant(float montant) {
		this.montant = montant;
	}
	public Date getDateTransaction() {
		return dateTransaction;
	}
	public void setDateTransaction(Date dateTransaction) {
		this.dateTransaction = dateTransaction;
	}
	public Date getDateDebit() {
		return dateDebit;
	}
	public void setDateDebit(Date dateDebit) {
		this.dateDebit = dateDebit;
	}
	public Transaction(Long idTransation, float montant, Date dateTransaction, Date dateDebit) {
		super();
		this.idTransation = idTransation;
		this.montant = montant;
		this.dateTransaction = dateTransaction;
		this.dateDebit = dateDebit;
	}
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
