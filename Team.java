import java.util.ArrayList;
import java.util.List;

/**
 * Created by huber on 06.11.2017.
 */
abstract class Team implements Cloneable{
    @Override
    abstract public Object clone() throws CloneNotSupportedException;

    abstract public double getCollectedMoney();
    abstract public void sortPeopleByCollectedMoney();
    abstract public void checkCollectedMoney();
}
