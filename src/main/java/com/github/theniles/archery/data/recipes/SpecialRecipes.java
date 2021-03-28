package com.github.theniles.archery.data.recipes;

import com.github.theniles.archery.NileArchery;
import net.fabricmc.api.ModInitializer;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.SpecialRecipeSerializer;
import net.minecraft.util.registry.Registry;

/**
 * Mod initializer used to register special recipes (such as tipped arrow recipes).
 */
@SuppressWarnings("unused")
public class SpecialRecipes implements ModInitializer {

    public static final SpecialRecipeSerializer<CustomTippedArrowRecipe> CUSTOM_TIPPED_ARROW = new SpecialRecipeSerializer<>(CustomTippedArrowRecipe::new);

    public static final SpecialRecipeSerializer<SpectralArrowTippedRecipe> SPECTRAL_TIPPED_ARROW = new SpecialRecipeSerializer<>(SpectralArrowTippedRecipe::new);

    @Override
    public void onInitialize() {
        Registry.register(Registry.RECIPE_SERIALIZER, NileArchery.newId("custom_tipped_arrow"), CUSTOM_TIPPED_ARROW);
        Registry.register(Registry.RECIPE_SERIALIZER, NileArchery.newId("spectral_tipped_arrow"), SPECTRAL_TIPPED_ARROW);
    }
}
