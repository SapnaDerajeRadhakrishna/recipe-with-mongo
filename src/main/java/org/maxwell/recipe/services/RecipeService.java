package org.maxwell.recipe.services;

import java.util.Set;

import org.maxwell.recipe.commands.RecipeCommand;
import org.maxwell.recipe.domain.Recipe;

public interface RecipeService {

	Set<Recipe> getRecipes();

	Recipe findById(String id);

	RecipeCommand findCommandById(String id);

	RecipeCommand saveRecipeCommand(RecipeCommand command);

	void deleteById(String idToDelete);
}
