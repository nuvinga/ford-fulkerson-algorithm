/**
 *
 * Student Name: Nuvin Godakanda Arachchi
 * IIT ID: 2019443
 * UOW ID: W1761350
 *
 * Algorithms theory, design and implementation (5SENG001W)- Coursework
 *
 **/

public class Main {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Passer passer = new Passer("inputNew.txt"); // TODO: Enter file name HERE
        Algorithm algo = new Algorithm(); // creates an instance of the ff and bfs

        System.out.println("\n\nMaximum possible flow:  " + algo.fordFulkerson(passer, 0, passer.getNumNodes()-1));
        long finish = System.currentTimeMillis();
        long taken = finish - start; //  calculates the time taken for performance analysis
        System.out.println("\nTime elapsed: " + taken + " milliseconds.");
    }
}
