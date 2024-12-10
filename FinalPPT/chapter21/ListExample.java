import java.util.*;
public class ListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>() ; // or LinkedList<>()
        // add, allAll
        names.add("Park") ;
        names.add("Kim") ;
        // toString
        System.out.println(names.toString()) ; // [Park, Kim]
        // add
        names.add(1, "Lee") ;
        // size, get
        for ( int i = 0 ; i < names.size() ; i ++ ) System.out.println(names.get(i)) ;
        // Park
        // Lee
        // Kim

        // remove
        names.remove("Kim") ; // remove(int index), removeAll(Collection<?> c)
        // indexOf
        int foundIndex = names.indexOf("Kim") ; // lastIndexOf also supported
        if ( foundIndex == -1 ) // ! names.contains(“Kim”), containsAll()
            System.out.println("Kim not Found") ; // Kim not Found
        else {
            System.out.println("Kim Found") ;
            names.remove(foundIndex)
        }
        // subList, clear
        names.subList(0, 1).clear(); // Remove Park
        // Iterator
        Iterator<String> it = names.iterator() ;
        while ( it.hasNext() ) System.out.println(it.next()) ;
        // Lee
        // clear, isEmpty
        names.clear();
        assert ( names.isEmpty() == true );
    }
}
