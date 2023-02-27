public class Main {
    public static void main(String[] args) {
        char[] stringArray = {'s', 't', 'r', 'i', 'n', 'g'};
        String string = new String(stringArray);
        System.out.println(string);

        String myString = "Hello World";
        System.out.println(myString.length());
        System.out.println(myString.charAt(4));
        //El método concat solo nos permite concatenar strings
        System.out.println(myString.concat("!"));
        //En cambio, usando el operador "+" podemos concatenar distintos tipos de objetos y variables
        //Cada vez que agregamos un "+", estamos guardando un string nuevo en el espacio de la memoria
        System.out.println(myString + "!");

        String mySecondString = new String("Goodbye");
        System.out.println(mySecondString);
    }
}
