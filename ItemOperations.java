import java.util.ArrayList;;
public class ItemOperations {
	
	public static ArrayList<Item> fillItems() {
		ArrayList<Item>  items = new ArrayList<>();
		for(int i=1 ; i<=10; i++) {
			Item item = new Item(i,"Apple"+i,1000*i);
			items.add(item);
		}
		return items;
	}

}
