package ba.unsa.etf.rpr.t2.z3;

import java.util.List;

/**
 * Util class
 *
 * @author Eman Alibalić
 */
public class MathUtils {

    /**
     * get minimal element from list
     */
    public static Double min(List<Double> numbers){
        double min = Double.MAX_VALUE;
        for(Double num : numbers){
            if (num < min){
                min = num;
            }
        }
        return min;
    }

    /**
     * get maximal element from the list
     */
    public static Double max(List<Double> numbers){
        double max = Double.MIN_VALUE;
        for(Double num : numbers){
            if (num > max){
                max = num.floatValue();
            }
        }
        return max;
    }

    /**
     * Calculate mean value of elements in the list
     */
    public static Double mean(List<Double> numbers){
        double sum = 0;
        for(Double num : numbers){
            sum += num;
        }
        return sum/numbers.size();
    }

    /**
     * calculate standard deviation using this formula: sqrt((∑(Xi - ų)^2) / N)
     */
    public static Double standardDeviation(List<Double> numbers){
        Double mean = MathUtils.mean(numbers);
        float standardDeviation = 0;
        for(Double num: numbers) {
            standardDeviation += Math.pow(num - mean, 2);
        }
        return Math.sqrt(standardDeviation/numbers.size());
    }
}