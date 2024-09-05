import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> abbreviationsMap;
    Abbreviations(){
        abbreviationsMap = new HashMap<>();
    }
    public void addAbbreviation(String abbreviation, String explanation){
        abbreviationsMap.put(abbreviation, explanation);
    }
    public boolean hasAbbreviation(String abb){
        return (abbreviationsMap.get(abb)!=null);
    }
    public String findExplanationFor(String abb){
        return abbreviationsMap.get(abb);
    }
}
