/**
 * birden fazla RDD olusturmak için kullanılır. örneğin bir satırdan olusan text'in
 * kelimelere parçalanarak farklı veriler olarak tutulması.
 */

package RddTransformation;

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.function.FlatMapFunction;
import org.apache.spark.api.java.function.VoidFunction;

import java.util.Arrays;
import java.util.Iterator;

public class Rddflatmap extends Connection {
    public static void main(String[] args) {

        JavaRDD<String> flat = raw_data.flatMap(new FlatMapFunction<String, String>() {

            public Iterator<String> call(String s) throws Exception {
                return Arrays.asList(s.split(",")).iterator();
            }
        });
        flat.foreach(new VoidFunction<String>() {

            public void call(String s) throws Exception {
                System.out.println(s);
            }
        });

    }
}
