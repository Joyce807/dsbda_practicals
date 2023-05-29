package SalesCountry;

import java.io.IOException;
import java.util.*;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.*;

public class SalesMapper extends MapReduceBase implements Mapper<LongWritable, Text, Text, IntWritable>{
	public final static IntWritable one = new IntWritable(1);
	
	public void map(LongWritable key, Text value, OutputCollector<Text,IntWritable> output, Reporter reporter) throws IOException{
		String valueString = value.toString();
		String[] SingleCountryData = valueString.split("-");
		output.collect(new Text(SingleCountryData[0]), one);
	
	
	
	}




}
