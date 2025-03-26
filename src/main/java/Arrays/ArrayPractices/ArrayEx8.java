package Arrays.ArrayPractices;

public class ArrayEx8 {

    public static void main(String[]args){
        String[] states = { "IL", "MO","WI", "MI"};
        //print out only state that has letter 'o' in the name of it

        for(String state : states){
            if ( state.contains("O")){
                System.out.println("This state has letter 'o' >> " + state);
            }
        }
        String[][] cities = {
                {"Chicago","Rosemont","Des Plaines"} ,
                {"St Louis","Cuba"} ,
                {"Kenosha"} ,
                {"Detroit","ABCD", "xyz"}
        };

        // Let's print out the city names that starts with letter C.
        for(String[] stateCities : cities){
            for(String theCity : stateCities){
                if(theCity.startsWith("C")) {
                    System.out.println(theCity);
                }
            }
        }





    }



}
