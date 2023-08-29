package codingbats;

public class StringYak {
  public static void main(String[] args) {
    StringYak sy = new StringYak();
    boolean result = sy.has271(new int[]{1, 2, 7, 1});
    System.out.println(result);
  }
  public boolean has271(int[] nums) {
    String diff = "";
    for (int i = 0; i < nums.length-1; i++) {
      diff += (nums[i] - nums[i+1]);
    }
    System.out.println(diff);
    return diff.matches("-56");
  }
}
