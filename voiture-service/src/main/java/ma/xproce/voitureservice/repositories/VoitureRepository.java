package ma.xproce.voitureservice.repositories;

import jakarta.transaction.Transactional;
import ma.xproce.voitureservice.entities.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoitureRepository extends JpaRepository<Voiture,Long> {
}
