package fam.hbl.Kaggle.Bosch

import org.apache.spark.sql.{SparkSession,Dataset,Row,DataFrame}

import org.apache.log4j.Logger
import org.apache.log4j.Level.DEBUG
object SampleExploration extends App with SparkDriver {

	/* 
	 * ------ Logging  --------------------------------------------
	 */
	val expl_logger = Logger.getLogger("SampleExploration");
	//
	expl_logger.setLevel(DEBUG)

	/* 
	 * ------ SETTINGS --------------------------------------------
	 */

	// get a spark session
	// val session= SparkDriver.config_session(hadoop_dir, spark_warehouse_dir);
	val session= config_session();
  
  // get the data 
  val dataDir= "C:\\Users\\Massimo\\Code\\GitRepoS\\SparkBoschRepo\\KaggleBosch\\TestData\\"
	val dataFileName= "ColumnSelectionTestData.csv"
	val dataPath= dataDir+dataFileName
	
	// load data
	val (train,validation)= 
	  getData_split (
	      dataPath,
	      dataDir+"ColumnSelectionTestData_train", 
	      dataDir+"ColumnSelectionTestData_validation", 
	      session)

}
