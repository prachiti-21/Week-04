package com.mealplangenerator;

class VeganMeal implements MealPlan {
    @Override
    public void showMeal() {
        System.out.println("Vegan Meal: Lentil soup, avocado toast, and fresh fruit.");
    }

    @Override
    public String getMealType() {
        return "Vegan";
    }
}
