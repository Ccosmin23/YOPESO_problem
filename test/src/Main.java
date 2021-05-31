public class Main {

    public static void main(String[] args) {
        Number n2 = new Number();
        Number n3 = new Number();
        Number n4 = new Number();
        Number result = new Number();
        Number resultNumber = new Number();
        Number resultNumber2 = new Number();

        //Equation e = new Equation("10 + 5 - 3 - 4 + 6");
        //Equation e = new Equation(" - 10 + 15 - 3 - 4 + 14 ");
        Equation e = new Equation(" 10 + 5 - 3 * ( 4 + 6 ) ");
        Equation e1 = new Equation();


        System.out.println("\nList of Numbers");
        for (Number n : e.getEquation()) {
            System.out.println("sign " + n.getSign() + ", number " + n.getValue());
        }


/*        System.out.println("\n\nLet's compute the numbers");
        n2 = e.getEquation().get(0);
        n3 = e.getEquation().get(1);
        resultNumber = Number.computeAdditionAndSubtraction(n2, n3);
        System.out.println("sign " + resultNumber.getSign() + ", value " + resultNumber.getValue());*/

        /*
         * ToDo: remove comments below
         * */
        //traverse the input to compute multiplication and division
        for (int i = 0; i < e.getEquation().size(); i++) {
            n3 = e.getEquation().get(i);

            if (n3.getSign().equals("*")) {
                n2 = e.getEquation().get(i - 1);
                resultNumber = Number.computeMultiplicationAndDivision(n2, n3);
                //System.out.println("\nsign " + resultNumber.getSign() + ", value " + resultNumber.getValue());
                e.getEquation().set(i - 1, resultNumber);
                e.getEquation().remove(i);
                //n3.setValue(0);
            } else if (n3.getSign().equals("/")) {
                n2 = e.getEquation().get(i - 1);
                resultNumber = Number.computeMultiplicationAndDivision(n2, n3);
                //System.out.println("\nsign " + resultNumber.getSign() + ", value " + resultNumber.getValue());
                e.getEquation().set(i - 1, resultNumber);
                e.getEquation().remove(i);
                //n3.setValue(0);
            }else if(n3.getSign().equals("(")){
                n2 = e.getEquation().get(i+1);
                n4 = e.getEquation().get(i-1);
                n3.setSign("+");
                resultNumber = Number.computeAdditionAndSubtraction(n2, n3);
                resultNumber.setSign("*");
                e.getEquation().remove(i);

                n4 = e.getEquation().get(i-1);
                resultNumber2 = Number.computeMultiplicationAndDivision(n4, resultNumber);
                e.getEquation().get(i-1).setValue(resultNumber2.getValue());
                e.getEquation().get(i-1).setSign(resultNumber2.getSign());

                e.getEquation().remove(i);

            }
            //System.out.println("sign " + resultNumber.getSign() + ", value " + resultNumber.getValue());
        }

        //traverse the input to compute addition and subtraction
        System.out.println("\nLast result without brackets");
        n2 = e.getEquation().get(0);
        for (int i = 1; i < e.getEquation().size(); i++) {
            n3 = e.getEquation().get(i);
            if (n3.getSign().equals("+")) {
                //n2 = e.getEquation().get(i);
                resultNumber = Number.computeAdditionAndSubtraction(n2, n3);
                //System.out.println("sign " + resultNumber.getSign() + ", value " + resultNumber.getValue());
            }
            else {
                resultNumber = Number.computeAdditionAndSubtraction(n2, n3);
                // System.out.println("sign " + resultNumber.getSign() + ", value " + resultNumber.getValue());
            }
            n2 = resultNumber;
        }
        System.out.println("sign " + n2.getSign() + ", result " + n2.getValue());

        /*
         * ToDo: add brackets
         * */
/*        System.out.println("\n\nlet's see some results:");
        for (int i = 0; i < e.getEquation().size(); i++) {
            n2 = e.getEquation().get(i);
            if (n2.getSign().equals("(")) {
                n2.setSign("+");
                n3 = e.getEquation().get(i + 1);
                resultNumber = Number.computeAdditionAndSubtraction(n2, n3);
                e.getEquation().set(i, resultNumber);
                e.getEquation().remove(i+1);
            }
            System.out.println(resultNumber.getValue());
        }*/











/*        System.out.println("\nnumbers remained in the input =");
        for (int i = 0; i < e.getEquation().size(); i++) {
            System.out.println( e.getEquation().get(i).getValue()+ " ");
        }*/







       /* for (int i = 0; i < e.getEquation().size(); i++) {
            n2 = e.getEquation().get(i);
            n3 = e.getEquation().get(i + 1);
            resultNumber = Number.computeMultiplicationAndDivision(n2, n3);
        }*/





/*        System.out.println("\n\nLet's compute one more time the numbers");
        n2 = e.getEquation().get(4);
        n3 = e.getEquation().get(5);
        resultNumber = Number.computeMultiplicationAndDivision(n2, n3);
        System.out.println("sign " + resultNumber.getSign() + ", value " + resultNumber.getValue());*/



        /*

            n2 = e.getEquation().get(0);
            n3 = e.getEquation().get(1);
            resultNumber = Number.computeNumbers(n2, n3);
            System.out.println("sign " + resultNumber.getSign() + ", value " + resultNumber.getValue());

            n2 = resultNumber;
            n3 = e.getEquation().get(2);
            resultNumber = Number.computeNumbers(n2, n3);
            System.out.println("sign " + resultNumber.getSign() + ", value " + resultNumber.getValue());

            n2 = resultNumber;
            n3 = e.getEquation().get(3);
            resultNumber = Number.computeNumbers(n2, n3);
            System.out.println("sign " + resultNumber.getSign() + ", value " + resultNumber.getValue());

            n2 = resultNumber;
            n3 = e.getEquation().get(4);
            resultNumber = Number.computeNumbers(n2, n3);
            System.out.println("sign " + resultNumber.getSign() + ", value " + resultNumber.getValue());*/
        //}

        //equation.add(n1);

    }

















/*
    //private static final String str = " 10 + 5 - 3 - 4 + 6 ";
    private static final String str = " 10 + 5 - 3 - 4 + 6 ";

    private static final Pattern pattern = Pattern.compile("[[0-9]+\s]+[\s+\s0-9]+[\s[-]\s0-9]+[\s+\s[0-9]]+");

    private static final Matcher matcher = pattern.matcher(str);



    public static void main(String[] args) {

        if (matcher.find()) {
            System.out.println("match found with value =" + matcher.group());
        } else {
            System.out.println("match not found");
        }
    }
*/


}
