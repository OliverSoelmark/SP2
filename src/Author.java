import java.util.ArrayList;

public class Author {
    //Class Attributes
    private String name;
    private ArrayList<Title> titles = new ArrayList<>();

    public Author(String name) {
        this.name = name;
    }

    public void addTitle(Title title){
    titles.add(title);
    }

    public double calculateRoyalties(){
        double sum = 0;

        for (Title e: titles){
            sum+=e.calculateRoyalty();
        }
        return sum;
    }

    public String getName(){

        return name;
    }
}
