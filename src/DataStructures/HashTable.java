/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

/**
 *
 * @author USER
 */
public class HashTable {

    private DataItem[] hashArray;
    private int arraySize;
    private DataItem nonItem;

    public HashTable(int size) {
        arraySize = size;
        hashArray = new DataItem[arraySize];
        nonItem = new DataItem("DELETED", null);
    }

    public void displayTable() {
        System.out.print("Table: ");
        for (int j = 0; j < arraySize; j++) {
            if (hashArray[j] != null) {
                System.out.print(hashArray[j].getKey() + " ");
            } else {
                System.out.print("** ");
            }
        }
        System.out.println();
    }

    public int hashFunc(String key) {
        int hash = 0;

        for (int i = 0; i < key.length(); i++) {
            hash = (hash * 31 + key.charAt(i)) % arraySize;
        }

        return hash;
    }

    public void insert(DataItem item) {
        String key = item.getKey();
        int hashVal = hashFunc(key);
        
        int count = 0;

        while (hashArray[hashVal] != null &&
               !hashArray[hashVal].getKey().equals("DELETED")) {

            hashVal++;
            hashVal %= arraySize;
            
            count++;
            
            if (count == arraySize) {
                System.out.println("Warning: Hash Table is full. Cannot insert new record.");
            return;
        }
        }

        hashArray[hashVal] = item;
    }

    public DataItem delete(String key) {
        int hashVal = hashFunc(key);

        while (hashArray[hashVal] != null) {

            if (hashArray[hashVal].getKey().equals(key)) {
                DataItem temp = hashArray[hashVal];
                hashArray[hashVal] = nonItem;
                return temp;
            }

            hashVal++;
            hashVal %= arraySize;
        }

        return null;
    }

    public DataItem find(String key) {
        int hashVal = hashFunc(key);

        while (hashArray[hashVal] != null) {

            if (hashArray[hashVal].getKey().equals(key)) {
                return hashArray[hashVal];
            }

            hashVal++;
            hashVal %= arraySize;
        }

        return null;
    }

    public DataItem[] getAllItems() {
        return hashArray;
    }
}