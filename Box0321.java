package Test2;

public class Box0321 {

  int width;
  int length;
  int height;

  Box0321(int w, int l, int h) {
    width = w;
    length = l;
    height = h;
  }
  
  boolean isSameBox(Box0321 argObj) {
    if( (argObj.width == width )
    && (argObj.length == length) 
    && (argObj.height == height)) {
    return true;
    }
    return false;
  }

}
