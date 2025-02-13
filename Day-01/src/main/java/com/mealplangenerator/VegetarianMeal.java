package com.mealplangenerator;

class VegetarianMeal implements MealPlan {
    @Override
    public void showMeal() {
        System.out.println("Vegetarian Meal: Grilled tofu, quinoa salad, and steamed vegetables.");
    }

    @Override
    public String getMealType() {
        return "Vegetarian";
    }
}
