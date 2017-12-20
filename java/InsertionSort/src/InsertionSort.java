import java.util.Arrays;

public class InsertionSort {

  public static void main(String[] list) {

    int position;
    String insertValue;

    System.out.println("Input::".concat(Arrays.toString(list)));

    for(int i = 1; i < list.length; i++) {

      position = i;
      insertValue = list[i];

      System.out.println("iteration::" + i);
      System.out.println("insertValue::" + insertValue);

      while(position > 0 && Integer.parseInt(list[position -1]) > Integer.parseInt(insertValue)) {

        System.out.println("swap::[" + list[position -1] + " --> " + list[position] + "]");

        list[position] = list[position -1];

        position--;
      }

      System.out.println("swap::[" + list[position] + " <-- " + insertValue + "]");
      list[position] = insertValue;

      System.out.println("Partial::".concat(Arrays.toString(list)));
    }

    System.out.println("Output::".concat(Arrays.toString(list)));
  }
}
