/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos_u4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juana García
 */
public class Graph {
    private List<Node> nodes;
 
    public void addNode(Node node) {
        if (nodes == null) {
            nodes = new ArrayList<>();
        }
        nodes.add(node);
    }
 
    public List<Node> getNodes() {
        return nodes;
    }
 
    @Override
    public String toString() {
        return "Graph [nodes=" + nodes + "]";
    }
}
