package lesson_11

class RecipeCategory (
    val name: String,
    val description: String,
    val list: MutableList<String>
) {}

class Ingredient(
    val name: String,
    val caloriesPer100Grams: Int,
    val dimension: String,
) {}

class Recipe(
    val name: String,
    val ingredients: MutableMap<String, Float>,
    val recipe: String,
) {}