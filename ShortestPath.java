package task5;

import java.util.*;

public class ShortestPath {
    public static void main(String[] args) {
        // declare the connections data for the nodes in the network
        Map<Character, List<Character>> connections = new HashMap<>();
        connections.put('A', Arrays.asList('B', 'C', 'D'));
        connections.put('B', Arrays.asList('A', 'C'));
        connections.put('C', Arrays.asList('A', 'B', 'D'));
        connections.put('D', Arrays.asList('A', 'C'));

        // Build the routing table for each node in the network
        Map<Character, Map<Character, Character>> Tables = build(connections);

        // Print as an output the routing table for every node 
        for (char node : Tables.keySet()) {
            System.out.println("Routing table for this node " + node + " is:");
            for (char to : Tables.get(node).keySet()) {
                System.out.println(to + " to " + Tables.get(node).get(to));
            }
            System.out.println();
        }
    }

    public static Map<Character, Map<Character, Character>> build(Map<Character, List<Character>> connections) {
    	
    	
    	
    // create a routing table for every node in the network

        Map<Character, Map<Character, Character>> Tables = new HashMap<>();
        for (char node : connections.keySet()) {
            Tables.put(node, new HashMap<>());
        }

        
        for (char node : connections.keySet()) {
            Queue<Character> r_queue = new LinkedList<>();
            Map<Character, Integer> distances = new HashMap<>();

            // Initialize the queue and destinations 
            r_queue.add(node);
            distances.put(node, 0);

            // find shortest paths to all other nodes in the network
            while (!r_queue.isEmpty()) {
                char current = r_queue.poll();
                for (char near : connections.get(current)) {
                    if (!distances.containsKey(near)) {
                        distances.put(near, distances.get(current) + 1);
                        Tables.get(node).put(near, current);
                        r_queue.add(near);
                    }
                }
            }
        }

        return Tables;
    }
}
