package task1;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public final class Aufgabe1a {
    public static final String EXAMPLE_Input1 = "xxx %d yyy%n";
    public static final String EXAMPLE_Input1a = "xxdhhdx %c yiiibdyy%n";
    public static final String EXAMPLE_Input2 = "xxx%1$d yyy";
    public static final String EXAMPLE_Input3 = "%1$-02.3dyyy";
    static void stringFormatter(String EXAMPLE_Input)
    {
        // Für den Text alle Buchstaben mehrfach erlaubt
        String text = "[a-z ]*";
        //Startsymbol
        String start = "%";
        // Für die Flags, optional, mehrfach hintereinander möglich
        String flags =  "[-#+ 0,(]*";
        // Für den ArgumentIndex, optional, aber mehrfach möglich
        String argumentIndex = "([1-9][0-9]*\\$)*";
        // Die Width, optional (einmal oder keinmal)
        String width = "(\\d*)?";
        // Die Precision, optional (einmal oder keinmal)
        String precision = "(\\.\\d*)?";
        // Die verschiedenen Conversion Token
        String conversionToken = "[bBhHsScCdoxXeEfgGaAtT%n]";

        //regEx pattern zusammenbau
        //Pattern pattern = Pattern.compile("(%([1-9][0-9]*\\$)*[-#+ 0,(]*(\\d*)?(\\.\\d*)?[bBhHsScCdoxXeEfgGaAtT%n])|([a-z ]*)");
        Pattern pattern = Pattern.compile( start + argumentIndex + flags + width + precision + conversionToken +"|" + text);
        Matcher matcher = pattern.matcher(EXAMPLE_Input);

        while (matcher.find() && !matcher.group().equals("")) {
            if (matcher.group().startsWith(start))
                System.out.printf("FORMAT(%s)", matcher.group());
            else
                System.out.printf("TEXT(%s)", matcher.group());
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        stringFormatter(EXAMPLE_Input1);
        stringFormatter(EXAMPLE_Input1a);
        stringFormatter(EXAMPLE_Input2);
        stringFormatter(EXAMPLE_Input3);
    }
}
