import java.util.Scanner;

public class boj1076_Register {

  public enum Register{

      BLACK("black", 0, 1),
      BROWN("brown", 1, 10),
      RED("red", 2, 100),
      ORANGE("orange", 3, 1000),
      YELLOW("yellow", 4, 10000),
      GREEN("green", 5, 100000),
      BLUE("blue", 6, 1000000),
      VIOLET("violet", 7, 10000000),
      GREY("grey", 8, 100000000),
      WHITE("white", 9, 1000000000);

      private String color;
      private int value;
      private int mul;

      Register(String color, int value, int mul){
          this.color = color;
          this.value = value;
          this.mul = mul;
      }

      public static Register colorOf(String color){
          for(Register tmp : Register.values()){
              if(color.equals(tmp.color)) return tmp;
          }
          return null;
      }

      public String getColor() {
          return color;
      }

      public int getValue() {
          return value;
      }

      public int getMul() {
          return mul;
      }
  }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Long reg = 10L * Register.colorOf(str).value;

        str = sc.nextLine();
        reg +=  Register.colorOf(str).value;

        str = sc.nextLine();
        reg *= Register.colorOf(str).mul;

        System.out.println(reg);
    }
}
