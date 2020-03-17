import java.util.*;

class SortArray912 {

  public static void main(String[] args) {
    int arrSize = readInt("Enter a size for the array nums: ");
    int[] nums = new int[arrSize];
    // int [] nums = {5, 2, 3, 1};

    for (int i = 0; i < arrSize; i++) {
      nums[i] = readInt("Enter an integer for the nums [" + i + "]: ");
    }

    List<Integer> sortedList = sortArray(nums);
    // Print the List
    System.out.println("Sorted List: " + sortedList);
  }

  public static List<Integer> sortArray(int[] nums) {
    int minIndex = 0;
    int minVal = 0;
    int size = nums.length;

    for (int i = 0; i < size - 1; i++) {
      minIndex = i;
      minVal = nums[i];
      for (int j = i + 1; j < size; j++) {
        // System.out.println("nums[j]: " + nums[j] + " < nums[i]" + nums[i]);
        if (nums[j] < minVal) {
          minIndex = j;
          minVal = nums[j];
        }
      }
      nums[minIndex] = nums[i];
      nums[i] = minVal;
    }
    List<Integer> sorted = new ArrayList<Integer>();
    // Iterate through the array
    for (int n : nums) {
      // Add into the list
      sorted.add(n);
    }
    return sorted;
  }

  public static int readInt(String prompt) {
    int input = 0;
    try {
      input = Integer.parseInt(readString(prompt));
    } catch (Exception e) {
      System.out.println("Please enter an integer");
    }
    return input;
  }

  public static String readString(String prompt) {
    System.out.print(prompt);
    return new Scanner(System.in).nextLine();
  }

}
