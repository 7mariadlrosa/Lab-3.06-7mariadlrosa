
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import java.util.Date;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class InternalTask extends Tasks {

    public InternalTask() {
    }

    public InternalTask(String title, Date dueDate, Boolean status) {
        super(title, dueDate, status);
    }
}
