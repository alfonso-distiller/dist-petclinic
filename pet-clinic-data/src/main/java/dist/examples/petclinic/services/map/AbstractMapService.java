package dist.examples.petclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID> {
	protected Map<ID, T> data = new HashMap<>();
	
	Set<T> findAll(){
		return new HashSet<>(data.values());
	}
	
	T findById(ID id) {
		return data.get(id);
	}
	
	T save(T object, ID id) {
		data.put(id, object);
		return object;
	}
	
	void deleteById(ID id) {
		data.remove(id);
	}
	
	void delete(T object) {
		data.entrySet().removeIf(entry -> entry.getValue().equals(object));
	}
}
