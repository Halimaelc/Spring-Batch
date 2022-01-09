package batch;

import Beans.Compte;
import Beans.Transaction;
import Dao.DaoImpl;

public class ModelMapper {
	 public Transaction getTransactionFromTransactionDAO(DaoImpl transactionDao){
		 
	        Transaction transaction=new Transaction();
	        
	        transaction.setIdTransation(transactionDao.getIdTransaction());
	        transaction.setDateTransaction(transactionDao.getDateTransaction());
	        transaction.setMontant(transactionDao.getMontant());
	        
	        Compte compte=new Compte();
	        
	        compte.setIdcompte(transactionDao.getIdCompte());
	        compte.setSolde(compte.getSolde()-transactionDao.getMontant());
	        transaction.setCompte(compte);
	        
	        return  transaction;
	    }

}
