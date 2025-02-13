package com.mealplangenerator;

class KetoMeal implements MealPlan {
    @Override
    public void showMeal() {
        System.out.println("Keto Meal: Grilled salmon, broccoli with butter, and a mixed green salad.");
    }

    @Override
    public String getMealType() {
        return "Keto";
    }
}