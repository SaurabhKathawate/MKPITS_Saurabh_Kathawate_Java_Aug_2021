import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class emp_p5 {
    private String name;
    private String email;
    @EmbeddedId
    private Address aob;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAob() {
        return aob;
    }

    public void setAob(Address aob) {
        this.aob = aob;
    }
}
