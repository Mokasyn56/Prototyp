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

    @Override
    public void checkCollectedMoney() {
        int zlotowki = 0;
        int dwazlote = 0;
        int pieczlotych = 0;
        int dziesieczl = 0;
        int dwadziesciazl = 0;
        int piecdziesiatzl = 0;
        int stozl = 0;
        int dwiesciezl = 0;
        for (Person p: lista) {
            for(Nominal nominal: p.getKwoty()){
                if(nominal.getValue()==1){
                    zlotowki++;
                }
                else if(nominal.getValue()==2){
                    dwazlote++;
                }
                else if(nominal.getValue()==5){
                    pieczlotych++;
                }
                else if(nominal.getValue()==10){
                    dziesieczl++;
                }
                else if(nominal.getValue()==20){
                    dwadziesciazl++;
                }
                else if(nominal.getValue()==50){
                    piecdziesiatzl++;
                }
                else if(nominal.getValue()==100){
                    stozl++;
                }
                else if(nominal.getValue()==200){
                    dwiesciezl++;
                }
            }
            System.out.println(p.getName()+" "+p.getSurname()+" zebrał "+zlotowki+" zlotówek, "+dwazlote+" dwuzłotówek, "+pieczlotych+" pięciozłotówek, "+dziesieczl+" banknotów 10zł, "+dwadziesciazl+", banknotów 20zł, "+piecdziesiatzl+" banknotów 50zł, "+stozl+" banknotów 100zł i "+dwiesciezl+" banknotów 200zł.");
            zlotowki = 0;
            dwazlote = 0;
            pieczlotych = 0;
            dziesieczl = 0;
            dwadziesciazl = 0;
            piecdziesiatzl = 0;
            stozl = 0;
            dwiesciezl = 0;
        }
    }
}
