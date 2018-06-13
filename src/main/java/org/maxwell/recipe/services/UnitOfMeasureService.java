package org.maxwell.recipe.services;

import java.util.Set;
import org.maxwell.recipe.commands.UnitOfMeasureCommand;

public interface UnitOfMeasureService {

	Set<UnitOfMeasureCommand> listAllUoms();
}
