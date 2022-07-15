
import javax.persistence.Embeddable;

@Embeddable
public class Name{
    private String firstName;
    private String lastName;
    private String middleName;
    private String salutation;

    public Name(String firstName, String lastName, String middleName, String salutation) {
        setFirstName(firstName);
        setLasttName(lastName);
        setMiddleName(middleName);
        setSalutation(salutation);
    }

    //SETTERS
    public void setLasttName(String lasttName) {
        this.lastName = lasttName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    //GETTERS
    public String getLasttName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getSalutation() {
        return salutation;
    }

}
