public class Main {
  static void method(String fname) {
    System.out.println(fname + "Lefort");
  }  //Method can be declared after and used before
  public static void main(String[] args) {
    String name = "Kimi";
    final int number = 17; //final == const in js, cannot be changed after
    /* number = 21; */
    float myFloatNum = 5.99f;
    /* int x = 4, y = 7, z = 9; */
    int x, y, z;
    x = y = z = 40;

    char myLetter = 'D'; //Must be single quotes
    boolean myBool = true;
    float f1 = 35e3f;
    double d1 = x; //40 to 40,0

    String sentence = "This sentence has for entire purpose testing";

    String lastname = "Lefort";

    System.out.println(name.concat(lastname));
    System.out.println(sentence.indexOf("(testing)")); //finds word in sentence
    System.out.println("Hello World!"); //Must be double quotes
    System.out.println(4);
    System.out.println(4 * 6);
    System.out.println(x + y + z);
    System.out.println(f1);
    System.out.println(d1);
    System.out.println("Hello " + name + name.length());
    System.out.println("Hello " + name + name.toUpperCase());
    System.out.println("Hello " + name + name.toLowerCase());
    System.out.println(number);
    System.out.println(x);
    System.out.println(y);
    System.out.println(z);
    System.out.println(myFloatNum);
    System.out.println(myLetter);
    System.out.println(myBool);

    String[] names = {"kimi", "valentin", "rosalie", "stéphane", "justine"};

    names[0] = "okly";

    System.out.println(names.length);

    for (String i : names) {
      System.out.println(i);
    };

    int[][] numberMulti = { {1, 2, 3, 4}, {5, 6, 7, 8}};

    System.out.println(numberMulti[1][1]);

    method("Kimi");
  }
}




/*
    Names can contain letters, digits, underscores, and dollar signs
    Names must begin with a letter
    Names should start with a lowercase letter and it cannot contain whitespace
    Names can also begin with $ and _ (but we will not use it in this tutorial)
    Names are case sensitive ("myVar" and "myvar" are different variables)
    Reserved words (like Java keywords, such as int or boolean) cannot be used as names


    Data Type 	Size 	    Description
    
    byte 	       1 byte 	Stores whole numbers from -128 to 127
    short 	     2 bytes 	Stores whole numbers from -32,768 to 32,767
    int 	       4 bytes 	Stores whole numbers from -2,147,483,648 to 2,147,483,647
    long 	       8 bytes 	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    float 	     4 bytes 	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
    double 	     8 bytes 	Stores fractional numbers. Sufficient for storing 15 decimal digits
    boolean 	   1 bit 	  Stores true or false values
    char 	       2 bytes 	Stores a single character/letter or ASCII values


    Code 	Result

    \n 	  New Line 	
    \r 	  Carriage Return 	
    \t 	  Tab 	
    \b 	  Backspace 	
    \f 	  Form Feed



    The ASCII Character Set *not so important but cool to have(saved in FireFox)
*/