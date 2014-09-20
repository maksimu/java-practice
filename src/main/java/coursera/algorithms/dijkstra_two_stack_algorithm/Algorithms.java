package coursera.algorithms.dijkstra_two_stack_algorithm;

import java.util.Stack;

/**
 *
 * ■ Push operands onto the operand stack.
 * ■ Push operators onto the operator stack.
 * ■ Ignore left parentheses.
 * ■ On encountering a right parenthesis, pop an operator, pop the requisite number of operands, and push onto the operand stack the result of applying that operator to those operands.
 *
 *
 * Created by maksimustinov on 9/19/14.
 */
public class Algorithms {

    Stack<Double> numStack = new Stack<Double>();
    Stack<Character> oprStack = new Stack<Character>();


    public String dijkstraTwoStackAlgorithmCalc(String eq){

        System.out.println("Evaluatng: " + eq);
        char[] eqArray = eq.toCharArray();


        for(int count = 0; count < eqArray.length; count++){
            Character ch = eqArray[count];

            if(Character.isDigit(ch)){
                System.out.println("Is a digit: " + ch);
                numStack.push(Double.parseDouble(ch.toString()));
            } else if(ch == '+' || ch == '-' || ch == '/' || ch == '*'){
                System.out.println("Is an operator: " + ch);
                oprStack.push(ch);
            } else if(ch == ')'){
                doOperation();
            } else {
                System.out.println("Ignoring: [" + ch + "]");
            }
        }

        // Clean up the last one
        while (numStack.size() > 1){
            doOperation();
        }

        return numStack.pop().toString();

    }

    private void doOperation(){
        Double secondParam = numStack.pop();   // get last (ex. if I have 2/1 here I'll get 1)
        Double firstParam = numStack.pop();   // get before last (ex. if I have 2/1 here i'll get 2)
        Character oper = oprStack.pop();

        if (oper.equals('*')){
            Double m = Double.parseDouble(firstParam.toString()) * Double.parseDouble(secondParam.toString());
            numStack.push(m);
        } else if (oper.equals('/')) {
            Double d = firstParam / secondParam;
            numStack.push(d);
        } else if (oper.equals('+')) {
            Double s = firstParam + secondParam;
            numStack.push(s);
        } else if (oper.equals('-')) {
            Double subtr = firstParam - secondParam;
            numStack.push(subtr);
        }
    }



}
