
package conversion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ConversionExamplesDate {

	// convert from String to date
	private void stringToDate() {
		
		try {
			Date date1;
			date1 = new SimpleDateFormat("MM/dd/yy").parse("05/18/05");
			System.out.println(date1);
			Date date2 = new SimpleDateFormat("MM/dd/yyyy").parse("05/18/2007");
			System.out.println(date2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	// convert from millisecs to a String with a defined format
	private void calcDate(long millisecs) {
		SimpleDateFormat date_format = new SimpleDateFormat("MMM dd,yyyy HH:mm");
		Date resultdate = new Date(millisecs);
		System.out.println(date_format.format(resultdate));
	}
	
	private void writeActualDate(){
		Calendar cal = new GregorianCalendar();
		Date creationDate = cal.getTime();
		SimpleDateFormat date_format = new SimpleDateFormat("MMM dd,yyyy HH:mm");
		System.out.println(date_format.format(creationDate));
	}
	

	public static void main(String[] args) {
		ConversionExamplesDate convert = new ConversionExamplesDate();
		convert.stringToDate();
		convert.calcDate(System.currentTimeMillis());
		convert.writeActualDate();
	}
}
