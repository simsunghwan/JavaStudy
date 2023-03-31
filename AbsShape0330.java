package Test4;

public abstract class AbsShape0330 {

  private int x;
  private int y;

  // AbsShape0330를 상속받는 자식 클래스는 move 메서드를 그대로 사용하면 됨
  public void move(int argX, int argY) {
    this.x = argX;
    this.y = argY;
    System.out.println("도형을 [" + x + ", " + y + "]로 옮겼습니다.");
  }

  // AbsShape0330를 상속받는 자식 클래스는 화면에 그리는 기능을 가져야하지만
  // 그려지는 모양은 다 다르다
  // 따라서, AbsShape0330 클래스는 그리는 기능을 수행하는 메소드의 시그니처(head)만 선언
  // 메소드 몸체(body)의 구현은 자식 클래스에 강제

  public abstract void draw();
}
