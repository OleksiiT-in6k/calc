package com.interlink;

/**
 * Created by employee on 7/8/16.
 */
public class calcFunctions {

    public static final String DEFAULT_DELIMITER = "\n|,";
    public static final String DEFAULT_TECH_SYMBOL = "//";

    public static int sum(String input) {
        String delimiter= DEFAULT_DELIMITER;
        int result=0;
        if (input.equals(""))return 0;
        if (input.length()>2) {
            String techSymbols = input.substring(0, 2);
            if(techSymbols.equals(DEFAULT_TECH_SYMBOL)) {
                String customDelimiter = input.substring(techSymbols.length()).split("\n", 0)[0];
                delimiter += "|" + customDelimiter;
                input=input.substring(customDelimiter.length()+techSymbols.length()+1);
            }
        }

        if(input.contains(",")||input.contains("/n")||!delimiter.equals(DEFAULT_DELIMITER)) {
            result=0;
            for(String s1:input.split(delimiter))
                result+=Integer.parseInt(s1);
        }
        else
        if(delimiter.equals(DEFAULT_DELIMITER))
        result=Integer.parseInt(input);
    return result;
    }
}
