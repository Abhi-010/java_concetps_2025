package streams.timbachuka;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<String> bingoPool = new ArrayList<>(75) ;
        int start = 1;
        for(char ch : "BINGO".toCharArray()){
            for(int i = start ; i < (start + 15) ; i++){
                bingoPool.add("" + ch + i);
               // System.out.println(""+c+i);
            }
            start+=15 ;
        }

        Collections.shuffle(bingoPool);
        for(int i = 0 ; i < 15 ; i++){
            System.out.print(bingoPool.get(i) +" ");
        }

        System.out.println("\n" + "---------------------------------------");

        List<String> firstOnes = new ArrayList<>(bingoPool.subList(0,15)) ;
        firstOnes.sort(Comparator.naturalOrder());

        firstOnes.replaceAll(
                s->{
                    if(s.indexOf('G') == 0 || s.indexOf("O") == 0){
                        System.out.print(s.charAt(0) + "-" + s.substring(1) + " ");
                        return s.charAt(0) + "-" + s.substring(1) ;
                    }
                    return s ;
                }
        );
        System.out.println("\n_______________________________________");

        for(int i = 0 ; i < 15 ; i++){
            System.out.print(bingoPool.get(i) + " ");
        }
        System.out.println("---------------------------------------");

        Stream<String> newStreams = bingoPool.stream()
                .limit(15)
                .filter(s-> s.indexOf('G') == 0 || s.indexOf("O") == 0)
                .map(s-> s.charAt(0) + "-" + s.substring(1)) ;
        //        .forEach(s-> System.out.println(s+ " "));


        newStreams.forEach(s-> System.out.print(s + " "));

        //newStreams.forEach(s-> System.out.print(s.toLowerCase() + " "));

        System.out.println("\n" + "--------------------------------------------------");

        String[] strings = {"One", "Two","Three"};

        var firstStream = Arrays.stream(strings)
                .sorted(Comparator.reverseOrder()) ;
                //.map(s->s.charAt(0) + 65)
//                .forEach(System.out::println);

        var secondStream = Stream.of("Four","Five","Six")
                .map(String::toUpperCase) ;
//                .forEach(System.out::println);


        Stream.concat(secondStream,firstStream)
                .map(s-> s.charAt(0) + " - " + s)
                .forEach(System.out::println);


        Map<Character,int[]> map = new LinkedHashMap<>();
        int bingoIndex = 1;


        for(char c : "BINGO".toCharArray()){
            int labelNo = bingoIndex ;
            int[] numbers = new int[15];
            Arrays.setAll(numbers,i->i+labelNo);
            map.put(c,numbers);
            bingoIndex += 15 ;
        }

        map.entrySet()
                .stream()
                .map(e -> e.getKey() + " has range values " +
                        e.getValue()[0] + " - " + e.getValue()[e.getValue().length-1])
                .forEach(System.out::println);


        /**
         * infinite Streams
         *
         */

        Random random = new Random();
        Stream.generate(()-> random.nextInt(2))
                .limit(20)
                .forEach(s-> System.out.print(s + " "));

        System.out.println();

        IntStream.iterate(1,n->n+1)
                .filter(Streams::isPrime)
                .limit(20)
                .forEach(s-> System.out.print(s + " "));

        System.out.println();
        IntStream.iterate(1,n->n+1)
                .limit(100)
                .filter(Streams::isPrime)
                .forEach(s-> System.out.print(s + " "));

        System.out.println();
        IntStream.iterate(1, n -> n <= 100, n->n+1)
                //.limit(100)
                .filter(Streams::isPrime)
                .forEach(s-> System.out.print(s + " "));



    }

    public static boolean isPrime(int wholeNumber){
        if(wholeNumber<=2){
            return false ;
        }
        for(int divisor = 2 ; divisor < wholeNumber ; divisor++){
            if(wholeNumber%divisor == 0){
                return false ;
            }
        }
        return  true ;
    }
}























