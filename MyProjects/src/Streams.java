import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
JAVA 8 Stremas

Streams are used in java to act upon collection of objects /arrays etc...filter, or convert the result from one form to another... each operation is streamed and terminal operation performed retruns the result teo types of
operations immediate operation and terminal operation

imddieate opeartions:
1) map : convert inmput fromone form of result to another, based on predicate
2) filter: filer out the results based on prediicate
3) sorted: sort the input collection
 */
public class Streams {

    /*
    Test imeediate operations
     */

    /*
    Test map function of stream
     */

    private static  void testStrreamMap(List input){
        Function<Integer, Integer> square = x -> x*x;

        Set result =(Set) input.stream().map(square).collect(Collectors.toSet());
        System.out.println("The squared values on numbers in list is ..."+ result);
    }

    /*
    test filter function of steram
     */

    private static void testStreamFilter(List input){

        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                // filter cities that start with "C"
                return s.startsWith("C");
            }
        };
      List<String> result = (List) input.stream().filter(predicate).collect(Collectors.toList());


        System.out.println("The filtered values of string in list is ..."+ result);
    }

    /*
    test  sorted ufuntion of stream
     */

    private static void testStreamSoorted(List input){
        List result = (List)input.stream().sorted().collect(Collectors.toList());
        System.out.println("The sorted values is ....."+ result);
    }
    /*
      Terminal Operations
     */

    /*
       test for each terminal operation
     */

    private static void testStreamForEach(List input){
        Function<Integer, Integer> square = x -> x*x;

        input.stream().map(square).forEach(x->System.out.print(x+" "));
    }

//    /*
//       test for each terminal operation
//     */
//
//    private static void testStreamReduce(List input){
//
//        Function<Integer, Integer> square = x -> x*x;
//
//
//        int sum =  input.stream().map(square).reduce(0,(x,y) -> x+y);
//        System.out.println(sum);
//
//    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }


    public static void main(String args[]){

        List input = Arrays.asList(2,3,4,5);
        testStrreamMap(input);
        List input1= Arrays.asList("Refelction", "Sawars","Collection");
        testStreamFilter(input1);
        List input2= Arrays.asList("Raghav","Rajeev","Pushpa");
        testStreamSoorted(input2);
        testStreamForEach(input);
    }


}
