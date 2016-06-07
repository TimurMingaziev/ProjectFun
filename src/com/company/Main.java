package com.company;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.function.DoubleToIntFunction;


public class Main {
    private static final Logger LOG = LoggerFactory.getLogger("logfile");

    public static void main(String[] args) throws InterruptedException {
        long i = 0;
        long maxIt = 0;
        long midle=0;
        long estimatedTime=0;


        ArrayList<Integer> list = new ArrayList();
        ArrayList<Boolean> listBool = new ArrayList();
        ArrayList<BigInteger> listBig = new ArrayList();
        ArrayList<String> listStr = new ArrayList();
        ArrayList<Student> listStud = new ArrayList();


        while (true) {
          Thread.sleep(100);
            long startTime = System.nanoTime();
            System.out.println(list.size());

            if (i % 1000 == 0) {
                if(i%100000==0)
                     list.clear();
                else {
                    int endsize = list.size() * 90 / 100;
                    for (int y = 0; y < endsize; y++)
                        list.remove(list.size() - 1);
                }

            } else {

                list.add(new Integer((int)Math.random()*1000));
                listBool.add(new Boolean(true));
                listBig.add(new BigInteger("weffffffffffffffsdfsf" + Math.random()));
                listStr.add(new String("lol" + Math.random()));
                listStud.add(new Student("name" + Math.random(),"life" + Math.random()));

            }
            i++;
            estimatedTime = System.nanoTime() - startTime;
            midle += estimatedTime;
            LOG.info("Time of  " + i +" iteration = " +estimatedTime);

            if(maxIt<estimatedTime)
            {
                maxIt=estimatedTime;
                LOG.info("MAAAAAAAAAAAAAAAAAAAAX  " + i +" iteration = " +maxIt);
            }

            LOG.info("Midle  on " + i +" iteration = " + midle/i);

        }


    }
}
