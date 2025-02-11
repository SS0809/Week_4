package org.generics.mealplangenerator;

// class to add a Keto protein meal
public class KetoMeal implements MealPlan {
    private String mealName;

    public KetoMeal(String mealName) {
        this.mealName = mealName;
    }

    @Override
    public String getMealName() {
        return mealName;
    }

    @Override
    public void displayMeal() {
        System.out.println("Keto Meal: " + mealName);
    }
}