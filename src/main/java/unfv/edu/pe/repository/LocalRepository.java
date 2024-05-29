package unfv.edu.pe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import unfv.edu.pe.model.Local;
import unfv.edu.pe.projection.interfacebased.open.LocalOpenView;

@Repository
public interface LocalRepository extends JpaRepository<Local, Long>{

	List<LocalOpenView> findBy();
}
