package tk.lslayer.rent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.lslayer.rent.dao.CustomerRepository;
import tk.lslayer.rent.dao.RentObjectRepository;
import tk.lslayer.rent.model.Customer;
import tk.lslayer.rent.model.RentObject;

@SpringBootApplication
public class OshytkyRentApplication implements CommandLineRunner {

    @Autowired
    private CustomerRepository repository;
    @Autowired
    private RentObjectRepository rentObjectRepository;

    public static void main(String[] args) {
        SpringApplication.run(OshytkyRentApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

/*        repository.deleteAll();
        rentObjectRepository.deleteAll();

        // save a couple of customers
        rentObjectRepository.save(new RentObject("House", "Nice house for diving"));
        rentObjectRepository.save(new RentObject("House", "Nice house for sleeping"));

        for (RentObject object: rentObjectRepository.findAll()) {
            System.out.println(object);
        }*/

    }
}
