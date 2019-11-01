public class AC {
    public static void main(String[] args) {
      count('a',"Alaanis");

    }

    public static int count(char c, String s) {
        int total = 0;
        for (int numb = 0; numb < s.length(); numb++) {
            if (s.charAt(numb) == c) {
                total = total + 1;
            }
        }
        System.out.println(total);
        return total;

    }
}

