package lesson_11

class RecipeCategory (
    val name: String,
    val description: String,
    val list: MutableList<Recipe>
) {}

class Ingredient(
    val name: String,
    val caloriesPer100Grams: Int,
    val dimension: String,
) {}

class Recipe(
    val name: String,
    val ingredients: MutableMap<Ingredient, Float>,
    val recipe: String,
) {}