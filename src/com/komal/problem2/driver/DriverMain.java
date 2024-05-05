package com.komal.problem2.driver;

import com.komal.problem2.service.MergeSort;
import com.komal.problem2.service.NotesCount;

import java.util.Scanner;

public class DriverMain {
    public static void main(String[] args) {

        MergeSort mergeSort = new MergeSort();
        NotesCount notesCount = new NotesCount();

        System.out.println("Enter the size of currency denominations ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] notes = new int[size];
        System.out.println("Enter the currency denominations value");
        for (int i = 0; i < size; i++) {
            notes[i] = sc.nextInt();
        }
        System.out.println("Enter the amount you want to pay");
        int amount = sc.nextInt();
        mergeSort.sort(notes,0,notes.length-1);
        notesCount.getNotesCount(notes, amount);
    }

}
