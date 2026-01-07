import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Set<String> st = new TreeSet<>(Comparator.comparing(String::length));
    //    st.add("test1");
       st.add("act");
       st.add("test2");
       System.out.println(st);
    }
}
