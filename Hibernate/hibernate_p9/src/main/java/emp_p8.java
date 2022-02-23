import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class emp_p8 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;

    @ElementCollection(fetch = FetchType.EAGER) //we have to make eager to fetch the list of address out of session
    //also it is used for set the list of object in table
            @JoinTable (name="empAddress", joinColumns=@JoinColumn (name="empID"))
    Set<Address> ad1=new HashSet<Address>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Address> getAd1() {
        return ad1;
    }

    public void setAd1(Set<Address> ad1) {
        this.ad1 = ad1;
    }

    @Override
    public String toString() {
        return "emp_p8{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ad1=" + ad1 +
                '}';
    }
}
