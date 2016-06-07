package com.company;

import sun.util.calendar.BaseCalendar;

import java.time.DateTimeException;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Home on 05.06.2016.
 */
public class Student extends ArrayList {

    String fio ="";
    String life= "";

    public Student(){
        System.out.println("student created");
    }
    public Student( String fio, String life){

        this.fio = fio;
        this.life = life;


    }
}
