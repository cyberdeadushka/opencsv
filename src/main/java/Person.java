import java.util.*;
public class Person {

    private String id;
    private String name;
    private String sex;
    private String salary;
    private String BirthDate;
    private Subdivision subd;
    public

    Person(String i, String n, String s, String sal, String bd, String t, int idd)
    {
        id = i;
        name = n;
        sex = s;
        salary = sal;
        BirthDate = bd;
        subd = new Subdivision(t, idd);
    }

    public Person()
    { }

    public String getId()
    {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getSalary() {
        return salary;
    }

    public String getBirthDate() {
        return BirthDate;
    }

    public String getSubdTitle() {
        return subd.getTitle();
    }

    public int getSubdId()
    {
        return subd.getId();
    }

}