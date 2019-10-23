package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
String result = "";
        // create a `counter`
        // while `counter` is less than length of array
        // begin loop
        int i = 0;
        while (i <= personArray.length-1) {
           result += personArray[i].toString();
           i++;

        }

return result;

}
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable

            // end loop



    public String forLoop() {
        String result ="";
        // identify initial value
        // identify terminal condition
        // identify increment
int i = 0;
for( i = 0 ; i <= personArray.length-1 ; i++) {
    // use the above clauses to declare for-loop signature
    // begin loop
    result += personArray[i].toString();
    // use `counter` to identify the `current Person` in the array
    // get `string Representation` of `currentPerson`
    // append `stringRepresentation` to `result` variable
    // end loop
}
        return result;
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
        for (Person p1 :personArray) {
            // begin loop
            // get `string Representation` of `currentPerson`
            result += p1.toString();
            // append `stringRepresentation` to `result` variable
            // end loop
        }
        return result;
    }

    private String personArray() {
        return null;
    }

    public Person[] getPersonArray() {
        return null;
    }
}
