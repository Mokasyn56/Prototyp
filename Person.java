/**
 * Created by huber on 06.11.2017.
 */
public class Person{
    private String Name;
    private String Surname;
    private double Money;
    

    public Person(){
        this.Name = null;
        this.Surname = null;
        this.Money = 0.00;
    }

    public Person(String name, String surname){
        this.Name = name;
        this.Surname = surname;
        this.Money = 0.00;
    }

    public Person(String name, String surname, double money){
        this.Name = name;
        this.Surname = surname;
        this.Money = money;
    }

    public double getMoney() {
        return this.Money;
    }

    public String getName() {
        return this.Name;
    }

    public String getSurname() {
        return this.Surname;
    }

    public void setMoney(double money) {
        this.Money = money;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setSurname(String surname) {
        this.Surname = surname;
    }
}
