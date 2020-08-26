/**
 * iki rdd yi birleştirmede kullanılır.
 */
package RddTransformation;

import org.apache.spark.api.java.JavaRDD;

public class Union extends Connection {
    public static void main(String[] args) {


        JavaRDD<String> unionRDD = raw_data.union(first_data);

        System.out.println("1.RDD : " + raw_data.count());
        System.out.println("2.RDD : " + first_data.count());
        System.out.println("unionRDD : " + unionRDD.count());

    }
}
