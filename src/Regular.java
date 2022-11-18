import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular {

    boolean GUID(String list){
        Pattern pattern = Pattern.compile("^\\{?\\p{XDigit}{8}-\\p{XDigit}{4}-\\p{XDigit}{4}-\\p{XDigit}{4}-\\p{XDigit}{12}}?$");
        Matcher m = pattern.matcher(list);
        return m.matches();
    }

}
