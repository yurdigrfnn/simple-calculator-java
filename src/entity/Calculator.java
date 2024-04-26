package entity;

public class Calculator {
    private double operand1;
    private double operand2;
    private String operator;
    private int result;

    public Calculator(double oprn1,double oprn2, String opt){
        this.operand1 = oprn1;
        this.operand2 = oprn2;
        this.operator = opt;
    }

    public Calculator(){

    }



    public double getOperand1() {
        return operand1;
    }

    public void setOperand1(double operand1) {
        this.operand1 = operand1;
    }

    public double getOperand2() {
        return operand2;
    }

    public void setOperand2(double operand2) {
        this.operand2 = operand2;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
