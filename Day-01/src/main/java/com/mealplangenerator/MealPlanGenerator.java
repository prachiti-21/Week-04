package com.mealplangenerator;

import java.util.ArrayList;
import java.util.List;

class MealPlanGenerator {
    private List<Meal<? extends MealPlan>> mealPlans = new ArrayList<>();

    public void addMeal(Meal<? extends MealPlan> meal) {
        mealPlans.add(meal);
    }

    // Generic method to validate and generate meal plan dynamically
    public <T extends MealPlan> void generateMealPlan(T meal) {
        System.out.println("Generating a personalized meal plan for: " + meal.getMealType());
        meal.showMeal();
        System.out.println("----------------------------");
    }

    // Display all available meal plans
    public void showAllMealPlans() {
        for (Meal<? extends MealPlan> meal : mealPlans) {
            meal.displayMeal();
            System.out.println("----------------------------");
        }
    }
}


