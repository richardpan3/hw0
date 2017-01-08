package uchidb;
import uchidb.ContainersImpl;

/**
 * @author aelmore
 */


public class HW0Runner {
	private static boolean already_created = false;
	private static ContainersImpl obj = null;
	//TODO you likely will need to add member variable
	
	// This class is a factory for a singleton containers class.
	// https://www.tutorialspoint.com/java/java_using_singleton.htm
	public static Containers<Integer, String> getContainers() {
		if (!already_created) {
			already_created = true;
			obj = new ContainersImpl();
			return obj;
		} else {
			return obj;
		}
	}


	public static void main(String[] args){
		
	}
}
