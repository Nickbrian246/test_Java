import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PokeApi {

    Map<String, Integer> a = new HashMap<>();
    
    public void addPokemon(String key, Integer value) {
        a.put(key, value);
    }
    public Optional<String> check100(Map<String, Integer> obj) {
        int accumulated = 0;
        for (Map.Entry<String, Integer> entry : obj.entrySet()) {
            accumulated += entry.getValue();
        }
        if (accumulated > 100) {
            return Optional.of("No hay 100% pa");
        }
        return Optional.empty();
    }

    public String getPokemon(){
      check100(a);
      int randomNumber = (int) (Math.random()*100 +1);
      String closest = null;
      int minDifference = Integer.MAX_VALUE;

      for(Map.Entry<String, Integer> entry : a.entrySet()){
        int difference = Math.abs(randomNumber - entry.getValue());
        if(difference< minDifference){
          closest = entry.getKey();
          minDifference = difference;
        }
      }
      return closest;
    }
    

}
