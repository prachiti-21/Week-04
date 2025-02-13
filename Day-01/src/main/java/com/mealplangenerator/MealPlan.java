package com.mealplangenerator;

import java.util.ArrayList;
import java.util.List;

// Interface defining a meal plan
interface MealPlan {
    void showMeal();
    String getMealType();
}

// Concrete meal types
/*class VegetarianMeal implements MealPlan {
    @Override
    public void showMeal() {
        System.out.println("Vegetarian Meal: Grilled tofu, quinoa salad, and steamed vegetables.");
    }

    @Override
    public String getMealType() {
        return "Vegetarian";
    }
}

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

// Generic class to manage different meal plans
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

// Meal plan generator class
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

// Main class to test the system
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
}*/

