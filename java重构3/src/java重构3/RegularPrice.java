package java�ع�3;

public class RegularPrice extends Price {
	int getPriceCode() {
		return Movie.NEW_RELEASE;
	}
	public double getChager(int daysRented) {
		double result=2;
  		 if(daysRented > 2) 
  			 result += (daysRented - 2) * 1.5;
		return result;
		
	}
}
