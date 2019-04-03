package com.leetcode;

import java.util.*;

public class phongnum {

    Map<String,String[]> num=new HashMap<String,String[]>();
    public static void main(String[] args) {


        System.out.println(Arrays.toString(getnum("1234578")));

    }


    public List<String> letterCombinations(String digits) {

        List<String> temp=new ArrayList<String>();

        num.put("2",new String[]{"a","b","c"});
        num.put("3",new String[]{"d","e","f"});
        num.put("4",new String[]{"g","h","i"});
        num.put("5",new String[]{"j","k","l"});
        num.put("6",new String[]{"m","n","o"});
        num.put("7",new String[]{"p","q","r","s"});
        num.put("8",new String[]{"t","u","v"});
        num.put("9",new String[]{"w","x","y","z"});


    return null;

    }

    public static List<String>  let(String [] nums){



        for (int i = 0; i < nums.length-1; i++) {

        }


        return null;
    }

    public static String[] getnum(String digits){
        char[] chars = digits.toCharArray();
         List<String> temp=new ArrayList<>();
        for (char aChar : chars) {
            if (aChar=='1'||aChar=='0'){
                continue;
            }
            temp.add(String.valueOf(aChar));
        }
        return  temp.toArray(new String[0]);

    }
}
