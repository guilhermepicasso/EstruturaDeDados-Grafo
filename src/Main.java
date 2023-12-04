import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CityGraph cityGraph = new CityGraph();

        cityGraph.addCity("New York");
        cityGraph.addCity("Los Angeles");
        cityGraph.addCity("Chicago");
        cityGraph.addCity("San Francisco");

        cityGraph.addConnection("New York", "Los Angeles");
        cityGraph.addConnection("Los Angeles", "Chicago");
        cityGraph.addConnection("San Francisco", "New York");

        String city = "New York";
        ArrayList<String> connections = cityGraph.getConnections(city);

        System.out.println("Connections from " + city + ":");
        for (String connection : connections) {
            System.out.println(connection);
        }
    }
}
