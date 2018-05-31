package tk.lslayer.rent.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import tk.lslayer.rent.model.RentObject;

import java.util.List;

/**
 * Created by lslay on 30.04.2018.
 */
public interface RentObjectRepository extends MongoRepository<RentObject, String> {
    public List<RentObject> findByName(String name);
}
