import java.util.Arrays;

public class SelectionSort {

  public static void main(String[] list) {

    int minValue;

    System.out.println("Input::".concat(Arrays.toString(list)));

    for(int i = 0; i < list.length; i++) {

      minValue = i;

      System.out.println("iteration::" + i);

      for (int j = i; j < list.length; j++) {
        if( Integer.parseInt(list[minValue]) > Integer.parseInt(list[j])) {
          minValue = j;
        }
      }

      swap(list, i, minValue);

      System.out.println("Partial::".concat(Arrays.toString(list)));
    }

    System.out.println("Output:::".concat(Arrays.toString(list)));
  }

  //do swap
  private static void swap(String[] list, int from, int to) {
    System.out.println("swap::[" + list[from] + " <--> " + list[to] + "] position::["+ from + " <--> " + to + "]");
    String temp = list[to];
    list[to] = list[from];
    list[from] = temp;
  }
}
