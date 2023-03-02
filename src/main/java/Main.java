public class Main {
    public static void main(String[] args) {
        //Los strings son inmutables
        char[] stringArray = {'s', 't', 'r', 'i', 'n', 'g'};
        var string = new String(stringArray);
        System.out.println(string);

        String myString = "Hello World";
        System.out.println(myString.length());
        System.out.println(myString.charAt(4));
        //El método concat solo nos permite concatenar strings
        System.out.println(myString.concat("!"));
        //En cambio, usando el operador "+" podemos concatenar distintos tipos de objetos y variables
        //Cada vez que agregamos un "+", estamos guardando un string nuevo en el espacio de la memoria
        System.out.println(myString + "!");

        var mySecondString = new String("Goodbye");
        System.out.println(mySecondString);

        //Los StringBuffers son mutables y las operaciones son en orden siempre ya que no se crean nuevos threads
        var stringBuffer = new StringBuffer("Hello World");
        System.out.println(stringBuffer);
        stringBuffer.append("!");
        System.out.println(stringBuffer);
        stringBuffer.insert(5, "oo");
        System.out.println(stringBuffer);
        stringBuffer.replace(0, 7, "Hey there,");
        System.out.println(stringBuffer);
        stringBuffer.delete(9, 16);
        System.out.println(stringBuffer);
        stringBuffer.reverse();
        System.out.println(stringBuffer);
    }
}
