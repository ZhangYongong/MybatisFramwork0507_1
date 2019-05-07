package com.zhang.servlet;

/**
 * @author Yonghong Zhang
 * @date 2019/4/24 - 20:39
 */
public class demo {
    public static void main(String[] args) {
        System.out.println(" ");
        System.err.println(" ");

        String[] arr = new String[]{"laobai","xiaobai","xiaobaitu"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (String s : arr) {
            System.out.println(s);
        }
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
    }
}
