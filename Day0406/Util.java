package Test5.Day0406;

public class Util {

  // 오름차순 정렬
  public static void selectionSortASC(Comparable values[]) {
    for (int i = 0; i < values.length; i++) {
      int minIndex = i;
      for (int j = i; j < values.length; j++) {
        // 현재까지 찾은 최소값 value[minIndex] 와
        // value[j]를 비교해 더 작다면
        // minIndex를 j로 설정 : minIndex = j
        if (values[minIndex].compareTo(values[j]) > 0) {
          minIndex = j;
        }
      }
      // minIndex의 값과 i의 값을 교환
      swap(i, minIndex, values);
    }
  }

  // 내림차순 정렬
  public static void selectionSortDESC(Comparable values[]) {
    for (int i = 0; i < values.length; i++) {
      int minIndex = i;
      for (int j = i; j < values.length; j++) {
        if (values[minIndex].compareTo(values[j]) < 0) {
          minIndex = j;
        }
      }

      swap(i, minIndex, values);
    }
  }

  private static void swap(int idx1, int idx2, Comparable values[]) {
    Comparable tmp = values[idx1];
    values[idx1] = values[idx2];
    values[idx2] = tmp;
  }
}
