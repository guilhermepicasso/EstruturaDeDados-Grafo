import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class CityGraph {
    private Map<String, ArrayList<String>> adjacencyList;

    public CityGraph() {
        adjacencyList = new HashMap<>();
    }

    public void addCity(String city) {
        adjacencyList.put(city, new ArrayList<>());
    }

    public void addConnection(String city1, String city2) {
        adjacencyList.get(city1).add(city2);
        adjacencyList.get(city2).add(city1);
    }

    public ArrayList<String> getConnections(String city) {
        return adjacencyList.get(city);
    }
}
