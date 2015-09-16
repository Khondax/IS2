/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Holamundo;

import java.util.Calendar;
//import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Khondax
 */
public class Person {
    
    private final String name;
    private final String surname;
    private final Calendar birthday;
    private static final long MILLIESCOND_PER_YEAR = (long) (1000*60*60*24*365.25);

    public Person(String name, String surname, Calendar birthday) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Calendar getBirthday() {
        return birthday;
    }
    
    public String getFullName(){
        return name + " " + surname;
    }
    
    public int getAge (){
        Calendar today = GregorianCalendar.getInstance();
        return (int) getMillis((today.getTimeInMillis()-birthday.getTimeInMillis()));
    }
    
    private long getMillis (long milli){
        return milli/MILLIESCOND_PER_YEAR;
    }
    
}
