package org.generics.mealplangenerator;

import java.util.ArrayList;
import java.util.List;

// class to add a Meals in a list
public class Meal<T extends MealPlan> {
    private List<T> meals = new ArrayList<>();

    // Add meal to the plan
    public void addMeal(T meal) {
        meals.add(meal);
    }

    // Retrieve all meals
    public List<T> getMeals() {
        return meals;
    }

    // Generic method to generate and validate a meal plan
    public static <T extends MealPlan> void generateMealPlan(List<T> meals) {
        for (T meal : meals) {
            meal.displayMeal();
        }
    }
}