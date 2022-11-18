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

    boolean URL(String list){
        Pattern pattern = Pattern.compile("^(https?\\:\\/\\/)?(\\w+\\.)*[0-9A-Za-z][0-9A-Za-z]+\\.\\w{1,3}(\\:\\d+)?((\\/\\w+)+\\.\\w+)?(\\?\\w+=\\w+(&\\w+=\\w+)*)?(\\#\\w+)?$");
        Matcher m = pattern.matcher(list);
        return m.matches();
    }

    boolean Password(String list){
        Pattern pattern = Pattern.compile("(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])[0-9A-Za-z_]{8,}");
        Matcher m = pattern.matcher(list);
        return m.matches();
    }

}
