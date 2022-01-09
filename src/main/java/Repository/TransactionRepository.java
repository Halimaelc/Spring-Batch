package Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Beans.Transaction;
@Repository
public interface TransactionRepository extends JpaRepository<Transaction,Long>{

}
