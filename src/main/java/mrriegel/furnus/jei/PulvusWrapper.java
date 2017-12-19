package mrriegel.furnus.jei;

import java.util.Collections;
import java.util.List;

import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.BlankRecipeWrapper;
import net.minecraft.item.ItemStack;

public class PulvusWrapper extends BlankRecipeWrapper {

	private ItemStack input, output;

	public PulvusWrapper(ItemStack input, ItemStack output) {
		super();
		this.input = input;
		this.output = output;
	}

	public List<ItemStack> getInputs() {
		return Collections.singletonList(input);
	}

	public List<ItemStack> getOutputs() {
		return Collections.singletonList(output);
	}

	@Override
	public void getIngredients(IIngredients ingredients) {
		ingredients.setInput(ItemStack.class, input);
		ingredients.setOutput(ItemStack.class, output);
	}

}