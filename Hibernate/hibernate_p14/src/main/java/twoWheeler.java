import javax.persistence.Entity;

@Entity
public class twoWheeler extends vehicle{
    private String sthandle;

    public String getSthandle() {
        return sthandle;
    }

    public void setSthandle(String sthandle) {
        this.sthandle = sthandle;
    }
}
