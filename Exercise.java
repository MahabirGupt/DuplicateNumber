import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Exercise {

    public static int[] removeDuplicates(int[] array) {
//        int n = array.length;
//        int[] uniqueArray = new int[n];
//        int index = 0;
//
//        for (int i = 0; i < n; i++) {
//            boolean isDuplicate = false;
//            for (int j = i + 1; j < n; j++) {
//                if (array[i] == array[j]) {
//                    isDuplicate = true;
//                    break;
//                }
//            }
//            if (!isDuplicate) {
//                uniqueArray[index++] = array[i];
//            }
//        }
        int[] result= Arrays.stream(array).distinct().toArray();
//        System.out.println(Arrays.toString(uniqueArray));
        System.out.println(Arrays.toString(result));

//        return Arrays.copyOf(result, index);
        return result;

    }

    public static int[] removeDuplicate(int[] input) {
        Set<Integer> uniqueValues = new HashSet<>();
        for (int number : input) {
            uniqueValues.add(number);
        }
        System.out.println(Arrays.toString(uniqueValues.stream().mapToInt(Integer::intValue).toArray()));
        return uniqueValues.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        int[] array =  new int[]{1, 1, 2, 2, 3, 4, 5};
        Exercise exercise = new Exercise( );
        exercise.removeDuplicates(array);
        exercise.removeDuplicate(array);



    }
}
