package dist.examples.petclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, Id> {
	protected Map<Id, T> data = new HashMap<>();
	
	Set<T> findAll(){
		return new HashSet<>(data.values());
	}
	
	T findById(Id id) {
		return data.get(id);
	}
	
	T save(T object, Id id) {
		data.put(id, object);
		return object;
	}
	
	void deleteById(Id id) {
		data.remove(id);
	}
	
	void delete(T object) {
		data.entrySet().removeIf(entry -> entry.getValue().equals(object));
	}
}
