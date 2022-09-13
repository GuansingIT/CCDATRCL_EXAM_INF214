//////////////////////////////ARRAY///////////////////////////

public class App {
 public static void main(String[] args) {
   
   String[] sn = {"G","U","A","N","S","I","N","G"};
   
   // 1. Create an array of characters of your SURNAME.
            System.out.println("Student's Surname is " + sn);
   
   // 2. Display each character of your SURNAME on each line.
            for (int i = 0; i < sn.length; i++) {
            System.out.println(sn[i]);
    }
   
   // 3. Display the first character of your SURNAME.
            System.out.println("First character of the surname is " + sn[0]);
   
   // 4. Display the last character of your SURNAME.
            System.out.println("Last character of the surname is " + sn[7]);
   
  // 5. Display the character of your SURNAME in reverse order.
            for (int i = sn.length - 1; i >= 0; i--) {
            System.out.println(sn[i]);
    }
 }
}


//////////////////////////////LINKEDLIST///////////////////////////
import java.util.LinkedList;

public class App {
 public static void main(String[] args) {
 
    // 1. Create a Linked list of the last six numbers of your STUDENT NUMBER.
        LinkedList IdNum = new LinkedList();
        IdNum.add(1);
        IdNum.add(0);
        IdNum.add(3);
        IdNum.add(3);
        IdNum.add(7);
        IdNum.add(0);
        System.out.println(IdNum);

    // 2. Add an asterisk (*) to the head/front of the Linked list.
        IdNum.addFirst("*");
        
    // 3. Add an asterisk (*) to the tail/end of the Linked list.
        IdNum.addLast("*");
        
    // 4. Display the Linked list.
        System.out.println("Updated LinkedList: " + IdNum);
        
    // 5. Display the last character of the Linked list
        System.out.println("The last digit of the LinkedList " + IdNum.get(6));
        
    // 6. Replace the last character of the Linked list with the exclamation symbol (!).
        IdNum.set(6, "!");
        
    // 7. Remove the first character of the Linked list.
        IdNum.remove(0);
        
    // 8. Display the LinkedList.
        System.out.println("Updated LinkedList: " + IdNum);

    }
}


//////////////////////////////STACK///////////////////////////

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<String> srn = new Stack<>();
        
// 1. Create a Stack of characters of your SURNAME.
        srn.push("G");
        srn.push("U");
        srn.push("A");
        srn.push("N");
        srn.push("S");
        srn.push("I");
        srn.push("N");
        srn.push("G");
        srn.push(" ");

// 2. Print the Stack
        System.out.println(srn);

// 3. Add a "INF214" to the stack.
        srn.push("I");
        srn.push("N");
        srn.push("F");
        srn.push("2");
        srn.push("1");
        srn.push("4");
        
// 2. Print the Stack
        System.out.println("Updated stack:" + srn);
        
// 5. Remove "INF214".
        srn.pop();
        srn.pop();
        srn.pop();
        srn.pop();
        srn.pop();
        srn.pop();
        
// 6. Add "CCDATRCL-INF214".
        srn.push("C");
        srn.push("C");
        srn.push("D");
        srn.push("A");
        srn.push("T");
        srn.push("R");
        srn.push("C");
        srn.push("L");
        srn.push("-");
        srn.push("I");
        srn.push("N");
        srn.push("F");
        srn.push("2");
        srn.push("1");
        srn.push("4");
        System.out.println("Updated Stack: " + srn);

    }
}
