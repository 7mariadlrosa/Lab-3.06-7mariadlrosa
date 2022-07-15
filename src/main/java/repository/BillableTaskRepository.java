import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import model.BillableTask;

@Repository
public interface BillableTaskRepository extends JpaRepository<BillableTask, Integer> {
}
