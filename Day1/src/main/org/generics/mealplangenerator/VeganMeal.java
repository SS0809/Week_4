package org.generics.mealplangenerator;

// class to generate a vegan meal
public class VeganMeal implements MealPlan {
    private String mealName;

    public VeganMeal(String mealName) {
        this.mealName = mealName;
    }

    @Override
    public String getMealName() {
        return mealName;
    }

    @Override
    public void displayMeal() {
        System.out.println("Vegan Meal: " + mealName);
    }
}