package com.example.template;

public class SimpleExpression {
    private Integer operand1;
    private Integer operand2;
    private String operator;

    public SimpleExpression() {
        operand1 = 0;
        operand2 = 0;
        operator = "+";
    }

    public Integer getOperand1() {
        return operand1;
    }

    public void setOperand1(Integer operand1) {
        this.operand1 = operand1;
    }

    public Integer getOperand2() {
        return operand2;
    }

    public void setOperand2(Integer operand2) {
        this.operand2 = operand2;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Integer getValue(){
        Integer  value = 0;
        switch(operator){
            case "+":
                value = operand1 + operand2;
                break;
            case "-" :
                value = operand1 - operand2;
                break;
            case "x":
                value = operand1 * operand2;
                break;
            case "/":
                value = operand1 / operand2;
                break;
            case "%":
                value = operand1 % operand2;
                break;
        }
        return value;
    }

    public void clearOperands(){
        operand1 = 0;
        operand2 = 0;
    }
}
