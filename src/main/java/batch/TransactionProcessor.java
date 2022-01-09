package batch;
import org.springframework.batch.item.ItemProcessor;

import Beans.Transaction;
public class TransactionProcessor implements ItemProcessor<Transaction, Transaction> {
	
	ModelMapper mapper;
	
	@Override
	public Transaction process(Transaction transaction) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getTransactionFromTransactionDTO(transaction);;
	}

}
