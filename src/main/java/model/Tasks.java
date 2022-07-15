import javax.persistence.*;
import java.util.Date;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Tasks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private Date dueDate;
    private Boolean status;

    public Tasks() {
    }

    public Tasks(String title, Date dueDate, Boolean status) {
        setTitle(title);
        setDueDate(dueDate);
        setStatus(status);
    }

    //SETTERS
    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    //GETTERS
    public String getTitle() {
        return title;
    }

    public Integer getId() {
        return id;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public Boolean getStatus() {
        return status;
    }

}
