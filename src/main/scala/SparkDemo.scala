object SparkDemo extends App {

  import org.apache.spark.sql.SparkSession

  val spark = SparkSession
    .builder()
    .appName("Spark SQL basic example")
    .master("local[*]")
    .getOrCreate()

  val df = spark.read.text(args(0))
  df.show()

  df.write.text("abc")
}

// transitive dependencies
