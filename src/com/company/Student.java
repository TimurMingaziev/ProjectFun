package com.company;

import sun.util.calendar.BaseCalendar;

import java.time.DateTimeException;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Home on 05.06.2016.
 */
public class Student extends ArrayList {
    Integer name=0;
    String fio ="";
    double life=0;

    public Student(){
        System.out.println("student created");
    }
    public Student( int name, String fio, double life){
        this.name = name;
        this.fio = fio;
        this.life = life;

             System.out.println(name);
    }
}
