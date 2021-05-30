public class Number {

    private String sign;
    private Integer value;

    public Number() {
        this.sign = sign;
        this.value = value;
    }

    public Number(String sign, Integer value) {
        this.sign = sign;
        this.value = value;
        System.out.println("sign " + getSign() + ", value = " + getValue());
    }

    public static Number computeNumbers(Number number_one, Number number_two) {
        int result = 0;
        String resultSign = "";
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

        Number no = new Number();
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
