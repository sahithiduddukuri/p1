package com.stackroute;

public class Sorting {
    public int order(int n)
    {
        int temp=n;
        int r, sum = 0;
        int[] a = new int[10];
        while (n != 0) {
            int val = n % 10;
            a[val]++;
            n /= 10;
        }
        int n1 = 0;
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < a[i]; j++) {
                n1 = n1 * 10 + i;
            }
        }
        System.out.println("sorted number in non-increasing order:" + n1);
        while (temp > 0) {
            r = temp % 10;
            if (r % 2 == 0) {
                sum = sum + r;
            }
            temp = temp / 10;
        }
        System.out.println("Sum of even numbers :" + sum);
        if (sum > 15) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        return n1;
    }
}
