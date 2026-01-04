package com.Leet;

import java.util.Stack;

public class EvaluateReversePolishNotation {

    private static int findValue(String[] s){
        Stack<Integer> st = new Stack<>();
        for(String ss:s){
            if(isSymbol(ss)){
                int a = st.pop();
                int b = st.pop();
                st.push(Evaluate(ss,a,b));
            }
            else{
                st.push(Integer.parseInt(ss));
            }
        }
        return st.pop();
    }

    private static int Evaluate(String symbol, int a, int b){
        switch (symbol) {
            case "+":  return a+b; 
            case "-":  return a-b;
            case "*":  return a*b;
            case "/":  return a/b;
            default: throw new IllegalArgumentException("Invalid operator");
        }
    }

    private static boolean isSymbol(String p){
        return p.equals("+")|| p.equals("-")||p.equals("*")||p.equals("/");
    }

    public static void main(String[] args) {
        String[] s = {"2","2","+","2","*"};
        System.out.println(findValue(s));
    }
}
