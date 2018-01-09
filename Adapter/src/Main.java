import Adapter.Adaptor;
import Adapter.Civilian;
import Adapter.Movement;
import Adapter.Soldiers.General;
import Adapter.Soldiers.Order;
import Adapter.Soldiers.Soldier;

public class Main {

    public static void main(String[] args) {
        General general = new General();

        //just a simple peasant
        Movement person = new Civilian();

        person.walk();

        System.out.println("-- Citizen has joined the army, his life is about to get a whole lot more interesting --");

        person = new Adaptor(new Soldier(), general);

        person.walk();
        general.setOrder(Order.STROLLING);
        person.walk();

        general.setOrder(Order.RUNNING);

        person.walk();
    }
}
