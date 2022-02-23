import javax.persistence.*;

@Entity
public class vehicle_7 {
    @Id
    @Column(name = "vid", nullable = false)
    private Integer vid;
    private String vname;

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }
}
