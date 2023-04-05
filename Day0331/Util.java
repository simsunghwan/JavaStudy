package Test4.Day0331;

public class Util {

  public static void selectionSort(int values[]) {
    for (int i = 0; i < values.length; i++) {
      int minIndex = i;
      for (int j = i; j < values.length; j++) {
        // 현재까지 찾은 최소값 value[minIndex] 와
        // value[j]를 비교해 더 작다면
        // minIndex를 j로 설정 : minIndex = j
        if (values[minIndex] > values[j]) {
          minIndex = j;
        }
      }
      // minIndex의 값과 i의 값을 교환
      swap(i, minIndex, values);
    }
  }

  private static void swap(int idx1, int idx2, int values[]) {
    int tmp = values[idx1];
    values[idx1] = values[idx2];
    values[idx2] = tmp;
  }
}
