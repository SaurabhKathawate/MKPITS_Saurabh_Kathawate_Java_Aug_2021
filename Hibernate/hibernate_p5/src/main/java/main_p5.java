import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class main_p5 {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        System.out.println("Starting Transaction");

        entityManager.getTransaction().begin();

        Address a1=new Address();
        a1.setCity("Nagpur");
        a1.setState("Maharashtra");
        a1.setPincode(440030);
        emp_p5 eob1=new emp_p5();
        eob1.setName("Saurabh");
        eob1.setEmail("sbk@gmail.com");
        eob1.setAob(a1);
        /////////////////
        Address a2=new Address();
        a2.setCity("Ramtek");
        a2.setState("Maharashtra");
        a2.setPincode(440031);
        emp_p5 eob2=new emp_p5();
        eob2.setName("Mahesh");
        eob2.setEmail("mpw@gmail.com");
        eob2.setAob(a2);

      System.out.println("Saving Employee to Database");
        entityManager.persist(eob1);

        entityManager.persist(eob2);

        entityManager.getTransaction().commit();

//      close the entity manager
        entityManager.close();
        entityManagerFactory.close();
    }
}
