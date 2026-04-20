package com.generics;

interface MealPlan {
    String getMealType();
}

class VegetarianMeal implements MealPlan {
    public String getMealType() {
        return "Vegetarian Meal";
    }
}

public class Meal<T extends MealPlan> {
    T meal;

    public void setMeal(T meal) {
        this.meal = meal;
    }

    public void displayMeal() {
        System.out.println(meal.getMealType());
    }

    public static void main(String[] args) {
        Meal<VegetarianMeal> meal = new Meal<>();
        meal.setMeal(new VegetarianMeal());
        meal.displayMeal();
    }
}