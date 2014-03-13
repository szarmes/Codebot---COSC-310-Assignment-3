
public class Punctuation {
        
        /*
         * The main purpose of this class is to format each response to correspond with the way we store words in 
         * our libraries. That way we can properly search through them
         */

        /*
         * This method spaces out all words and separates punctuations from them
         */
        public static String space(String response) {
        	if(response.length() > 0){
                if(response.charAt(0) != ' ')
                        response = " "+response;
                if(response.charAt(response.length()-1) != ' ')
                        response = response + " ";
                response = response.replace(",", " ,");
                response = response.replace("!", " !");
                response = response.replace(".", " .");
                response = response.replace("?", " ?");
                response = response.replace("'","");
        	}
            return response;
        }

}
