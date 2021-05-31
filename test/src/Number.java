public class Number {

    private String sign;
    private Integer value;
    private String before_bracket = "(";
    private String after_bracket = ")";

    public Number() {
        this.sign = sign;
        this.value = value;

    }


    public String getBefore_bracket() {
        return before_bracket;
    }

    public void setBefore_bracket(String before_bracket) {
        before_bracket = ")";
        this.before_bracket = before_bracket;
    }

    public String getAfter_bracket() {
        return after_bracket;
    }

    public void setAfter_bracket(String after_bracket) {
        after_bracket = "(";
        this.after_bracket = after_bracket;
    }

    public Number(String sign, Integer value) {
        this.sign = sign;
        this.value = value;
        System.out.println("sign " + getSign() + ", value = " + getValue());
    }

    public static Number computeAdditionAndSubtraction(Number number_one, Number number_two) {
        int result = 0;
        String resultSign = "";
        Number no = new Number();

        // case when both number's signs are same
        if (number_one.getSign().equals(number_two.getSign())) {
            //case when we have addition
            if (number_one.getSign().equals("+")) {
                result = number_one.getValue() + number_two.getValue();
                resultSign = number_one.getSign();
            }
            //case when we have subtraction
            else {
                result = number_one.getValue() + number_two.getValue();
                resultSign = number_one.getSign();
            }
        }
        // case when both number's signs are different
        else {
            //case when second number's sign is '-' and it is less the first one
            if (number_two.getSign().equals("-")) {
                if (number_one.getValue() > number_two.getValue()) {
                    result = number_one.getValue() - number_two.getValue();
                    resultSign = number_one.getSign();
                } else {
                    result = number_two.getValue() - number_one.getValue();
                    resultSign = number_two.getSign();
                }
            }
            //case when first number's sign is '-' and first is less the second one
            else {
                if (number_one.getValue() < number_two.getValue()) {
                    result = number_two.getValue() - number_one.getValue();
                    resultSign = number_two.getSign();
                }
                //case when first number's sign is '-' and second is less the first one
                else {
                    result = number_one.getValue() - number_two.getValue();
                    resultSign = number_one.getSign();
                }
            }
/*            if (number_one.getValue() < number_two.getValue()) {
                resultSign = number_two.getSign();
            } else {
                resultSign = number_one.getSign();
            }*/
        }

        no.setValue(result);
        no.setSign(resultSign);

        return no;
    }

    public static Number computeMultiplicationAndDivision(Number number_one, Number number_two) {
        int result = 0;
        String resultSign = "";
        Number no = new Number();

        //case when we have multiplication
        if (number_two.getSign().equals("*")) {
            result = number_one.getValue() * number_two.getValue();
            resultSign = number_one.getSign();
        }
        //case when we have division
        if (number_two.getSign().equals("/")) {
            result = number_one.getValue() / number_two.getValue();
            resultSign = number_one.getSign();
        }

        no.setValue(result);
        no.setSign(resultSign);
        return no;
    }



    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
