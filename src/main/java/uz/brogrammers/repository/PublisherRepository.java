package uz.brogrammers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.brogrammers.entity.Publisher;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
