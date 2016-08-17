package com.cloudCount.platform.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.SimpleTimeZone;

/**
* Cloud Count System
*
* File: UtilConvertDate.java
*
* BM Inc.
* Copyright (C): 2015
*
* Description:
* 转换时间类型公有类
*
* Notes:UtilConvertDate.java 2015-10-26 上午11:22:19 CHENSP
*/
public class UtilConverterDate {
	
	/**
	 * 字符串类型转日期
	 * @param dateStr String 
	 * @param converterDateStr String 
	 * @return Date
	 */
	public static Date convertString2Date(String dateStr,String converterDateStr){
		SimpleDateFormat dateformat = new SimpleDateFormat(converterDateStr);
		Date date = null;
		try {
			date = dateformat.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	/**
	 * 日期转字符串
	 * @param date Date
	 * @param converterDateStr String 
	 * @return
	 */
	public static String convertDate2String(Date date,String converterDateStr){
		SimpleDateFormat dateformat = new SimpleDateFormat(converterDateStr);
		String dateStr = null;
		try {
			if(!ValidationUtil.isEmpty(date))
			{
				dateStr = dateformat.format(date);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dateStr;
	}
	
	/**
	 * 日期转字符串
	 * @param date Date
	 * @return
	 */
	public static String convertDate2String(Date date){
		SimpleDateFormat dateformat = new SimpleDateFormat(Constants.YYYY_MM_DD_HH_MM_SS);
		String dateStr = null;
		try {
			if(!ValidationUtil.isEmpty(date))
			{
				dateStr = dateformat.format(date);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dateStr;
	}
	
	/**
	 * 当天日期转字符串YYYY_MM_DD
	 * @param date Date
	 * @return
	 */
	public static String convertDate2YMDString(){
		Date date = new Date();
		SimpleDateFormat dateformat = new SimpleDateFormat(Constants.YYYY_MM_DD);
		String dateStr = null;
		try {
			if(!ValidationUtil.isEmpty(date))
			{
				dateStr = dateformat.format(date);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dateStr;
	}
	
	/**
	 * 当天日期转字符串
	 * @param date Date
	 * @return
	 */
	public static String convertDate2String(){
		Date date = new Date();
		SimpleDateFormat dateformat = new SimpleDateFormat(Constants.YYMMDD);
		String dateStr = null;
		try {
			if(!ValidationUtil.isEmpty(date))
			{
				dateStr = dateformat.format(date);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dateStr;
	}
	
	/**
	 * 当天日期前一个小时日期转字符串
	 * @param  
	 * @return
	 */
	public static String convertDateBeforeOne2String(){
		Date date = new Date();
		SimpleDateFormat dateformat = new SimpleDateFormat(Constants.YYMMDD);
		String dateStr = null;
		Calendar fieldTime = Calendar.getInstance();
		fieldTime.setTime(date);
		// fieldTime.add(Calendar.HOUR_OF_DAY, -1);
		try {
			if(!ValidationUtil.isEmpty(fieldTime))
			{
				dateStr = dateformat.format(fieldTime.getTime());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dateStr;
	}
	
	/**
	 * 根据参数返回前日期转字符串-YYMMDD
	 * @param date Date
	 * @return
	 */
	public static String convertDate2String(int days){
		SimpleDateFormat dateformat = new SimpleDateFormat(Constants.YYMMDD);
		Calendar fieldTime = Calendar.getInstance();
		fieldTime.add(Calendar.DATE, -days);
		String dateStr = null;
		try {
			if(!ValidationUtil.isEmpty(fieldTime))
			{
				dateStr = dateformat.format(fieldTime.getTime());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dateStr;
	}
	
	/**
	 * 根据参数返回前日期转字符串集合-YYMMDD
	 * @param date Date
	 * @return 
	 */
	public static List<String> convertDate2DayString(int days){
		SimpleDateFormat dateformat = new SimpleDateFormat(Constants.YYMMDD);
		List<String> list = new ArrayList<String>();
		try {
			for(;days>0; days--){
				Calendar fieldTime = Calendar.getInstance();
				fieldTime.add(Calendar.DATE, -days);
				list.add(dateformat.format(fieldTime.getTime()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	/**
	 * 根据参数开始时间和结束时间返回间隔天数
	 * @param date Date
	 * @return long
	 */
	public static long convertDate2Between(String startTime, String endTime){
		long diff = 0;
		try {
			if(!ValidationUtil.isEmpty(startTime) && !ValidationUtil.isEmpty(endTime))
			{
				diff = (UtilConverterDate.convertString2Date(endTime, Constants.YYYY_MM_DD).getTime()-UtilConverterDate.convertString2Date(startTime, Constants.YYYY_MM_DD).getTime())/(86400 * 1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return diff;
	}
	
	/**
	 * 日期转字符串
	 * @param date				日期
	 * @param converterDateStr	日期转换格式
	 * @param locale			区域
	 * @return
	 */
	public static String convertGMTDate2String(Date date,String converterDateStr, Locale locale){
		SimpleDateFormat dateformat = new SimpleDateFormat(converterDateStr, locale);
		dateformat.setTimeZone(new SimpleTimeZone(0, "GMT"));
		String dateStr = null;
		try {
			if(!ValidationUtil.isEmpty(date))
			{
				dateStr = dateformat.format(date);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dateStr;
	}
	
	/**
	 * 日期转字符串
	 * @param date				日期
	 * @param converterDateStr	日期转换格式
	 * @param locale			区域
	 * @return
	 */
	public static String convertGMTDate2String(Date date,String converterDateStr){
		SimpleDateFormat dateformat = new SimpleDateFormat(converterDateStr);
		dateformat.setTimeZone(new SimpleTimeZone(0, "GMT"));
		String dateStr = null;
		try {
			if(!ValidationUtil.isEmpty(date))
			{
				dateStr = dateformat.format(date);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dateStr;
	}
	
	/**
	 * 字符串类型转日期
	 * @param dateStr String 
	 * @param converterDateStr String 
	 * @return Date
	 */
	public static Date convertString2GMTDate(String dateStr,String converterDateStr){
		SimpleDateFormat dateformat = new SimpleDateFormat(converterDateStr);
		dateformat.setTimeZone(new SimpleTimeZone(0, "GMT"));
		Date date = null;
		try {
			date = dateformat.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	/**
	 * 字符串类型转日期
	 * @param interval int  间隔时间(h) 
	 * @return Date
	 */
	public static Date convertIntervalH2GMTDate(int interval){
		SimpleDateFormat dateformat = new SimpleDateFormat(Constants.YYYY_MM_DD_HH_MM_SS);
		dateformat.setTimeZone(new SimpleTimeZone(0, "GMT"));
		Date date = new Date();		
		Calendar fieldTime = Calendar.getInstance();
		fieldTime.setTime(date);
		fieldTime.add(Calendar.HOUR_OF_DAY, interval);
		try {
			if(!ValidationUtil.isEmpty(interval))
			{
				date = dateformat.parse(convertDate2String(fieldTime.getTime()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return date;
	}
	
	/**
	 * 获取当前时间，去除时间的时分秒
	 * 
	 */
	public static Date getCurrentDate(){
		String dateStr = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		Date date = UtilConverterDate.convertString2Date(dateStr, Constants.YYYY_MM_DD);
		return date;
	}
	
	/**
	 * 获取当前时间，去除时间的时分秒
	 * 
	 */
	public static Date getCurrentDatetime(){
		String dateStr = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").format(new Date());
		Date date = UtilConverterDate.convertString2Date(dateStr, Constants.YYYY_MM_DD_HH_MM_SS);
		return date;
	}
	
	/**
	 * 获取当前前一小时时间
	 * 
	 */
	public static Date getBeforeOneDatetime(){
		Date date = new Date();
		Calendar newTime = Calendar.getInstance();
		newTime.setTime(date);
		newTime.add(Calendar.HOUR_OF_DAY, -1);
		return newTime.getTime();
	}
	
	/**
	 * 获取当前前两小时时间
	 * 
	 */
	public static Date getBeforeTwoHourDatetime(){
		Date date = new Date();
		Calendar newTime = Calendar.getInstance();
		newTime.setTime(date);
		newTime.add(Calendar.HOUR_OF_DAY, -2);
		return newTime.getTime();
	}
	
	/**
	 * 获取当前前两天时间
	 * 
	 */
	public static Date getBeforeOneDayDatetime(){
		Date date = new Date();
		Calendar newTime = Calendar.getInstance();
		newTime.setTime(date);
		newTime.add(Calendar.DAY_OF_MONTH, -1);
		return newTime.getTime();
	}
	
	/**
	 * 
	 * 根据给定日期获取对前前后日期
	 * 
	 * @param currentDate	给定日期
	 * @param year			相差年
	 * @param month			相差月
	 * @param day			相差日
	 * @return
	 */
	public static Date getBeforeAfterDate(Date currentDate, int year, int month, int day)
	{
		Calendar cal = new GregorianCalendar();   
		cal.setTime(currentDate);   
		  
		int currentYear = cal.get(Calendar.YEAR);   
		int currentMonth = cal.get(Calendar.MONTH);   
		int currentDay = cal.get(Calendar.DAY_OF_MONTH);   
		  
		cal.set(Calendar.YEAR, currentYear + year);   
		cal.set(Calendar.MONTH, currentMonth + month);   
		cal.set(Calendar.DAY_OF_MONTH, currentDay + day);   
		  
		return new Date(cal.getTimeInMillis());
	}
	
	/**
	 * 获取当前时间，去除时间的时分秒
	 * 
	 */
	public static String getCurrentHourString(){
		String dateStr = new SimpleDateFormat("HH").format(new Date());
		// Date date = UtilConverterDate.convertString2Date(dateStr, Constants.YYYY_MM_DD);
		return dateStr;
	}
	
	/**
	 * 当前时间前一小时转字母字符串
	 * @param date Date
	 * @param converterDateStr String 
	 * @return
	 */
	public static String convertDate2ABCString(Date date){
		String dateStr = "";
		SimpleDateFormat sdf = new SimpleDateFormat("HH");
		Calendar fieldTime = Calendar.getInstance();
		fieldTime.setTime(date);
		fieldTime.add(Calendar.HOUR_OF_DAY, -1);
		int field = Integer.parseInt(sdf.format(fieldTime.getTime()));
		switch (field) {
			case 0:
				dateStr="a";
				break;
			case 1:
				dateStr="b";
				break;
			case 2:
				dateStr="c";
				break;
			case 3:
				dateStr="d";
				break;
			case 4:
				dateStr="e";
				break;
			case 5:
				dateStr="f";
				break;
			case 6:
				dateStr="g";
				break;
			case 7:
				dateStr="h";
				break;
			case 8:
				dateStr="i";
				break;
			case 9:
				dateStr="j";
				break;
			case 10:
				dateStr="k";
				break;
			case 11:
				dateStr="l";
				break;
			case 12:
				dateStr="m";
				break;
			case 13:
				dateStr="n";
				break;
			case 14:
				dateStr="o";
				break;
			case 15:
				dateStr="p";
				break;
			case 16:
				dateStr="q";
				break;
			case 17:
				dateStr="r";
				break;
			case 18:
				dateStr="s";
				break;
			case 19:
				dateStr="t";
				break;
			case 20:
				dateStr="u";
				break;
			case 21:
				dateStr="v";
				break;
			case 22:
				dateStr="w";
				break;
			case 23:
				dateStr="x";
				break;
		}
		return dateStr;
	}
	
	/**
	 * 起始日期转时间集合
	 * @param startTime	开始	日期
	 * @param endTime	结束日期
	 * @return
	 */
	public static List<Date> convertDate2BetweenList(String startTime, String endTime){
		List<Date> dateList = new ArrayList<Date>();
		try {
			long start = UtilConverterDate.convertString2Date(startTime, Constants.YYYY_MM_DD).getTime();
			long end = UtilConverterDate.convertString2Date(endTime, Constants.YYYY_MM_DD).getTime();
			long i;
			for(i=start; i<=end; i=i+86400*1000){
				Date date = new Date(i);
				dateList.add(date);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dateList;
	}
	
	/**
	 * 日期转时间间隔字符串集合
	 * @param startTime	开始	日期
	 * @param endTime	结束日期
	 * @return
	 */
	public static List<String> convertDate2BetweenStringList(String startTime, String endTime){
		List<String> dateList = new ArrayList<String>();
		try {
			long start = UtilConverterDate.convertString2Date(startTime, Constants.YYYY_MM_DD).getTime();
			long end = UtilConverterDate.convertString2Date(endTime, Constants.YYYY_MM_DD).getTime();
			long i;
			for(i=start; i<=end; i=i+86400*1000){
				Date date = new Date(i);
				dateList.add(convertDate2String(date, Constants.YYYY_MM_DD));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dateList;
	}
	
	/**
	 * 根据参数返回初始日期转字符串集合-YYYY_MM_DD
	 * @param int days 
	 * @return list
	 */
	public static List<String> convertDate2BetweenList(int days){
		SimpleDateFormat dateformat = new SimpleDateFormat(Constants.YYYY_MM_DD);
		Calendar fieldTime = Calendar.getInstance();
		List<String> list = new ArrayList<String>();
		try {
			if(!ValidationUtil.isEmpty(fieldTime))
			{
				for(int i=0; i<days; i++){
					if(i==0 || i==(days-1)){
						fieldTime.add(Calendar.DATE, -i);
						list.add(dateformat.format(fieldTime.getTime()));
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	/**
	 * 根据参数返回初始日期转字符串集合-YYYY_MM_DD HH
	 * @param int hour 
	 * @return list
	 */
	public static List<Object> convertHour2BetweenList(int hours){
		SimpleDateFormat dateformat = new SimpleDateFormat(Constants.YYYY_MM_DD_HH_MM_SS);
		Calendar fieldTime = Calendar.getInstance();
		List<Object> list = new ArrayList<Object>();
		try {
			if(!ValidationUtil.isEmpty(fieldTime))
			{
				for(int i=0; i<=hours; i++){
					fieldTime.add(Calendar.HOUR, -i);
					list.add(dateformat.format(fieldTime.getTime()));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	/**
	 * 根据时间返回int时刻
	 * @param  
	 * @return int
	 */
	public static int convertDate2int(){
		int field = 0;
		SimpleDateFormat sdf = new SimpleDateFormat("HH");
		Calendar fieldTime = Calendar.getInstance();
		Date date = new Date();
		try {
			fieldTime.setTime(date);
			// 根据需要算当前时刻 fieldTime.add(Calendar.HOUR_OF_DAY, -1);
			field = Integer.parseInt(sdf.format(fieldTime.getTime()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return field;
	}
	
	/**
	 * 日期转时间间隔年月日字符串集合
	 * @param startTime	开始	日期
	 * @param endTime	结束日期
	 * @return
	 */
	public static List<String> convertDate2BetweenDateList(String startTime, String endTime){
		List<String> dateList = new ArrayList<String>();
		try {
			long start = UtilConverterDate.convertString2Date(startTime, Constants.YYYY_MM_DD).getTime();
			long end = UtilConverterDate.convertString2Date(endTime, Constants.YYYY_MM_DD).getTime();
			long i;
			for(i=start; i<=end; i=i+86400*1000){
				Date date = new Date(i);
				dateList.add(convertDate2String(date, Constants.YYMMDD));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dateList;
	}
	
	/**
	 * 根据参数返回减一天的日期转字符串集合-YYYY_MM_DD
	 * @param int days 
	 * @return list
	 */
	public static String convertDateSubtract2String(String date){
		String dateStr = "";
		SimpleDateFormat dateformat = new SimpleDateFormat(Constants.YYYY_MM_DD);
		Calendar fieldTime = Calendar.getInstance();
		try {
			fieldTime.setTime(dateformat.parse(date));
			fieldTime.add(Calendar.DATE, 1);
			dateStr = dateformat.format(fieldTime.getTime());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dateStr;
	}
}
