package CodeWars;

public class ConvertToCamelCase_Solution {
    public static void main(String[] args) {
        //System.out.println(toCamelCase("the_Stealth_Warrior"));
        System.out.println(toCamelCase("\"You_have_chosen_to_translate_this_kata_For_your_convenience_we_have_provided_the_existing_test_cases_used_for_the_language\" +\n" +
                "                \"_that_you_have_already_completed_as_well_as_all_of_the_other_related_fields\""));
    }
    static String toCamelCase(String s){
        char[] stringLikeArray = s.toCharArray();
        for (int i = 0; i < stringLikeArray.length; i++) {
            if (stringLikeArray[i] == '_'| stringLikeArray[i] == '-') {
                if (i + 1 < stringLikeArray.length) {
                    char upperChar  = stringLikeArray[i + 1];
                    stringLikeArray[i + 1] = Character.toUpperCase(upperChar);
                }
            }
        }
        return new String(stringLikeArray).replaceAll("[^\\p{L}\\p{Nd}]+", "");
    }
}
