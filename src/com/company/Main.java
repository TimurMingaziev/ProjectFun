package com.company;

import java.util.ArrayList;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Main {

    public static void main(String[] args) throws InterruptedException {
        int i = 0;
        Logger log = LogManager.getLogger(Main.class);

        log.log(Level.INFO, "looool");
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
