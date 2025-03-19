public class RomanToInt {
   public static void main(String[]args){
    String s="X";
    System.out.print(romanToInt(s));
   }
    public static int romanToInt(String s) {
        //  char arr[]=s.toCharArray();
        int total=0;
        int prevVal=0;
          for(int i=s.length()-1;i>=0;i--){
              int curVal=getValue(s.charAt(i));
              if(curVal<prevVal)
              total-=curVal;
              else
              total+=curVal;
              prevVal=curVal;
          }
          return total;
          }
   public static int getValue(char ch) {
          switch (ch) {
              case 'I': return 1;
              case 'V': return 5;
              case 'X': return 10;
              case 'L': return 50;
              case 'C': return 100;
              case 'D': return 500;
              case 'M': return 1000;
              default: return 0; // This case should never occur for valid input
          }
        
            }
          
  }

