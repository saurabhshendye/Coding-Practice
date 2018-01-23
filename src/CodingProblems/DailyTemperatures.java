package CodingProblems;

/**
 * LeetCode Problem #739 Daily Temperatures
 */

public class DailyTemperatures {

    public int[] dailyTemperatures(int[] temps) {
        int [] result = new int[temps.length];
        for (int i=0; i< temps.length; i++){
            for(int j=i+1; j<temps.length; j++){
                if (temps[i] < temps[j]){
                    result[i] = j-i;
                    break;
                }
                result[i] = 0;
            }
        }
        return result;
    }
}
