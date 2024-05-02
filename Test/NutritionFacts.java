public class NutritionFacts{
    private String brand;
    private float protein;
    private float fat;
    private float carbs;
    
    public boolean muscleBuilding(){
        if (this.protein >= 10 && this.carbs <= 20){
            return true;
        }
        return false;
    }

    public static boolean equals(NutritionFacts a, NutritionFacts b){
        if (a.protein == b.protein && a.fat == b.fat && a.carbs == b.carbs){
            return true;
        }
        return false;
    }
}


