package uchidb;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;

public class ContainersImpl implements Containers<Integer,String> {
	
	//note: code for singleton inspired by https://www.tutorialspoint.com/java/java_using_singleton.htm
	private static ContainersImpl cont = new ContainersImpl();

	public static ContainersImpl getInstance() {
	   return cont;
	}
	
	private Map<String,Integer> private_map = null; 
	
	public Set<Integer> initSet(Integer[] tArray) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < tArray.length; ++i) {
			set.add(tArray[i]);
		}
		return set;
	}

	public List initList(Integer[] tArray) {
		List<Integer> list = Arrays.asList(tArray);
		return list;
	}

	public Map initEmptyMap() {
		Map<String,Integer> map = new HashMap<String,Integer>();
		return map;
	}

	public void storeMap(Map<String,Integer> mapToStoreInClass) {
		this.private_map = mapToStoreInClass;
	}

	public boolean addToMap(String key, Integer value, boolean overwriteExistingKey) {
		if (overwriteExistingKey) {
			this.private_map.put(key, value);
			return true;
		} else if (!this.private_map.containsKey(key)) {
			this.private_map.put(key, value);
			return true;
		}
		return false;
	}

	public Integer getValueFromMap(String key) {
		if(this.private_map!=null) {
			return this.private_map.get(key);
		}
		return 1; //error case, should not do this unless tests don't run in order	
	}

	public Integer getValueFromMap(String key, Integer defaultValue) {
		if (this.private_map.containsKey(key)) {
			return this.private_map.get(key);
		} else {
			return defaultValue;
		}
	}


}
