//Task1
//import java.util.ArrayList;
//
//public class Main {
//    public static void main(String[] args){
//        ArrayList<String> names = new ArrayList<String>();
//        names.add("Merey");
//        names.add("Miras");
//        names.add("Adiya");
//        names.add("Janar");
//        System.out.println(names);
//    }
//}


//Task2
//import java.util.ArrayList;
//
//public class Main{
//    public static void main(String[] args){
//        ArrayList<String> names = new ArrayList<String>();
//        names.add("Merey");
//        names.add("Miras");
//        names.add("Adiya");
//        names.add("Janar");
//        for(int i = 0; i < names.size(); i++){
//            System.out.println(names.get(i));
//        }
//    }
//}

//Task3
//import java.util.ArrayList;
//
//public class Main{
//    public static void main(String[] args){
//        ArrayList<String> names = new ArrayList<String>();
//        names.add("Merey");
//        names.add("Miras");
//        names.add("Adiya");
//        names.add("Janar");
//        for(String i : names){
//            System.out.println(i);
//        }
//
//
//    }
//}

//Task4
//import java.util.ArrayList;
//
//public class Main{
//    public static void main(String[] args){
//        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
//        myNumbers.add(10);
//        myNumbers.add(20);
//        myNumbers.add(30);
//        myNumbers.add(40);
//        for(int i : myNumbers){
//            System.out.println(i);
//        }
//    }
//}

//Task5
//import java.util.ArrayList;
//import java.util.Collections;
//
//public class Main {
//    public static void main(String[] args){
//        ArrayList<String> names = new ArrayList<String>();
//        names.add("Merey");
//        names.add("Miras");
//        names.add("Adiya");
//        names.add("Janar");
//        Collections.sort(names);
//        for(String i : names){
//            System.out.println(i);
//        }
//    }
//}


//Task 6
//import java.util.ArrayList;
//import java.util.Collections;
//
//public class Main {
//    public static void main(String[] args){
//        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
//        myNumbers.add(22);
//        myNumbers.add(33);
//        myNumbers.add(77);
//        myNumbers.add(11);
//        myNumbers.add(44);
//        myNumbers.add(55);
//
//        Collections.sort(myNumbers);
//
//        for(int i : myNumbers){
//            System.out.println(i);
//        }
//    }
//}

//Task7
//import java.util.ArrayList;
//
//public class Main {
//    public static void main(String[] args){
//        ArrayList<String> names = new ArrayList<String>();
//        names.add("Merey");
//        names.add("Miras");
//        names.add("Adiya");
//        names.add("Janar");
//        System.out.println(names);
//
//
//        String name = names.get(0);
//        System.out.println("get method:" +name);
//
//        names.set(1, "Amina");
//        System.out.println("set method:" +names);
//
//        names.remove(1);
//        System.out.println("remove method:" +names);
//
//
//        names.clear();
//        System.out.println("clear method:" +names);
//
//        int s = names.size();
//        System.out.println("last size" +s);
//
//    }
//}

//Problem1
//import java.util.ArrayList;
//
//public class Main {
//    public static void main(String[] args){
//        ArrayList<String> color = new ArrayList<String>();
//        color.add("Pink");
//        color.add("Blue");
//        color.add("Black");
//        color.add("Yellow");
//        System.out.println(color);
//    }
//}


//Problem2
//import java.util.ArrayList;
//public class Main {
//    public static void main(String[] args){
//        ArrayList<String> fruit = new ArrayList<String>();
//        fruit.add("apple");
//        fruit.add("banana");
//        fruit.add("cherry");
//        fruit.add("orange");
//
//        fruit.add(0,"lime");
//        System.out.println(fruit);
//
//    }
//}


//Problem3
//import java.util.ArrayList;
//
//public class Main {
//    public static void main(String[] args){
//        ArrayList<String> fruit = new ArrayList<String>();
//        fruit.add("apple");
//        fruit.add("banana");
//        fruit.add("cherry");
//        fruit.add("orange");
//        System.out.println(fruit);
//        String element = fruit.get(3);
//        System.out.println(element);
//    }
//}

//Problem 4
//import java.util.ArrayList;
//public class Main {
//    public static void main(String[] args){
//        ArrayList<String> fruit = new ArrayList<String>();
//        fruit.add("apple");
//        fruit.add("banana");
//        fruit.add("cherry");
//        fruit.add("orange");
//        fruit.set(3,"lemon");
//        System.out.println(fruit);
//    }
//}


//Problem5
//import java.util.ArrayList;
//public class Main {
//    public static void main(String[] args){
//        ArrayList<String> fruit = new ArrayList<String>();
//        fruit.add("apple");
//        fruit.add("banana");
//        fruit.add("cherry");
//        fruit.add("orange");
//        fruit.remove(2);
//        System.out.println(fruit);
//
//    }
//}


//Problem 6
//import java.util.ArrayList;
//public class Main {
//    public static void main(String[] args){
//        ArrayList<String> fruit = new ArrayList<String>();
//        fruit.add("apple");
//        fruit.add("banana");
//        fruit.add("cherry");
//        fruit.add("orange");
//
//        if(fruit.contains("apple")){
//            System.out.println("Found the element");
//        }
//        else{
//            System.out.println("There is no such element");
//        }
//    }
//}


//Problem7
//import java.util.ArrayList;
//import java.util.Collections;
//public class Main {
//    public static void main(String[] args){
//        ArrayList<String> fruit1 = new ArrayList<String>();
//        fruit1.add("apple");
//        fruit1.add("banana");
//        fruit1.add("cherry");
//        fruit1.add("orange");
//        System.out.println("fruit1:"+fruit1);
//        ArrayList<String> fruit2 = new ArrayList<String>();
//        fruit2.add("mango");
//        fruit2.add("grape");
//        fruit2.add("coconut");
//        fruit2.add("pineapple");
//        System.out.println("fruit2:"+fruit2);
//        Collections.copy(fruit1,fruit2);
//        System.out.println("fruit1:"+fruit1);
//        System.out.println("fruit2:"+fruit2);
//
//
//
//    }
//}


//Problem8
//import java.util.ArrayList;
//import java.util.Collections;
//public class Main {
//    public static void main(String[] args){
//        ArrayList<String> fruit = new ArrayList<String>();
//        fruit.add("apple");
//        fruit.add("banana");
//        fruit.add("cherry");
//        fruit.add("orange");
//        System.out.println("fruit before shuffling:\n"+fruit);
//        Collections.shuffle(fruit);
//        System.out.println("fruit after shuffling:\n"+fruit);
//    }
//}

//Problem9
//import java.util.ArrayList;
//import java.util.Collections;
//public class Main {
//    public static void main(String[] args){
//        ArrayList<String> fruit = new ArrayList<String>();
//        fruit.add("apple");
//        fruit.add("banana");
//        fruit.add("cherry");
//        fruit.add("orange");
//        System.out.println("fruit before reversing:\n"+fruit);
//        Collections.reverse(fruit);
//        System.out.println("fruit after reversing:\n"+fruit);
//    }
//}









