package com.codegym;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

import java.util.Arrays;

import java.util.Random;


public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;

    public void setStartTime() {
        this.startTime = LocalTime.now();
    }

    public void start() {
        this.startTime = LocalTime.now();
    }

    public void end() {
        this.endTime = LocalTime.now();
    }

    public long getElapsedTime() {
        return ChronoUnit.MILLIS.between(this.startTime, this.endTime);
    }


    public static double[] selectionSort(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    double temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Random random = new Random();
        double[] arr = random.doubles(200).toArray();
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println(Arrays.toString(selectionSort(arr)));
        stopWatch.end();
        System.out.println("Time: " + stopWatch.getElapsedTime());
    }
}


