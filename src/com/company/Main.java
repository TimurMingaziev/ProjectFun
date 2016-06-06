package com.company;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Timer;


public class Main {
    private static final Logger LOG = LoggerFactory.getLogger("logfile");

    public static void main(String[] args) throws InterruptedException {
        int i = 0;
        Timer time = new Timer();

        LOG.info("looool");
        ArrayList<Student> list = new ArrayList();

        while (true) {
          Thread.sleep(1000);
            System.out.println(list.size());



            if (i % 10000 == 0) {
                if(i%5000000==0)
                     list.clear();
                else {
                    int endsize = list.size() * 90 / 100;
//                    for (int y = 0; y < endsize; y++)
//                        list.remove(list.size() - 1);
                }

            } else {

                list.add(new Student(i, Math.random()+"fffffffffffff",Math.random()));

            }
            i++;
        }


    }
}
