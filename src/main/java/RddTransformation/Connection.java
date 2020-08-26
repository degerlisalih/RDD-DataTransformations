package RddTransformation;

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class Connection {
  public static JavaSparkContext cont = new JavaSparkContext("local","RDDMap");

   public static JavaRDD<String> raw_data= cont.textFile("E:\\big data\\java workspace\\07\\SparkProject\\WorldCups.csv");

   public static JavaRDD<String> first_data = cont.textFile("E:\\big data\\java workspace\\07\\SparkProject\\ilkDataSet.txt");
}
