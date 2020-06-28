package Task3_calculator;

public class Calculator
{

    private void calculate(String expression) {
        double num1; //первое число
        double num2; // второе число
        double result = 0;  // результат

        char operation = ' ';
        char[] actions = {'+', '-', '*', '/'};   //массив действий
        for (char znak : actions) {
            if (expression.indexOf(znak) != -1) {
                operation = znak;
            }
        }
        num1 = Double.valueOf(expression.substring(0, expression.indexOf(operation)));  //достаем из строки, подстроку. переводим и возвращаем тип Double
        num2 = Double.valueOf(expression.substring(expression.indexOf(operation) + 1));  //достаем из строки, подстроку. переводим и возвращаем тип Double
        switch (operation) {      // проверяем какой знак указан в строке
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
        }
        System.out.println(result);
    }

        public static void main(String[] args) {
            Calculator example = new Calculator();

            example.calculate("100+222");
            example.calculate("222/2");
            example.calculate("51*4");
            example.calculate("2-7");

        }
}

