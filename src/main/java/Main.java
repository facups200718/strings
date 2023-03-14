public class Main {
    public static void main(String[] args) {
        //Los strings son inmutables.
        char[] stringArray = {'s', 't', 'r', 'i', 'n', 'g'};
        var string = new String(stringArray);
        System.out.println(string);

        String myString = "Hello World";
        System.out.println(myString.length());
        System.out.println(myString.charAt(4));
        //El método concat solo nos permite concatenar strings.
        System.out.println(myString.concat("!"));
        //En cambio, usando el operador "+" podemos concatenar distintos tipos de objetos y variables.
        //Cada vez que agregamos un "+", estamos guardando un string nuevo en el espacio de la memoria.
        System.out.println(myString + "!");

        var mySecondString = new String("Goodbye");
        System.out.println(mySecondString);

        //Los StringBuffers son mutables y las operaciones son en orden siempre ya que no se crean nuevos threads.
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

        var stringBuffer2 = new StringBuffer("Hello World");
        stringBuffer2.append("!").insert(5, "oo").replace(0, 7, "Hey there,").delete(9, 16).reverse();
        System.out.println(stringBuffer2);

        //Los StringBuilders son como los StringBuffers pero mas eficientes.
        //El tema es que varios threads pueden acceder a sus operaciones en simultáneo, no garantizando que se ejecuten en orden.
        //O sea, la clase StringBuilder es la clase String pero mutable.
        var stringBuilder = new StringBuilder("Hello world");
        System.out.println(stringBuilder);
        //También tenemos los métodos append, insert, replace, y delete.

        String stringMethodsTestString = "Hello world";
        System.out.println(stringMethodsTestString.charAt(0));
        System.out.println(stringMethodsTestString.length());
        System.out.println(stringMethodsTestString.toUpperCase());
        System.out.println(stringMethodsTestString.toLowerCase());
        System.out.println(stringMethodsTestString.substring(6));
        System.out.println(stringMethodsTestString.substring(0, 5));
        System.out.println(stringMethodsTestString.trim());
        System.out.println(stringMethodsTestString.indexOf('w'));
        System.out.println(stringMethodsTestString.lastIndexOf('o'));
        System.out.println(stringMethodsTestString.concat("! Today is a beautiful day to learn Java Strings."));

        String str1 = "Hello";
        String str2 = "my";
        String str3 = "friends";
        String str4 = String.join(" ", str1, str2, str3);
        System.out.println(str4);
        System.out.println(str4.toUpperCase().contains("IE"));
        System.out.println(str4.replace("Hello", "Howdy"));
        System.out.println(str4.equalsIgnoreCase("heLLo My FrIends"));

        //Java escaping characters
        System.out.println("She smiled and said \"hello!\"");
        System.out.println("The file is in \n C:\\Documents\\Files");
        System.out.println("Copyright \u00A9 2023");

        //Java Formatter
    }
}
