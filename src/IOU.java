import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> manasIOU;
    public IOU(){
        manasIOU = new HashMap<>();
    }
    public void setSum(String toWhom, double amount){
        manasIOU.put(toWhom, amount);
    }
    public double howMuchDoIOweTo(String toWhom){
        return manasIOU.getOrDefault(toWhom, 0.0);
    }
    double a = Math.tan(10);
}