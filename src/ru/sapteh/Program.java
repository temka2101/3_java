package ru.sapteh;


public class Program {
    public static void main(String[] args) {
        String[] arr ={"hello","World"};
        System.out.println(strSort(arr));
        String str = "radar";
        System.out.println(isPalindrome(str));
    }

    public static String strSort(String[] arr) {
        int maxLengthString = 0;
        String s="";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > maxLengthString) {
                maxLengthString = arr[i].length();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() == maxLengthString) {
                s = arr[i];
            }
        }
        return s;
    }

    public static String reverseString(String s) {
        String r = "";
        for (int i = s.length() - 1; i >= 0; --i){
            r += s.charAt(i);
        }
        return r;
    }

    public static Boolean isPalindrome(String s) {
        if (s.equals(reverseString(s))) {
            System.out.println("Полиндром");
        } else {
            System.out.println("Не полиндром");
        }
        return s.equals(reverseString(s));
    }
}