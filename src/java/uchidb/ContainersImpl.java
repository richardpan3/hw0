package uchidb;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.HashMap;

public class ContainersImpl implements Containers {
	private Map<Object,Object> private_map; 
	
	public Set initSet(Object[] tArray) {
		Set<Object> set = new HashSet<Object>();
		for (int i = 0; i < tArray.length; ++i) {
			set.add(tArray[i]);
		}
		return set;
	}

	public List initList(Object[] tArray) {
		List<Object> list = new LinkedList<Object>();
		for (int i = 0; i < tArray.length; ++i) {
			list.add(tArray[i]);
		}
		return list;
	}

	public Map initEmptyMap() {
		Map<Object,Object> map = new HashMap<Object,Object>();
		return map;
	}

	public void storeMap(Map mapToStoreInClass) {
		this.private_map = mapToStoreInClass;
	}

	public boolean addToMap(Object key, Object value,
			boolean overwriteExistingKey) {
		if (overwriteExistingKey) {
			this.private_map.put(key, value);
			return true;
		} else if (!this.private_map.containsKey(key)) {
			this.private_map.put(key, value);
			return true;
		}
		return false;
	}

	public Object getValueFromMap(Object key) {
		System.out.println("request for key: " + (String)key);
		return this.private_map.get(key);
	}

	public Object getValueFromMap(Object key, Object defaultValue) {
		if (this.private_map.containsKey(key)) {
			return this.private_map.get(key);
		} else {
			return defaultValue;
		}
	}

}
