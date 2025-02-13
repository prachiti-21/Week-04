package com.mealplangenerator;

class HighProteinMeal implements MealPlan {
    @Override
    public void showMeal() {
        System.out.println("High-Protein Meal: Chicken breast, brown rice, and roasted sweet potatoes.");
    }

    @Override
    public String getMealType() {
        return "High-Protein";
    }
}
