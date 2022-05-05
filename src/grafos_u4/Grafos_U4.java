/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos_u4;

/**
 *
 * @author Juana García
 */
public class Grafos_U4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //el grafo contiene la lista de nodos
        Graph graph =getCities();
        System.out.println(graph);
    }
    // se crea metodo para mostrar el nombre de la ciudad asi como aristas de cada nodo
    public static Graph getCities(){
    Node df = new Node ("DF");
    Node toluca= new Node("Toluca");
    Node cuernavaca = new Node ("Cuernavaca");
    Node puebla = new Node ("puebla");
    Node tlaxcala= new Node("tlaxcala");
    //se especifican las relaciones de cada arista y la distancia entre las ciudades
    df.addEdge(new Edge(df,toluca,100));
    df.addEdge(new Edge(df,cuernavaca,90));
    toluca.addEdge(new Edge(toluca,cuernavaca,150));
    toluca.addEdge(new Edge(toluca,tlaxcala,340));
    
    
    cuernavaca.addEdge(new Edge(cuernavaca,puebla,100));
    puebla.addEdge(new Edge(puebla,tlaxcala,20));
    
    Graph graph = new Graph();
    graph.addNode(df);
    graph.addNode(toluca);
    graph.addNode(cuernavaca);
    graph.addNode(puebla);
    return graph;
    
    
    
    
    
    
    
    
}
}
