package CodeWars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertToCamelCase_SolutionTest {

    @Test
    void toCamelCaseTest() {
        org.assertj.core.api.Assertions.assertThat(ConvertToCamelCase_Solution.toCamelCase("the_Stealth_Warrior")).isEqualTo("theStealthWarrior");
        org.assertj.core.api.Assertions.assertThat(ConvertToCamelCase_Solution.toCamelCase("the-Stealth-Warrior")).isEqualTo("theStealthWarrior");
        org.assertj.core.api.Assertions.assertThat(ConvertToCamelCase_Solution.toCamelCase("You_have_chosen_to_translate_this_kata_For_your_convenience_we_have_provided_the_existing_test_cases_used_for_the_language" +
                "_that_you_have_already_completed_as_well_as_all_of_the_other_related_fields")).isEqualTo("<YouHaveChosenToTranslateThisKataForYourConvenienceWeHaveProvidedTheExistingTestCasesUsedFor" +
                "TheLanguageThatYouHaveAlreadyCompletedAsWellAsAllOfTheOtherRelatedFields>");

    }
}