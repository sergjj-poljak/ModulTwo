package ModulTwo.Modul;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Admin on 11.12.2015.
 */
public class Programma {
    private String name;
    private String pochatok;
    private String kinec;
    private Set<String> categories = new HashSet<>();

    public Programma ( String name,String pochatok, String kinec){


        this.name = name;
        this.pochatok = pochatok;
        this.kinec = kinec;

    }
    public Set<String> getCategories() {
        return categories;
    }
    public Programma addCategory(String category) {
        categories.add(category);
        return this;
    }

    public String getName() {return name;}
    public void setName(String name){this.name = name;}

    public String getPochatok() {return pochatok;}
    public  void setPochatok(String pochatok) {this.pochatok = pochatok;}

    public String getKinec(){return kinec;}
    public void setKinec(String kinec) { this.kinec = kinec;}

    @Override
    public String toString() {
        return "" +
                "" + name + " \t" +
                "" + pochatok + "  \t" +
                " - " + kinec +
                "";
    }
}
