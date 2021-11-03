package it.unibo.oop.lab.generics1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @param <N>
 *
 */
public final class UseGraph<String> implements Graph<String> {
	
	ArrayList<String> ar;
    private UseGraph() {
    	ArrayList<String> ar = new ArrayList<>();
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String... args) {
        final Graph<String> g = new UseGraph<>();
        g.addNode("a");
        g.addNode("b");
        g.addNode("c");
        g.addNode("d");
        g.addNode("e");
        g.addEdge("a", "b");
        g.addEdge("b", "c");
        g.addEdge("c", "d");
        g.addEdge("d", "e");
        g.addEdge("c", "a");
        g.addEdge("e", "a");
        /*
         * Should print ["a","b","c","d","e"], in any order
         */
        System.out.println(g.nodeSet());
        /*
         * ["d","a"], in any order
         */
        System.out.println(g.linkedNodes("c"));
        /*
         * Must print either the path b,c,a or b,c,d,e,a
         */
        System.out.println(g.getPath("b", "a"));
    }

	


	@Override
	public void addNode(String node) {
		// TODO Auto-generated method stub
		ar.add(node);
	}

	@Override
	public void addEdge(String source, String target) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<String> linkedNodes(String node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getPath(String source, String target) {
		// TODO Auto-generated method stub
		return null;
	}
}
