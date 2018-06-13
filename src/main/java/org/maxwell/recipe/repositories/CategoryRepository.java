package org.maxwell.recipe.repositories;

import java.util.Optional;

import org.maxwell.recipe.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, String> {

	Optional<Category> findByDescription(String description);
}
