/**
 * dataset içerisinden örnek bir veri kümesi çeker.
 * ne kadarlık bir veri çekecegini fraction değeri belirler.
 */
package RddTransformation;

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.function.VoidFunction;

public class Sample extends Connection {
    public static void main(String[] args) {


        JavaRDD<String> sampleRDD = raw_data.sample(false, 0.5);

        sampleRDD.foreach(new VoidFunction<String>() {

            public void call(String s) throws Exception {
                System.out.println(s);
            }
        });

    }
}
