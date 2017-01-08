package uchidb;
import uchidb.ContainersImpl;

/**
 * @author aelmore
 */

public class HW0Runner {
	//TODO you likely will need to add member variable
	
	// This class is a factory for a singleton containers class.
	// https://www.tutorialspoint.com/java/java_using_singleton.htm
	public static Containers<Integer, String> getContainers() {
		ContainersImpl obj = ContainersImpl.getInstance();
		return obj;
	}


	public static void main(String[] args){
		
	}
}
