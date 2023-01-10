import java.io.*;
import java.util.*;
import java.util.stream.*;

public class TestListQueries {
	/*
	 * For this problem, we have types of queries you can perform on a List:
	 * 
	 * Insert at index :
	 * 
	 * Insert x y 
	 * 
	 * Delete the element at index :
	 * 
	 * Delete x Given a list, , of integers, perform queries on the list. Once all
	 * queries are completed, print the modified list as a single line of
	 * space-separated integers.
	 * 
	 * Input Format
	 * 
	 * The first line contains an integer, (the initial number of elements in ). The
	 * second line contains space-separated integers describing . The third line
	 * contains an integer, (the number of queries). The subsequent lines describe
	 * the queries, and each query is described over two lines:
	 * 
	 * If the first line of a query contains the String Insert, then the second line
	 * contains two space separated integers , and the value must be inserted into
	 * at index . If the first line of a query contains the String Delete, then the
	 * second line contains index , whose element must be deleted from .
	 */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        
        List<Integer> L = new ArrayList<Integer>(N);
        
        for (int i = 0; i < N; i++)
        {
            L.add(scanner.nextInt());
        }
        
        
        int Q = scanner.nextInt();
        
        for (int i = 0; i < Q; i++)
        {
            String operation = scanner.next();
            
            if (operation.equals("Insert"))
            {
                int index = scanner.nextInt();
                int value = scanner.nextInt();
                L.add(index, value);
            }
            
            else if (operation.equals("Delete"))
            {
                int index = scanner.nextInt();
                L.remove(index);
            }
        }
        
        for (int element: L)
            
        {
            System.out.print(element + " ");
        }
        
        
    }
}