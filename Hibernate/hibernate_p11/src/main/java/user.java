import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)

    private Integer id;

    private String uname;
    @OneToMany
    private Collection<vehicle> vob=new ArrayList<vehicle>();

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

    public Collection<vehicle> getVob() {
        return vob;
    }

    public void setVob(Collection<vehicle> vob) {
        this.vob = vob;
    }
}
