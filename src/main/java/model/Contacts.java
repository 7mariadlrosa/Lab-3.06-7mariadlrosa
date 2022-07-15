
import javax.persistence.*;

@Entity
public class Contacts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Embedded
    private Name name;
    private String title;
    private String company;

    public Contacts() {
    }

    public Contacts(Name name, String title, String company) {
        setName(name);
        setTitle(title);
        setCompany(company);
    }

    //SETTERS
    public void setName(Name name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setCompany(String company) {
        this.company = company;
    }

    //GETTERS
    public Name getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }


}

