import java.util.*;

public class arrayCheck {
  public static void main(String[] args){
  int[] arr={12,9,4,11,7};
  Arrays.sort(arr, 0, arr.length);
  String text= Arrays.toString(arr);
  System.out.println(text);
}
}
