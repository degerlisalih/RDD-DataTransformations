/**
 * veri içerisindeki bir birinin aynısı olan satırlardan birini siler ve
 * olusan veriyi yeni bir rdd ye atar.
 */
package RddTransformation;

import org.apache.spark.api.java.JavaRDD;

public class Distinct extends Connection {
    public static void main(String[] args) {


        System.out.println("ham veri" + raw_data.count());

        JavaRDD<String> distinctRDD = raw_data.distinct();

        System.out.println("islenmis veri" + distinctRDD.count());

    }
}
