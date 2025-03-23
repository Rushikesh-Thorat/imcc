package pkgQuestion18;
import java.util.*;
public class TechnologyCounter {
private List<String> technologies;
    
    public TechnologyCounter() {
        technologies = new ArrayList<>();
    }
    
    public void addTechnology(String tech) {
        technologies.add(tech.trim());
    }
    
    public Map<String, Integer> getTechnologyCount() {
        Collections.sort(technologies);
        Map<String, Integer> techCount = new LinkedHashMap<>();
        for (String tech : technologies) {
            techCount.put(tech, techCount.getOrDefault(tech, 0) + 1);
        }
        return techCount;
    }
}
