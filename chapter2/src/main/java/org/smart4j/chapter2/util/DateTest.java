package org.smart4j.chapter2.util;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.DateFormat;
import org.apache.commons.lang3.time.DateUtils;

public class DateTest {
    public static void main(String[] args){
        String beginTime = "2018-07-22 00:02:00";
        Date now = new Date();

        String endTime = "2018-07-22 00:00:00";
        DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        DateFormat format2 = new SimpleDateFormat("yyyyMMdd");
        try{
        Date begin =  format1.parse(beginTime);
        Date end = format1.parse(endTime);
//        String nowTime = ;
        Date nowTime = format1.parse(format1.format(now.getTime()));

                System.out.println(nowTime);

        Calendar  calendar = new GregorianCalendar();
        calendar.setTime(begin);
        calendar.add(calendar.DATE,2); //��������������һ��,����  ������,������ǰ�ƶ�
            begin=calendar.getTime(); //���ʱ���������������һ��Ľ��


            calendar.setTime(end);
            calendar.add(calendar.DATE,-2);
            end = calendar.getTime();



            //�Ƚ����ڴ�С
            System.out.println(
                    !DateUtils.isSameDay(begin, end));
            System.out.println(
                    begin.before(end));


            System.out.println(begin.toString());
            System.out.println(end.toString());
            System.out.println((int) ((begin.getTime() - end.getTime()) / 1000 / 60 / 60 / 24));
            System.out.println(3+"aa");
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }
}
