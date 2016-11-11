package hello;

import org.joda.time.LocalTime;

public class HelloWorld {
    public static void main (String [] args){
        LocalTime now = new LocalTime();
        System.out.println("Now the local time is " + now);
        System.out.println("Hello World!!");
    }
}