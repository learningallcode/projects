
public class TestLinkedList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String> listPlaces = new LinkedList<String> ("Bangalore");
		listPlaces.addNode("Mumbai");
		listPlaces.addNode("Belgaum");
		listPlaces.addNode("Kolkata");
		listPlaces.delNode("Mumbai");
		listPlaces.display();
	}
}
