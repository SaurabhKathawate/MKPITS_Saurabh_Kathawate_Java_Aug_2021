import javax.persistence.*;

@Entity
public class emp_p6 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id",nullable = false)
    private Long id;
    private String name;
    private String email;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "pincode",column = @Column(name="home_pincode")),
            @AttributeOverride(name = "city",column = @Column(name = "home_city")),
            @AttributeOverride(name="state",column = @Column(name = "home_state"))
    })
    private Address home_add;
    @Embedded
    private Address office_add;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getHome_add() {
        return home_add;
    }

    public void setHome_add(Address home_add) {
        this.home_add = home_add;
    }

    public Address getOffice_add() {
        return office_add;
    }

    public void setOffice_add(Address office_add) {
        this.office_add = office_add;
    }
}
