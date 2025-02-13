package com.mealplangenerator;

class Meal<T extends MealPlan> {
    private T mealType;

    public Meal(T mealType) {
        this.mealType = mealType;
    }

    public void displayMeal() {
        System.out.println("Selected Meal Type: " + mealType.getMealType());
        mealType.showMeal();
    }

    public T getMealType() {
        return mealType;
    }
}
