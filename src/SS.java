public class SS {
    public static void main(String[] args) {
        rep('k', 'b', null);
    }
        public static String rep ( char c, char b, String s){
            StringBuilder str = new StringBuilder(s);
            for (int numb = 0; numb < str.length(); numb++) {
                if (str.charAt(numb) == c) {
                    str.setCharAt(numb, b);
                }
            }
            System.out.println("the new string is " + str);
            return str.toString();
        }
}

