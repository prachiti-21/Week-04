package com.mealplangenerator;

public class MealPlanSystem {
    public static void main(String[] args) {
        MealPlanGenerator generator = new MealPlanGenerator();

        // Creating meal plans
        Meal<VegetarianMeal> vegMeal = new Meal<>(new VegetarianMeal());
        Meal<VeganMeal> veganMeal = new Meal<>(new VeganMeal());
        Meal<KetoMeal> ketoMeal = new Meal<>(new KetoMeal());
        Meal<HighProteinMeal> proteinMeal = new Meal<>(new HighProteinMeal());

        // Adding meals to generator
        generator.addMeal(vegMeal);
        generator.addMeal(veganMeal);
        generator.addMeal(ketoMeal);
        generator.addMeal(proteinMeal);

        // Display all meal plans
        generator.showAllMealPlans();

        // Generating a specific meal plan dynamically
        generator.generateMealPlan(new KetoMeal());
        generator.generateMealPlan(new HighProteinMeal());
    }
}
