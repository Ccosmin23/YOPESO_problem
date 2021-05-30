public class Main {

    public static void main(String[] args) {
        Number n2 = new Number();
        Number n3 = new Number();
        Number result = new Number();
        Number resultNumber;

        //Equation e = new Equation("10 + 5 - 3 - 4 + 6");
        Equation e = new Equation("10 + 5 - 3 - 4 + 6");
        Equation e1 = new Equation();


        System.out.println("\nList of Numbers");
        for (Number n : e.getEquation()) {
            System.out.println("sign " + n.getSign() + ", number " + n.getValue());
        }


        System.out.println("\nLet's compute the numbers");
        n2 = e.getEquation().get(0);
        n3 = e.getEquation().get(1);
        resultNumber = Number.computeNumbers(n2, n3);
        System.out.println("sign " + resultNumber.getSign() + ", value " + resultNumber.getValue());

        for (int i = 2; i < e.getEquation().size(); i++) {
            n2 = resultNumber;
            n3 = e.getEquation().get(i);
            resultNumber = Number.computeNumbers(n2, n3);
            System.out.println("sign " + resultNumber.getSign() + ", value " + resultNumber.getValue());

        }
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
