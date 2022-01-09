package Dao;

import java.util.Date;

public class DaoImpl implements IDao {
	
	 private Long idTransaction;
	    private Date dateTransaction;
	    private Long idCompte;
	    private Float montant;

	public Long getIdTransaction() {
			return idTransaction;
		}

		public void setIdTransaction(Long idTransaction) {
			this.idTransaction = idTransaction;
		}

		public Date getDateTransaction() {
			return dateTransaction;
		}

		public void setDateTransaction(Date dateTransaction) {
			this.dateTransaction = dateTransaction;
		}

		public Long getIdCompte() {
			return idCompte;
		}

		public void setIdCompte(Long idCompte) {
			this.idCompte = idCompte;
		}

		public Float getMontant() {
			return montant;
		}

		public void setMontant(Float montant) {
			this.montant = montant;
		}

	@Override
	public void DebiterCompte(String idcompte, float montant) {
		// TODO Auto-generated method stub
		
	}

}
