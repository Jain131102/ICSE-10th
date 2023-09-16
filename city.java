// Define a class and store the given city names in a single dimensional array.
// Sort these names in alphabetical order using the Bubble Sort technique only.
// INPUT : Delhi, Bangalore, Agra, Mumbai, Calcutta
// OUTPUT : Agra, Bangalore, Calcutta, Delhi, Mumbai [15]

import java.io.*;

class city {
    public static void main(String args[]) {
        String[] name = { "Delhi", "Bangalore", "Agra", "Mumbai", "Calcutta" };
        int i, j;
        String temp;
        // bubble sort begins
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4 - i; j++) {
                if ((name[j].compareTo(name[j + 1])) > 0) {
                    temp = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = temp;
                }
            }
        }
        // printing
        for (i = 0; i < 5; i++) {
            System.out.println(name[i]);
        }
    }
}