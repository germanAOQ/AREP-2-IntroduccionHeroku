package edu.escuelaing.arep.sparkweb;


import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class SparkWebTest {

	@Test
    public void shouldCalculateMeanFirstColumn() throws IOException{
		String data = "160%20591%20114%20229%20230%20270%20128%201657%20624%201503";
        URL url = new URL("https://sparkwebapp.herokuapp.com/mean?list=" + data);
        URLConnection urlConnection = url.openConnection();
        BufferedReader read = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        String inputLine = read.readLine();
        assertTrue(inputLine.equals("550.6"));
        read.close();   
    }
	
	@Test
    public void shouldCalculateMeanSecondColumn() throws IOException{
		String data = "15.0%2069.9%206.5%2022.4%2028.4%2065.9%2019.4%20198.7%2038.8%20138.2";
        URL url = new URL("https://sparkwebapp.herokuapp.com/mean?list=" + data);
        URLConnection urlConnection = url.openConnection();
        BufferedReader read = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        String inputLine = read.readLine();
        assertTrue(inputLine.equals("60.32"));
        read.close();   
    }
	
	@Test
    public void shouldCalculateStddevFirstColumn() throws IOException{
		String data = "160%20591%20114%20229%20230%20270%20128%201657%20624%201503";
        URL url = new URL("https://sparkwebapp.herokuapp.com/stddev?list=" + data);
        URLConnection urlConnection = url.openConnection();
        BufferedReader read = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        String inputLine = read.readLine();
        assertTrue(inputLine.equals("572.03"));
        read.close();   
    }

	@Test
    public void shouldCalculateStddevSecondColumn() throws IOException{
		String data = "15.0%2069.9%206.5%2022.4%2028.4%2065.9%2019.4%20198.7%2038.8%20138.2";
        URL url = new URL("https://sparkwebapp.herokuapp.com/stddev?list=" + data);
        URLConnection urlConnection = url.openConnection();
        BufferedReader read = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        String inputLine = read.readLine();
        assertTrue(inputLine.equals("62.26"));
        read.close();   
    }
}
