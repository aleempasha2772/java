package com.example.java.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class local {
    public static void main(String[] args) {
        System.out.println("Local date : "+ LocalDate.now());
        System.out.println("Local time : "+ LocalTime.now());
        System.out.println("Local date and time : "+ LocalDateTime.now());
    }
}
