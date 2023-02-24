package uz.brogrammers.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uz.brogrammers.entity.Author;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
