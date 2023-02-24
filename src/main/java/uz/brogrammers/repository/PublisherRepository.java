package uz.brogrammers.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uz.brogrammers.entity.Publisher;

@Repository
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
