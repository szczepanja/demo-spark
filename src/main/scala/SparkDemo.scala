object SparkDemo extends App {

  import org.apache.spark.sql.SparkSession

  val spark = SparkSession
    .builder()
    .appName("Spark SQL basic example")
    //    .config("spark.some.config.option", "some-value")
    .master("local[*]")
    .getOrCreate()

}
