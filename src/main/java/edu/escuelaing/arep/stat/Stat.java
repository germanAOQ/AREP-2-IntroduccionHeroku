package edu.escuelaing.arep.stat;

import java.util.List;

import edu.escuelaing.arep.stat.exceptions.StatException;

/**
 * The Class Stat.
 */
public class Stat {
	
	
	/**
	 * Mean.
	 *
	 * @param lval Lista que contiene n�meros reales.
	 * @return La media de los n�meros presentes en la lista.
	 * @throws StatException si el n�mero de elementos presentes en la lista es igual cero.
	 */
	public static Double mean(List<Double> lval) throws StatException{
		if(lval.size() == 0) throw new StatException(StatException.DIVISION_CERO);
		Double suma = 0.0;
		for(Double e: lval) {
			suma = suma + e;
		}
		Double mean = suma / lval.size();
		return Math.round(mean*100.0)/100.0;
	}
	
	/**
	 * Stddev.
	 *
	 * @param lval Lista que contiene n�meros reales
	 * @return La desviaci�n est�ndar de los n�meros presentes en la lista.
	 * @throws StatException si el n�mero de elementos presentes en la lista es igual cero.
	 */
	public static Double stddev(List<Double> lval) throws StatException{
		if(lval.size() == 0) throw new StatException(StatException.DIVISION_CERO);
		Double mean = mean(lval);
		Double suma = 0.0;
		for(Double valor: lval) {
			suma = suma + Math.pow((valor - mean), 2);
		}
		Double div = suma / (lval.size()-1);
		Double deviation = Math.sqrt(div);
		return Math.round(deviation*100.0)/100.0;
	}
}
