package com.stackroute;

public class Printmultiple {
    public String stackRoute(String s,int n) {
        String s1 = new String("");
        int len = s.length();
        int count = n;
        for (int i = len-1; i > n+1; i--) {
            s1 = s1 + s.charAt(i);
        }
        for (int i = 0; i < count; i++) {
            s = s + s1;
        }
        return s;
    }
}
