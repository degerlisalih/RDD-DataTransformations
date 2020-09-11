
 //birden fazla RDD olusturmak için kullanılır. örneğin bir satırdan olusan text'in
 // kelimelere parçalanarak farklı veriler olarak tutulması.


package RddTransformation;

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.function.FlatMapFunction;
import org.apache.spark.api.java.function.VoidFunction;

import java.util.Arrays;


public class Flatmap extends Connection {
    public static void main(String[] args) {

        JavaRDD<String> flat = raw_data.flatMap((FlatMapFunction<String, String>) s -> Arrays.asList(s.split(",")).iterator());
        flat.foreach((VoidFunction<String>) System.out::println);

    }
}
