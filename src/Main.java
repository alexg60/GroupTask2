import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Banana");
        items.add("Cherry");
        items.add("Date");
        items.add("Banana");
        items.add("Apple");
        Stack stack = new Stack<>();

        //Array with no Duplicates
        ArrayList<String> noDuplicates = new ArrayList<>();
        noDuplicates = removeDups(items);

        //Operations to Reverse the array with no duplicates
        ArrayList<String> reverseList = new ArrayList<>();
        for(String fruit : noDuplicates)
            stack.push(fruit);
        while(!stack.isEmpty()){
            reverseList.add((String) stack.pop());
        }

        //Output statements with expected outcomes
        System.out.println("Original List: " + items);
        System.out.println("List after Removing Duplicates: " + noDuplicates);
        System.out.println("Reversed List: " + reverseList);


    }

    public static ArrayList<String> removeDups(ArrayList<String> list){
        ArrayList<String> noDups = new ArrayList<>();
        for(String fruit : list){
            if(!noDups.contains(fruit)){
                noDups.add(fruit);
            }
        }
        return noDups;
    }

}