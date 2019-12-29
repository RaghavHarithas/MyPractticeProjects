package JavaRegEx;


import java.util.regex.Pattern;

/*
    Java Reg ex Tutorial

    3 classes

    1) Pattern
    2) Matcher
    3) PatternSyntaxException

    1 Interface

    1) Pattern :
    methods:
      boolean compile : used to compile pattern
       boolean matches: used to get matcher, do the matches: matches the input with pattern
      matches(input, pattern)

      String pattern: returns the pattern
      String[] split(), input based on pattern
      matcher: et the matcher for pattern


      2) Matcher
      matches: boolean
      used to match input with pattern
      String group : used return the group matches
      String start: return forts matching pattern
      String end : rreun end matching the pattern
      int groupCount: get macthes group count
      find() find net match
      find(int index), find the matching the index



      boolen matches:

[abc] : match having a or b c
[a-zA-Z] having alpabests , upper case letters
[a-zA-Z0-9] having lower case, upper case or digits
[a-z[m-p]] javing aor b or c and  m throuh p, inetersection
[a-z&[def]]
[^abc] not containing a or b or c
[a-z&[^m-p]] a through z not containing m throuh p



digits
\d  : digits 0-9
. : any character
\D : not containing digits
\w : containing words
\W : not containing words
\s: containing whitespaces
\S : not containing whitespaces
\b: containing boundary
\B: not containing any boundary


X+ : matching one or more caharcters of x
x? : ocuurs once or not all
x*:  ocuurs zero or more times
x{n}: ocuurs n times
x{y,z}, ocuurs atleast y times, less than z times
x{n,} ocuurs n or more times


reg ex for email id

sher.raghav@gmail.com

[a-zA-A0-9&[.@]&\s]





 */
public class RegExPractice {



 public static  boolean isValidEmail(String input) {
     boolean isMatching = false;

     try {
         Pattern emailPattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
         //isMatching = pattern.matcher(input).matches();
         isMatching= Pattern.matches("^[a-z0-9+&_$.+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$", input);


     } catch (Exception e) {


     }

     return  isMatching;

 }

 public static boolean isValidPhoneNumber(String input){

     boolean ismatching = false;
     try{
         ismatching = Pattern.matches("[0-9]{10}",input);
     }catch(Exception e){

     }

     return ismatching;
 }


    public static boolean isValidPassowrd(String input){

        boolean ismatching = false;
        try{
            ismatching = Pattern.matches("((?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&*(?!~`+-_)]).{8,19}$)",input);
        }catch(Exception e){

        }

        return ismatching;
    }


    private void isValPassword(String input){
     System.out.println(" JavaRegExPratice class private method isValPassowrd called ");
        boolean ismatching = false;
        try{
            ismatching = Pattern.matches("((?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&*(?!~`+-_)]).{8,19}$)",input);
        }catch(Exception e){

        }

        System.out.println("Is password valid ? "+ismatching);
    }


 public  static void main(String args[]){

     System.out.println("Is valid matching email Id "+ isValidEmail("sher.raghav@gmail.com"));
     System.out.println("Is valid matching phone number "+ isValidPhoneNumber("1234567897"));
     System.out.println("Is valid matching password "+ isValidPassowrd("kamasutra1*K"));


 }
}
