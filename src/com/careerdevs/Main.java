package com.careerdevs;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //ALG1
        System.out.println(getFirstValue(new int[] {1,2,3}));
        //ALG2
        System.out.println(addition(3));
        //ALG3
        System.out.println(search(new int[] {1,2,3}, 2 ));
        //ALG4
        System.out.println(convert(2));
        //ALG5
        System.out.println(giveMeSomething("something"));
    }

    //ALG1
    public static int getFirstValue(int[] arr) {
        return arr[0];
    }

    //ALG2
    public static int addition(int num) {
        return num + 1;
    }

    //ALG3
    public static int search(int arr[], int item) {
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i]==item)
                return i;
        }
        return -1;
    }

    //ALG4
    public static int convert(int minutes) {
        return minutes * 60;
    }

    //ALG5
    public static String giveMeSomething(String a) {
        return "something " + a;
    }






}
