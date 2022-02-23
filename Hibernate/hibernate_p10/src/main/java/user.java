import javax.persistence.*;

@Entity
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)

    private Integer id;

    private String uname;
    @OneToOne
    private vehicle vob;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public vehicle getVob() {
        return vob;
    }

    public void setVob(vehicle vob) {
        this.vob = vob;
    }
}
