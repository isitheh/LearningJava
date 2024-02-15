package org.example.example;

/*
 * @Author: Sithembiso Sithole
 */
public class LumpedCode {
    int mVariable;
    String sVariable;
    LumpedCode() {
        mVariable = 10;
        sVariable = "Test";

        //Variables s1, s2 and s3 are all declared but only s3 is initialized.
        String s1, s2, s3 = "myS3";

        //Variable i1 and i2 both declared and initialized
        int i1 = 10, i2 = 20;

        //Compile error below: Same line declaration requires the same data type.
        //int x, String y;

        //Compile error - Expects a semicolon
        //int c1, int c2;

        //Compile error - Unexpected semicolon, expects a comma
        //int c1; c2;

        //Valid identifiers -
        /*Identifiers can only start with a letter, underscore, dollar or (May contain digit but not at start*/
        int okidentifier;
        int $OkIdentifier;
        int _alsoOkIdentifier;
        int _SStillOkButNotGood$;

        //Compile errors - Invalid identifiers - Reasons given
        //int 3DPointClass;
        //int hollywoo@vine; @ is not letter, underscore, dollar or digit
        //int *$coffee; * is not letter, underscore, dollar or digit
        //int public; public is a reserved keyword
    }

    /*Possible uninitialized code*/
    public void findAnswer(boolean check) {
        int answer;
        int branch;

        if(check) {
            //Both answer and branch have been initialized.
            answer = 1;
            branch = 1;
        } else {
            //Only the answer variable has been initialized
            answer = 2;
        }
        System.out.println(answer);
        //System.out.println(branch);  //Does not compile as branch can possibly be uninitialized.
    }

    /*
    * Both cheesePiece and cheeseBite are local variable to method cheeseEater.
    * Both cheesePiece and cheeseBite can only be used inside method cheeseEater.
    */
    public void cheeseEater(int cheesePiece) {
        int cheeseBite = 1;
    }

    public void masterWhenTaught(boolean taught) {
        if(taught) {
            int masteredSubject = 1;
        }
        /*
         *  Line of code below will not compile because masteredSubject is used out of scope.
         *  The masteredSubject variable is local to the if statement and can only be used within the if block.
         */
        //System.out.println(masteredSubject);

        //Create a functional block
        {
            boolean wasStudentTaught = true;
            System.out.println(wasStudentTaught);
            System.out.println(taught);
        }

        /*
         *  Line of code below will not compile because wasStudentTaught is used out of scope.
         * The wasStudentTaught variable is local to the block and can only be used within the block.
         */
        //System.out.println(wasStudentTaught);
    }
}
