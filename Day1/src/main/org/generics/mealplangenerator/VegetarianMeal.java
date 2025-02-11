package org.generics.mealplangenerator;
// class to generate a vegetarian meal
public class VegetarianMeal implements MealPlan {
    private String mealName;

    public VegetarianMeal(String mealName) {
        this.mealName = mealName;
    }

    @Override
    public String getMealName() {
        return mealName;
    }

    @Override
    public void displayMeal() {
        System.out.println("Vegetarian Meal: " + mealName);
    }
}