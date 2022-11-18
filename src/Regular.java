import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular {

    boolean GUID(String list){
        Pattern pattern = Pattern.compile("^\\{?\\p{XDigit}{8}-\\p{XDigit}{4}-\\p{XDigit}{4}-\\p{XDigit}{4}-\\p{XDigit}{12}}?$");
        Matcher m = pattern.matcher(list);
        return m.matches();
    }

    boolean ip_Check(String list)
    {
        Pattern pattern = Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");
        Matcher m = pattern.matcher(list);
        return m.matches();
    }

}
