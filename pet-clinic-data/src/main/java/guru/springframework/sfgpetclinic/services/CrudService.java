package guru.springframework.sfgpetclinic.services;

import java.util.Set;

public interface CrudService<T, ID> {
	T findById(Long id);
	T save(T object);
	Set<T> findAll();
	void delete(T Object);
	void deleteById(Long id);
}

