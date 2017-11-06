import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by huber on 06.11.2017.
 */
public class TeamSalvator extends Team {
    public List<Person> lista = new ArrayList<>();

    @Override
    public Object clone() throws CloneNotSupportedException {
        TeamSalvator teamSalvator1 = new TeamSalvator();
        for (Person p: lista) {
            teamSalvator1.lista.add(p);
        }
        return teamSalvator1;
    }

    @Override
    public double getCollectedMoney() {
        double money = 0;
        for (Person p: lista) {
            money += p.getMoney();
        }
        return money;
    }

    @Override
    public void sortPeopleByCollectedMoney() {
        Collections.sort(lista, new Comparator<Person>() {
            @Override
            public int compare(Person c1, Person c2) {
                return Double.compare(c1.getMoney(), c2.getMoney());
            }
        });
        for(Person person : lista){
            System.out.println("Person named "+person.getName()+" "+person.getSurname()+" collected "+person.getMoney());
        }
    }
}
