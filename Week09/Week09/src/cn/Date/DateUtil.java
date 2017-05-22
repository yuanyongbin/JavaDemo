package cn.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



/**
 * �������ں��ַ����໥ת���Ĺ����ࣺ
 * 
 * @author gzz
 * 
 */
public class DateUtil {
	private DateUtil() {

	}

	/**
	 * ���ڵ��ַ�����ת��
	 * 
	 * @param d
	 *            ת��������
	 * @param format
	 *            ��Ҫ�õ������ڵĸ�ʽ
	 * @return ���ڵ��ַ���
	 */
	public static String dataToString(Date d, String format) {
		SimpleDateFormat stf = new SimpleDateFormat(format);
		String s = stf.format(d);
		return s;
	}

	/**
	 * �ַ��������ڵ�ת��
	 * 
	 * @param time
	 *            ����
	 * @param format
	 *            ���������ڵĸ�ʽ
	 * @return ���ڶ���
	 * @throws ParseException
	 */
	public static Date StringToDate(String time, String format)
			throws ParseException {
		SimpleDateFormat stf = new SimpleDateFormat(format);
		Date d = stf.parse(time);
		return d;

	}
}
