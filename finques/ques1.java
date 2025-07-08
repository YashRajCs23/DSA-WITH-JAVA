import java.util.*;
public class ques1 {
    public static class students{
        String name;
        int age;
        
        students(String name,int age){
            this.name=name;
            this.age=age;
        }
        public void print(){
            System.out.println(name);
    }
    
    }
    public static void main(String[] args) {
        ArrayList <Integer> l1=new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(5);
        l1.add(1);
        l1.add(3);
        // for (int i = 0; i < l1.size(); i++) {
        //     System.out.println(l1.get(i)); 
        // }
        System.out.println(l1);
        l1.remove(2);
        System.out.println(l1.contains(Integer.valueOf(1)));
        System.out.println(l1);
        //max
        int max=Collections.max(l1);
        System.out.println(max);

        //unique elemts
        LinkedHashSet<Integer> uniqueElements = new LinkedHashSet<>(l1);
        l1 = new ArrayList<>(uniqueElements);

        System.out.println("List after removing duplicates: " + l1);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(456);
        list2.add(9876);
        list2.add(546576);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(4);

        // Merge list2 into list1
        // l1.addAll(list2);
        // System.out.println(l1);

        //sorting
        Collections.sort(l1);
        System.out.println(l1);
        Collections.sort(l1,Collections.reverseOrder());
        System.out.println(l1);

        //common bw two
        ArrayList<Integer> l=new ArrayList<>(l1);
        l.retainAll(list2);
        System.out.println("common"+l);
    
        //reversed arraylist
        Collections.reverse(l1);
        System.out.println("rverse"+l1);

        //empty or not
        if (l1.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        } else {
            System.out.println("The ArrayList is not empty.");
        }
        //empty
        ArrayList<String> n= new ArrayList<>();
        if (n.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        } else {
            System.out.println("The ArrayList is not empty.");
        }

        //arraylist -> array
        // Integer[] integerArray = l1.toArray(new Integer[0]);

        // Print Integer array
        System.out.println("Integer Array:");

        // for (int i = 0; i < integerArray.length; i++) {
            // System.out.println(integerArray[i]);
        // }

        //idx of a specific element
        System.out.println(l1.indexOf(1));

        //Remove All Occurrences of a Specific Element
        // l1.removeAll(java.util.Collections.singleton(2));
        l1.removeIf(s -> s.equals(1));
        System.out.println(l1);

        //. Replace Elements in an ArrayList
        for (int i = 0; i < l1.size(); i++) {
            if (l1.get(i).equals(2)) {
                l1.set(i, 99);
            }
        }
        System.out.println("replace"+l1);

        //Find the Second Largest Element in an ArrayList
        Collections.sort(l1);
        
        // Print the second largest element
        int secondLargest = l1.get(l1.size() - 2);
        
        System.out.println("Second Largest Element: " + secondLargest);

        //Check if Two ArrayLists Are Equal
        System.out.println(l1.equals(list2));

        //Create a custom Student class with fields name and age

        ArrayList<students> s=new ArrayList<>();
       
        s.add(new students("a", 19));
        s.get(0).print();

}
}