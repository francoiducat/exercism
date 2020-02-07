 class ReverseString {


  String reverse(String inputString) {
    return new StringBuilder(inputString).reverse().toString();
  }

  public static String reverseWithForLoop(String inputString) {

    String[] chars = inputString.split("");
    String outputString = "";

    for(int i=chars.length-1; i>=0; i--) {
      outputString += chars[i];
    }
    System.out.println("outputString = " + outputString);
    return outputString;
  }
}
