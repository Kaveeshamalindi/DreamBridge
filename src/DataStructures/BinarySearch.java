/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures;
import User.Student;

/**
 *
 * @author icbt1
 */
public class BinarySearch {

    public static Student search(Student[] arr, String searchId) {

        int min = 0;
        int max = arr.length - 1;

        while (min <= max) {

            int mid = (min + max) / 2;

            int compare = arr[mid].getStudentId().compareTo(searchId);

            if (compare == 0) {
                return arr[mid];
            } else if (compare < 0) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }

        return null;
    }
}