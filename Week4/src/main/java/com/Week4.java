package com;

public class Week4 {
    public static int max2Int(int a, int b) {
	// Tim gia tri lon nhat cua hai so nguyen
        return Math.max(a,b);
    }

    public static int minArray (int[] array) {
	// Tim gia tri nho nhat cua 1 mang so nguyen
        if (array.length == 0) return 0;
        else if (array.length == 1) return array[0];
        int min_a = array[0];
        for (int i = 0; i < array.length; ++i) {
            if (array[i] < min_a) {
                min_a = array[i];
            }
        }
        return min_a;
    }

    public static String calculateBMI(double weight, double height){
	// Tinh BMI
        double bmi = (double) Math.round( (weight / (height * height)) * 10 ) / 10;
        if (bmi < 18.5) return "Thiếu cân";
        else if (bmi <= 22.9) return "Bình thường";
        else if (bmi <= 24.9) return "Thừa cân";
        else return "Béo phì";
    }
}
 