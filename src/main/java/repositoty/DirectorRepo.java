package repositoty;

import entity.Director;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DirectorRepo extends JpaRepository<Director,Integer> {
}
