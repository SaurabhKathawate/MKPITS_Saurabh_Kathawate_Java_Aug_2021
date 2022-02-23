import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        System.out.println("Starting Transaction");

        entityManager.getTransaction().begin();

        vehicle v1=new vehicle();
        v1.setVname("Vehicle");

        twoWheeler tw1=new twoWheeler();
        tw1.setVid(11);
        tw1.setVname("hero honda");
        tw1.setSthandle("has a handle");

        fourWheeler fw1=new fourWheeler();
        fw1.setVid(12);
        fw1.setVname("maruti");
        fw1.setStrwheel("has a steering");

//        entityManager.persist(v1);
        entityManager.persist(tw1);
        entityManager.persist(fw1);

        entityManager.getTransaction().commit();

//        close the entity manager
        entityManager.close();
        entityManagerFactory.close();
    }
}
