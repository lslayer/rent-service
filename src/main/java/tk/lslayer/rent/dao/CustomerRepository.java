package tk.lslayer.rent.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import tk.lslayer.rent.model.Customer;

import java.util.List;

public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Customer findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);

}