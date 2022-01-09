package batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Beans.Transaction;
import Repository.TransactionRepository;

@Service
public class Transactionwriter implements ItemWriter<Transaction>{
	@Autowired
	 private TransactionRepository transactionRepository;

	@Override
	public void write(List<? extends Transaction> items) throws Exception {
		// TODO Auto-generated method stub
		 System.out.println("Saving Transactions");
	     transactionRepository.saveAll(items);
		
	}

}
