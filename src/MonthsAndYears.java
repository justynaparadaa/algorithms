/*
        Months and Years

        Everybody in Russia uses Gregorian calendar. In this calendar there are 31 days in
        January, 28 or 29 days in February (depending on whether the year is leap or not), 31 days in
        March, 30 days in April, 31 days in May, 30 in June, 31 in July, 31 in August, 30 in
        September, 31 in October, 30 in November, 31 in December.

        A year is leap in one of two cases: either its number is divisible by 4, but not divisible by 100, or
        is divisible by 400. For example, the following years are leap: 2000, 2004, but
        years 1900 and 2018 are not leap.
        In this problem you are given n (1 ≤ n ≤ 24) integers a1, a2, ..., an, and you have to check if these
        integers could be durations in days of n consecutive months, according to Gregorian calendar.
        Note that these months could belong to several consecutive years. In other words, check if there
        is a month in some year, such that its duration is a1 days, duration of the next month is a2 days,
        and so on.

        Input
        The first line contains single integer n (1 ≤ n ≤ 24) — the number of integers.
        The second line contains n integers a1, a2, ..., an (28 ≤ ai ≤ 31) — the numbers you are to check.

        Output
        If there are several consecutive months that fit the sequence, print "YES" (without quotes).
        Otherwise, print "NO" (without quotes).
        You can print each letter in arbitrary case (small or large).'

        You can print each letter in arbitrary case (small or large).

        Examples

        input
        Copy
        4
        31 31 30 31
        output
        Copy
        Yes
        input
        Copy
        2
        30 30
        output
        Copy
        No

        In the first example the integers can denote months July, August, September and October.
        In the second example the answer is no, because there are no two consecutive months each
        having 30 days.
        In the third example the months are: February (leap year) — March — April – May — June.
        In the fourth example the number of days in the second month is 28, so this is February. March
        follows February and has 31 days, but not 30, so the answer is NO.
        In the fifth example the months are: December — January — February (non-leap year).

*/

import java.util.Scanner;

public class MonthsAndYears {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfInteger = scanner.nextInt();
        scanner.nextLine();
        String monthDays = scanner.nextLine();

        String daysNumberFrScannerWithoutSpaces = monthDays.trim().replace(" ", "");

        String notLeapYearDays = "31 28 31 30 31 30 31 31 30 31 30 31";
        String leapYearDays = "31 29 31 30 31 30 31 31 30 31 30 31";

        StringBuilder daysForFourYearWithLeapYearBuilder = new StringBuilder();
        String daysForSixYearsWithLeapYearInTheMiddle = daysForFourYearWithLeapYearBuilder
                .append(notLeapYearDays)
                .append(notLeapYearDays)
                .append(leapYearDays)
                .append(notLeapYearDays)
                .append(notLeapYearDays)
                .append(notLeapYearDays)
                .toString()
                .replace(" ", "");

        if(daysForSixYearsWithLeapYearInTheMiddle.contains(daysNumberFrScannerWithoutSpaces)){
            System.out.println("YES");
        } else
            System.out.println("NO");

    }

}
