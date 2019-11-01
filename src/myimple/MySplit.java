package myimple;

import java.util.Arrays;

public class MySplit {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mySplit("", 'i')));

    }

    public static String[] mySplit(String s, char c) {
        int size = 0;
        if (s == null && s.isEmpty()) {
            return null;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                size++;
            } else {
                size = size;
            }

        }
        String[] arr = new String[size + 1];
        if (size == 0) {
            return arr;
        } else {
            String temp = "";
            int j = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != c) {
                    temp = temp + s.charAt(i);
                } else {

                    arr[j] = temp;
                    j++;
                    temp = "";
                }
            }
            if (temp != null) {
                arr[j] = temp;
            }

            return arr;
        }

    }
}
