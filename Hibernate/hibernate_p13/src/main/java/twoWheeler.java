import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value ="TW")
public class twoWheeler extends vehicle{
    private String sthandle;

    public String getSthandle() {
        return sthandle;
    }

    public void setSthandle(String sthandle) {
        this.sthandle = sthandle;
    }
}
