import java.util.*;
public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> cityPopulation = new HashMap<>() ;
        cityPopulation.put("Busan", 350) ; // putAll
        cityPopulation.put("Seoul", 1000) ;
        cityPopulation.put("Daejon", 150) ;
        System.out.println(cityPopulation) ; // {Busan=350, Seoul=1000, Daejon=150}

        if ( cityPopulation.containsKey("Daejon") )
            System.out.println(cityPopulation.get("Daejon")) ; // 150

        cityPopulation.remove("Daejon") ;

        Set<String> cities = cityPopulation.keySet() ;
        System.out.println(cities) ; // [Busan, Seoul]

        Collection<Integer> population = cityPopulation.values() ;
        System.out.println(population) ; // [350, 1000]

        cityPopulation.replace("Busan", 300);

        for ( final String key : cityPopulation.keySet() ) {
            System.out.println( String.format("키 : %s, 값 : %s", key, cityPopulation.get(key)) );
        }

        Iterator<String> keys = cityPopulation.keySet().iterator();
        while ( keys.hasNext() ) {
            String key = keys.next();
            System.out.println( String.format("키 : %s, 값 : %s", key, cityPopulation.get(key)) );
        }
        
        for ( final Map.Entry<String, Integer> elem : cityPopulation.entrySet() ) {
            System.out.println( String.format("키 : %s, 값 : %s", elem.getKey(), elem.getValue()) );
        }
    }
}