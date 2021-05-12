package demo;

import java.util.Scanner;

public class task2 {
	public static void main(String[] args) {
		int minutesinayear=60*24*365;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number of minutes: ");
		int min= sc.nextInt();
		int years = (int) (min / minutesinayear);
        int days = (int) (min / 60 / 24) % 365;
        System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");
    }
}