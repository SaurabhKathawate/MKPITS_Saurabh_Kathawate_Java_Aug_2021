import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class main_p1 {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        System.out.println("Starting Transaction");

        entityManager.getTransaction().begin();
        emp_p1 ob=new emp_p1();
        ob.setId(1);
        ob.setName("Saurabh");
        System.out.println("Saving Employee to Database");

        entityManager.persist(ob);
        entityManager.getTransaction().commit();

//        close the entity manager
        entityManager.close();
        entityManagerFactory.close();
    }
}
