package org.generics.mealplangenerator;
// class to add a high protein meal
public class HighProteinMeal implements MealPlan {
    private String mealName;

    public HighProteinMeal(String mealName) {
        this.mealName = mealName;
    }

    @Override
    public String getMealName() {
        return mealName;
    }

    @Override
    public void displayMeal() {
        System.out.println("High-Protein Meal: " + mealName);
    }
}