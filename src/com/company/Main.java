package com.company;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        int i = 0;
        ArrayList<Student> list = new ArrayList();

        while (true) {
            Thread.sleep(100);
        //    System.out.println(list.size());



            if (i % 1000 == 0) {
                if(i%1000000==0)
                     list.clear();
                else {
                    int endsize = list.size() * 90 / 100;
                    for (int y = 0; y < endsize; y++)
                        list.remove(list.size() - 1);
                }

            } else {
                //Student st = new Student();
                list.add(new Student(i, Math.random()+"fffffffffffff",Math.random()));
               // System.out.println(list.get(list.size() - 1));
            }
            i++;
        }


    }
}
