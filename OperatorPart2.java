public class OperatorPart2 {
 
 public static void main(String[] args){
  // AND
  int num1 = 50;
  int num2 = 80;
  int num3 = 30;
  
  boolean isAnd = (num1 > num2) && (num1 > num3);
  boolean isOr = (num1 > num3) || (num1 > num3);
  boolean isNot = !((num1 > num2) || (num1 > num3));
  
  System.out.printf("===============================================================%n");
  System.out.printf("Is (%d > %d) && (%d > %d): %b%n",num1,num2,num1,num3,isAnd);
  System.out.printf("Is (%d > %d) || (%d > %d): %b%n",num1,num2,num1,num3,isOr);
  System.out.printf("Is !((%d > %d) && (%d > %d)): %b%n",num1,num2,num1,num3,isNot);
  System.out.printf("===============================================================%n");
  
  int X = 5;
  int Y = 2;
  
  //pre-increment
  System.out.printf("The value use is: %d%n",X++);
  System.out.printf("The value use is: %d%n",X);
  System.out.printf("The value afterwards is: %d%n",Y++);
  System.out.printf("The value afterwards is: %d%n",Y);
  System.out.printf("===============================================================%n");
  // pre-decrement 
  System.out.printf("The value use is: %d%n",X--);
  System.out.printf("The value use is: %d%n",X);
  System.out.printf("The value afterwards is: %d%n",Y--);
  System.out.printf("The value afterwards is: %d%n",Y);
  System.out.printf("===============================================================%n");
  
  // post-increment
  System.out.printf("The value use is: %d%n",++X);
  System.out.printf("The value use is: %d%n",X);
  System.out.printf("The value afterwards is: %d%n",++Y);
  System.out.printf("The value afterwards is: %d%n",Y);
  System.out.printf("===============================================================%n");
  // post-decrement 
  System.out.printf("The value use is: %d%n",--X);
  System.out.printf("The value use is: %d%n",X);
  System.out.printf("The value afterwards is: %d%n",--Y);
  System.out.printf("The value afterwards is: %d%n",Y);
  System.out.printf("===============================================================%n");
  
 }
}