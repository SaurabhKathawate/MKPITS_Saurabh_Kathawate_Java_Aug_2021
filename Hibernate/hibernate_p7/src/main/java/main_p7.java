import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class main_p7 {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        System.out.println("Starting Transaction");

        entityManager.getTransaction().begin();
        Address a1=new Address();
        a1.setCity("Nagpur");
        a1.setState("maha");
        a1.setPincode(440030);

        Address a2=new Address();
        a2.setCity("Home city");
        a2.setState("Home State");
        a2.setPincode(100000);

        emp_p7 ob=new emp_p7();

        ob.setName("ram");
        ob.getAd1().add(a1);         //added in collection so we used   .getAd1()
        ob.getAd1().add(a2);

        emp_p7 ob2=new emp_p7();
        ob2.setName("shyam");
        ob2.getAd1().add(a1);         //added in collection so we used   .getAd1()
        ob2.getAd1().add(a2);

        System.out.println("Saving Employee to Database");

        entityManager.persist(ob);

        entityManager.persist(ob2);
//        emp_p7 e1=entityManager.find(emp_p7.class,1l);
//        System.out.println(e1.getId()+" "+e1.getName()+" "+e1.getAd1()+" "+e1.getClass());

        entityManager.getTransaction().commit();

//        close the entity manager
        entityManager.close();
        entityManagerFactory.close();
    }
}
