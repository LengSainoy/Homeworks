package codingbats;

public class AltPairs {
  public String altPairs(String str) {
    int strLength = str.length();
    if (strLength < 2) return str;
    StringBuilder result = new StringBuilder();
    for (int i = 0, j = 1; i < strLength || j < strLength; i+=4, j+=4) {
      String char2 = j >= strLength ? "" : str.charAt(j) + "";
      result.append(str.charAt(i)).append(char2);
    }
    return result.toString();
  }
}
