import java.util.ArrayList;
import java.util.Objects;

public class Bird {
    static ArrayList<Bird> birdList = new ArrayList<>();
    String name;
    String latinName;
    int noOfObservations;
    Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        noOfObservations = 0;
        birdList.add(this);
    }
    public void observed(){
        noOfObservations++;
    }
    public void printInfo(){
        System.out.println(this.name+" ("+this.latinName+"):" + this.noOfObservations + " observations");
    }
    public int hashCode() {
        return this.latinName.hashCode() + this.name.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bird bird = (Bird) o;
        return noOfObservations == bird.noOfObservations && Objects.equals(name, bird.name) && Objects.equals(latinName, bird.latinName);
    }
}
