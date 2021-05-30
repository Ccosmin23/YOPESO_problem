import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Equation {

    private final List<Number> equation= new ArrayList<>();;
    private Number number;


    public Equation(String input) {
        this.setEquation(input);

    }

    public Equation() {
        //this.equation = new ArrayList<>();
    }

    public List<Number> getEquation() {
        return equation;
    }

    public void setEquation(String input) {
        Pattern pattern = Pattern.compile("[[-+0-9]+\s]+[\s+\s0-9]+[\s[-]\s0-9]+[\s+\s[0-9]]+");
        Pattern space_splitter = Pattern.compile("\s");
        Pattern sign_splitter = Pattern.compile("[\s+-]+[\s]+");

        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            System.out.println("match found with value =" + matcher.group());
        } else {
            System.out.println("match not found within constructor equation");
        }

        System.out.println("\ninput =" + input);
        String[] str = space_splitter.split(input, 100);

        System.out.print("\nstring without spaces =");
        for (String s : str) {
            System.out.print(s);
        }


        System.out.println("\nstr[1] =" + str[1]);
        System.out.println("string_length = " + str.length + "\n");

        try {
            // only that case when we got as input, a string without space in front of the first number
            // for this case we will assign '+' sign for that number
            if (Integer.valueOf(str[0]) instanceof Integer) {
                number = new Number("+", Integer.valueOf(str[0]));
                this.equation.add(number);
            }
            /*if (str[0] == "-") {
                System.out.println("\na gasit un minus");
                number = new Number("-", Integer.valueOf(str[2]));
                //System.out.println("\nnu exista spatiu inaintea numarului, deci punem un '+'");
            }*/
        } catch (NumberFormatException e) {
            /*if (str[1] == "-") {
                System.out.println("\na gasit un minus");
                number = new Number("-", Integer.valueOf(str[0]));
            }*/
        }


        for (int i = 2; i < str.length; i++) {
            try {
                if (str[i].isEmpty()) {
                    System.out.println("exists whitespace");
                }
                if (!(Integer.valueOf(str[i]) instanceof Integer)) {
                    if (str[i - 1] == null) {
                        number = new Number("+", Integer.valueOf(str[i]));
                        this.equation.add(number);
                    }

                    number = new Number(str[i - 1], Integer.valueOf(str[i]));
                    this.equation.add(number);
                }
                number = new Number(str[i - 1], Integer.valueOf(str[i]));
                this.equation.add(number);

            } catch (NumberFormatException e) {
                //continue;
            }

        }

        //this.equation.add(number);
    }

    public Number getNumber() {
        return number;
    }

    public void setNumber(Number number) {
        this.number = number;
    }


}
