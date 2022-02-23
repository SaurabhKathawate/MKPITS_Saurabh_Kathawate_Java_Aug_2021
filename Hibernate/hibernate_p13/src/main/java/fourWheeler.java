import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value ="FW")
public class fourWheeler extends vehicle{
    private String strwheel;

    public String getStrwheel() {
        return strwheel;
    }

    public void setStrwheel(String strwheel) {
        this.strwheel = strwheel;
    }
}
