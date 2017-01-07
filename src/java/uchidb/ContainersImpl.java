package uchidb;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

public class ContainersImpl implements Containers {
	public Set initSet(Object[] tArray) {
		Set<Object> set = new HashSet<Object>();
		for (int i = 0; i < tArray.length; ++i) {
			set.add(tArray[i]);
		}
		return set;
	}

	public List initList(Object[] tArray) {
		// TODO Auto-generated method stub
		return null;
	}

	public Map initEmptyMap() {
		// TODO Auto-generated method stub
		return null;
	}

	public void storeMap(Map mapToStoreInClass) {
		// TODO Auto-generated method stub

	}

	public boolean addToMap(Object key, Object value,
			boolean overwriteExistingKey) {
		// TODO Auto-generated method stub
		return false;
	}

	public Object getValueFromMap(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getValueFromMap(Object key, Object defaultValue) {
		// TODO Auto-generated method stub
		return null;
	}

}
