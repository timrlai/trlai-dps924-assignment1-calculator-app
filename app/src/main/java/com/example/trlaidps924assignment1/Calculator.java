package com.example.trlaidps924assignment1;

import android.widget.Button;

import java.util.ArrayList;

public class Calculator {
    ArrayList<String> characters = new ArrayList<String>(20);

    void push(String value) {
        characters.add(value);
    }

    int performCalculation(int leftNum, String operator, int rightNum) {
        int result = 0;

        switch (operator) {
            case "+":
                result = leftNum + rightNum;
                break;
            case "-":
                result = leftNum - rightNum;
                break;
            case "*":
                result = leftNum * rightNum;
                break;
            case "/":
                result = leftNum / rightNum;
                break;
            case "%":
                result = leftNum % rightNum;
                break;
            case "pow":
                result = (int) Math.pow(leftNum, rightNum);
                break;
            case "max":
                result = Math.max(leftNum, rightNum);
                break;
            case "min":
                result = Math.min(leftNum, rightNum);
                break;
            default:
                result = -999;
        }

        return result;
    }

    int calculate() {
        int result = -999;

        if (characters.size() > 2) {
            for (int i = 0; i < characters.size(); i++) {
                if (i == 0) {
                    String leftChar = characters.remove(0);
                    String middleChar = characters.remove(0);
                    String rightChar = characters.remove(0);

                     if (leftChar.matches("[0-9]") && middleChar.matches("[+\\-*/%]|(pow)|(max)|(min)") && rightChar.matches("[0-9]")) {
                         int leftNum = Integer.parseInt(leftChar);
                         int rightNum = Integer.parseInt(rightChar);

                         result = performCalculation(leftNum, middleChar, rightNum);
                     } else {
                         return result;
                     }
                } else {
                    String middleChar = characters.remove(0);
                    String rightChar = characters.remove(0);

                    if (middleChar.matches("[+\\-*/%]|(pow)|(max)|(min)") && rightChar.matches("[0-9]")) {
                        int rightNum = Integer.parseInt(rightChar);

                        result = performCalculation(result, middleChar, rightNum);
                    } else {
                        return result;
                    }
                }
            }
        }

        characters.clear();

        return result;
    }
}
