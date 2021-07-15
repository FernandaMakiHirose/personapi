package one.digitalinnovation.personapi.repositories;

import one.digitalinnovation.personapi.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

// extende uma classe do repository (JpaRepository), a entidade Person que é Long
public interface PersonRepository extends JpaRepository<Person, Long> {
}
