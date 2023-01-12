package com.test.java8;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public static SinglyLinkedListNode removeNodes(SinglyLinkedListNode listHead, int x) {
    // Write your code here
    SinglyLinkedListNode temp=listHead,prev=null;
    while(temp !=null && temp.data>x){
        temp=temp.next;
        listHead=temp;
    }
    temp=listHead;
    prev=temp;
    while(temp !=null){
        while(temp !=null && temp.data<=x){
            prev=temp;
            temp=temp.next;
        }
        if(temp==null){
            return listHead;
        }
        prev.next=temp.next;
        temp=prev.next;
    }
    return listHead;
    }

}

/*public class SinglyLinkedList {
    public static <SinglyLinkedListNode> void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        SinglyLinkedList listHead = new SinglyLinkedList();

        int listHeadCount = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, listHeadCount).forEach(i -> {
            try {
                int listHeadItem = Integer.parseInt(bufferedReader.readLine().trim());

                listHead.insertNode(listHeadItem);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int x = Integer.parseInt(bufferedReader.readLine().trim());

        SinglyLinkedListNode result = Result.removeNodes(listHead.head, x);

        SinglyLinkedListPrintHelper.printList(result, "\n", bufferedWriter);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}*/