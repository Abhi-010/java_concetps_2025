package streams.timbachuka;


import streams.timbachuka.mapOperation.Seat;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsIntermediate {
    public static void main(String[] args) {
        IntStream.iterate( (int)'A',i-> i < (int)'z',i -> i+1 )
                .filter(Character::isAlphabetic)
                //.distinct()
                .map(Character::toUpperCase)
                .distinct()
                //.filter(i-> Character.toUpperCase(i) > 'E')
                //.filter(i->Character.toUpperCase(i) < 'T')
                .forEach(d-> System.out.printf("%c ",d));

        System.out.println("-----------------------------------------");
        Random random = new Random();
        Stream.generate(()-> random.nextInt(10))
                .limit(20)
                .forEach(s-> System.out.print(s + " "));

        System.out.println("-----------------------------------------");
//        List<Integer> l = List.of(4,3,9,1,0,10) ;
//        l.stream()
//                .sorted((i1,i2) -> {
//                    if(i1 < i2) return 1;
//                    else if(i1 > i2) return -1;
//                    return 1;
//                })
//                .forEach((i)-> System.out.println(i + " "));

        List<Integer> l = List.of(4,3,9,1,0,10) ;
        l.stream()
                .sorted(Comparator.reverseOrder())
                .forEach((i)-> System.out.println(i + " "));


        System.out.println("Map Operations..--------------------------------");
        int maxSeats = 100;
        int seatsInRow = 10;

        var stream = Stream.iterate(1, i-> i < 100, i->i+1)
                .map(integer ->
                        ( new Seat( (char) ('A' + integer/seatsInRow) ,integer % seatsInRow+1))) ;


        stream.forEach(System.out::println);
        //.map(i-> new Seat((char) ('A' + i/seatsInRow) ,i) );



    }


}
