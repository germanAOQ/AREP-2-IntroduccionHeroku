package edu.escuelaing.arep.sparkweb;

import static spark.Spark.*;

import java.util.ArrayList;

import edu.escuelaing.arep.stat.Stat;
import edu.escuelaing.arep.util.LinkedList;
import spark.QueryParamsMap;

/**
 * Hello world!
 *
 */
public class SparkWebApp {

	public static void main(String[] args) {
		port(getPort());
		staticFileLocation("public");
		get("/mean", (req, res) -> {
			QueryParamsMap map = req.queryMap();
			try{
				String stringNumeros = map.get("list").value();
				System.out.println(stringNumeros);
				String[] listaNumerosArray = stringNumeros.split(" ");
				LinkedList<Double> parseNumbers = new LinkedList<Double>();
				for(String number: listaNumerosArray){
					parseNumbers.add(Double.parseDouble(number));
				}
				return Stat.mean(parseNumbers);
			}catch(Exception e){
				return "Error: " + e.getMessage();
			}
		});
		get("/stddev", (req, res) -> {
			QueryParamsMap map = req.queryMap();
			try{
				String stringNumeros = map.get("list").value();
				System.out.println(stringNumeros);
				String[] listaNumerosArray = stringNumeros.split(" ");
				LinkedList<Double> parseNumbers = new LinkedList<Double>();
				for(String number: listaNumerosArray){
					parseNumbers.add(Double.parseDouble(number));
				}
				return Stat.stddev(parseNumbers);
			}catch(Exception e){
				return "Error: " + e.getMessage();
			}
		});
		
	}

	static int getPort() {
		if (System.getenv("PORT") != null) {
			return Integer.parseInt(System.getenv("PORT"));
		}	
		return 4567; // returns default port if heroku-port isn't set (i.e. on localhost)
	}
}
