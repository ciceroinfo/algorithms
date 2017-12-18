import java.util.Arrays;

public class BubbleSort {

  public static void main(String[] list) {

    int i,j;
    String temp;

    for(i = 0; i < list.length; i++) {

      // System.out.println("i::" + i);

      for(j = 0; j < list.length - 1 - i; j++) {

        // System.out.println("j::" + j);
        // System.out.println("list.length - 1 - i::" + (list.length - 1 - i));

        //do swap
        if(Integer.parseInt(list[j]) > Integer.parseInt(list[j+1])) {
          temp = list[j];
          list[j] = list[j+1];
          list[j+1] = temp;
        }
      }
    }

    System.out.println("Result::".concat(Arrays.toString(list)));
  }
}
