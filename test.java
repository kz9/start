public class test {
   public static void main(String[] args) {
      char star = '*';
      char exclam = '!';
      lineOf(3, '!');
   }
   //output the swallow and catch part(spider & fly & bird & cat & dog & snake) with an ending and then output the last paragraph
   public static void lineOf(int n, char c) {
      for (int i = 0; i < n; i++) {
         System.out.print(c);
      }
   }
}