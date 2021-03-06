package mezz.jei.gui.recipes;

import java.util.List;

import com.google.common.collect.ImmutableList;
import mezz.jei.api.recipe.IFocus;
import mezz.jei.api.recipe.IRecipeCategory;

public interface IRecipeGuiLogic {

	String getPageString();

	void setRecipesPerPage(int recipesPerPage);

	boolean hasMultipleCategories();

	boolean hasAllCategories();

	void previousRecipeCategory();

	void nextRecipeCategory();

	void setRecipeCategory(IRecipeCategory category);

	boolean hasMultiplePages();

	void previousPage();

	void nextPage();

	<V> boolean setFocus(IFocus<V> focus);

	boolean back();

	void clearHistory();

	boolean setCategoryFocus();

	boolean setCategoryFocus(List<String> recipeCategoryUids);

	IRecipeCategory getSelectedRecipeCategory();

	ImmutableList<IRecipeCategory> getRecipeCategories();

	List<Object> getRecipeCatalysts();

	List<Object> getRecipeCatalysts(IRecipeCategory recipeCategory);

	List<RecipeLayout> getRecipeLayouts(int posX, int posY, int spacingY);
}
