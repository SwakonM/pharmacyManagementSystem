package pl.swakon.pharmacy.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.swakon.pharmacy.dao.entity.chemicals;

@Repository
public interface chemicalsRepo extends CrudRepository<chemicals, Long> {
}
