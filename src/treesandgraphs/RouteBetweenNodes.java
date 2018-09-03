package treesandgraphs;

import java.util.LinkedList;

public class RouteBetweenNodes {
	enum State{VISITED, UNVISITED, VISITING};
	
	boolean routeSearch(Graph g, Node start, Node end) {
		if(start == end) return true;
		
		LinkedList<Node> q = new LinkedList<>();
		
		for(Node n : g.getNodes()) {
			n.state = State.UNVISITED;
		}
		
		start.state = State.VISITING;
		q.add(start);
		Node u;
		
		while(!q.isEmpty()) {
			u = q.removeFirst();
			if(u!=null) {
				for(Node n : u.getAdjacent()) {
					if(n.state == State.UNVISITED) {
						if(n == end) {
							return true;
						}else {
							n.state = State.VISITING;
							q.addFirst(n);
						}
					}
				}
				u.state = State.VISITED;
			}
		}
		return false;
	}
}
