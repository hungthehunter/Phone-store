package service;


import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

public class Formater {
    public static String FormatVND(double vnd) {
        DecimalFormat formatter = new DecimalFormat("###,###,###");
        return formatter.format(vnd) + "đ";
    }
    
    public static String FormatTime(java.sql.Timestamp timestamp) {
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/YYYY HH:mm");
        return formatDate.format(timestamp);
    }
    
    public static String FormatMoney(double vnd) {
        DecimalFormat formatter = new DecimalFormat("#########");
        return formatter.format(vnd);
    }
}
