/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

import User.Student;

/**
 *
 * @author USER
 */
public class QuickSortStudents {

    public static void quickSort(Student[] arr, int low, int high) {
        if (low < high) {

            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(Student[] arr, int low, int high) {

        Student pivot = arr[high];
        String pivotKey = pivot.getStudentId();

        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j].getStudentId().compareTo(pivotKey) < 0) {
                i++;

                Student temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        Student temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
    
    public static void quickSortByName(Student[] arr, int low, int high) {

        if (low < high) {

            int pi = partitionByName(arr, low, high);

            quickSortByName(arr, low, pi - 1);
            quickSortByName(arr, pi + 1, high);
        }
    }

    private static int partitionByName(Student[] arr, int low, int high) {

        Student pivot = arr[high];
        String pivotKey = pivot.getName().toLowerCase();

        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j].getName().toLowerCase()
                    .compareTo(pivotKey) < 0) {

                i++;

                Student temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        Student temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
