import java.util.*;

public class lexical_analysis {
  public static ArrayList<String> getRawWords(String s) 
  {
    String[]  s2 = s.split(" ");
    ArrayList<String> words = new ArrayList<String>();
    
    for(int x =0; x< s2.length;x++)
    {
      words.add(s2[x]);
    }
    return words;
  }
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter all the string : ");
    ArrayList<String> inputs = new ArrayList<String>();
    
    while (sc.hasNext()){
      inputs.add(sc.nextLine());
      if(sc.hasNext("end")) {
        break;
      }
    }
    String sentence = "";
    ArrayList<String> finalInput = new ArrayList<String>();
    for(int counter = 0; counter<inputs.size(); counter++){
      sentence = inputs.get(counter);
      finalInput.addAll(getRawWords(sentence));
    }    
    
//    block a
    String[] keywordArray = new String[] {"int", "float", "double", "while", "for", "if", "else"};
    String[] keywordArray1 = new String[10];
    for (int i= 0, j = 0; i<keywordArray.length; i++){
      if(finalInput.contains(keywordArray[i])){
        keywordArray1[j] = keywordArray[i];
        j++;
      }
    }
    System.out.print("Keywords: ");
    for(int count = 0; count<keywordArray1.length; count++){
      if(keywordArray1[count]!= null)
        System.out.print(keywordArray1[count]+ ",");
    }
    
//    block b
    String[] identiArray = new String[] {"a", "b", "c", "d", "e", "f"};
    String[] identiArray1 = new String[10];
    for (int i= 0, j = 0; i<identiArray.length; i++){
      if(finalInput.contains(identiArray[i])){
        identiArray1[j] = identiArray[i];
        j++;
      }
    }
    System.out.println();
    System.out.print("Identifiers: ");
    for(int count = 0; count<identiArray1.length; count++){
      if(identiArray1[count]!= null)
        System.out.print(identiArray1[count]+ ",");
    }
    
//    block c
    String[] mathOperatorsArray = new String[] {"+", "-", "*", "=", "%"};
    String[] mathOperatorsArray1 = new String[10];
    for (int i= 0, j = 0; i<mathOperatorsArray.length; i++){
      if(finalInput.contains(mathOperatorsArray[i])){
        mathOperatorsArray1[j] = mathOperatorsArray[i];
        j++;
      }
    }
    System.out.println();
    System.out.print("Math Operators: ");
    for(int count = 0; count<mathOperatorsArray1.length; count++){
      if(mathOperatorsArray1[count]!= null)
        System.out.print(mathOperatorsArray1[count]+ ",");
    }
    
    //    block d
    String[] logicalOperatorsArray = new String[] {"==", "!=", "<", ">", "<=", ">="};
    String[] logicalOperatorsArray1 = new String[10];
    for (int i= 0, j = 0; i<logicalOperatorsArray.length; i++){
      if(finalInput.contains(logicalOperatorsArray[i])){
        logicalOperatorsArray1[j] = logicalOperatorsArray[i];
        j++;
      }
    }
    System.out.println();
    System.out.print("Logical Operators: ");
    for(int count = 0; count<logicalOperatorsArray1.length; count++){
      if(logicalOperatorsArray1[count]!= null)
        System.out.print(logicalOperatorsArray1[count]+ ",");
    }
    
    //    block e
    String[] numericalArray  = new String[] {"1", "2", "3", "4", "5", "6", "1.0", "2.0", "3.0", "4.0", "5.0", "6.0"};
    String[] numericalArray1 = new String[10];
    for (int i= 0, j = 0; i<numericalArray.length; i++){
      if(finalInput.contains(numericalArray[i])){
        numericalArray1[j] = numericalArray[i];
        j++;
      }
    }
    System.out.println();
    System.out.print("Numerical Values: ");
    for(int count = 0; count<numericalArray1.length; count++){
      if(numericalArray1[count]!= null)
        System.out.print(numericalArray1[count]+ ",");
    }
    
    
    //    block f
    String[] othersArray = new String[] {"(", ")", "{", "}", "[","]", ",", ":", ";"};
    String[] othersArray1 = new String[10];
    for (int i= 0, j = 0; i<othersArray.length; i++){
      if(finalInput.contains(othersArray[i])){
        othersArray1[j] = othersArray[i];
        j++;
      }
    }
    System.out.println();
    System.out.print("Others: ");
    for(int count = 0; count<othersArray1.length; count++){
      if(othersArray1[count]!= null)
        System.out.print(othersArray1[count]+ " ");
    }
    System.out.println();
  }
}