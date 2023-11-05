public class Symbol {
    public static void main(String[] args) {
        charExpression ('\\' + 'a');
    }
    public static char charExpression (int a) {
char symbol = '\\';
char b = (char) a;
char result = (char) ((char) symbol + a);
        System.out.println(result);
        return (char)('\\' + a);
    }
}
