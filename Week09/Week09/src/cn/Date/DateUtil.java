package cn.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



/**
 * 这是日期和字符串相互转换的工具类：
 * 
 * @author gzz
 * 
 */
public class DateUtil {
	private DateUtil() {

	}

	/**
	 * 日期到字符串的转换
	 * 
	 * @param d
	 *            转换的日期
	 * @param format
	 *            想要得到的日期的格式
	 * @return 日期的字符串
	 */
	public static String dataToString(Date d, String format) {
		SimpleDateFormat stf = new SimpleDateFormat(format);
		String s = stf.format(d);
		return s;
	}

	/**
	 * 字符串到日期的转换
	 * 
	 * @param time
	 *            日期
	 * @param format
	 *            解析的日期的格式
	 * @return 日期对象
	 * @throws ParseException
	 */
	public static Date StringToDate(String time, String format)
			throws ParseException {
		SimpleDateFormat stf = new SimpleDateFormat(format);
		Date d = stf.parse(time);
		return d;

	}
}
