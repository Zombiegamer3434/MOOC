import java.util.ArrayList;

public class Recipes {
    String name;
    int cookingTime;
    ArrayList<String> ingredients = new ArrayList<>();
    public static ArrayList<Recipes> recipesArray = new ArrayList<>();
    Recipes(String name, int cookingTime, ArrayList<String>ingredients){
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
        recipesArray.add(this);
    }
    public void printInfo(){
        System.out.println(this.name+", Cooking time: "+this.cookingTime);
        System.out.println(this.ingredients);
    }

}
