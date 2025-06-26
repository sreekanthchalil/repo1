package Assignment;

public class avgofThree {


    // Method to calculate average of three integers
    public static double average(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3.0;
    }

    // Method to calculate average of three floats
    public static float average(float num1, float num2, float num3) {
        return (num1 + num2 + num3) / 3;
    }

    public static void main(String[] args) {
        // Test with integers
        int int1 = 10, int2 = 20, int3 = 30;
        double avgInt = average(int1, int2, int3);
        System.out.println("Average of integers: " + avgInt);

        // Test with floats
        float float1 = 12.5f, float2 = 25.5f, float3 = 32.5f;
        float avgFloat = average(float1, float2, float3);
        System.out.println("Average of floats: " + avgFloat);
    }

}
