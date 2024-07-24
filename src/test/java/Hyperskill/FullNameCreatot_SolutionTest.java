package Hyperskill;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import uk.org.webcompere.systemstubs.SystemStubs;

import static org.assertj.core.api.Assertions.assertThat;

public class FullNameCreatot_SolutionTest {

    private final String testName_1 = "User One";
    private final String testName_2 = "User 2";
    private final String emptyTestFirst_Name = "  EmptyFirst";
    private final String emptyTestLast_Name = "EmptyLast  ";

    @Test
    void compareNameWithTwoLines() throws Exception {
        SystemStubs.withTextFromSystemIn(testName_1)
                .execute(() -> {
                    assertThat(FullNameCreator_Solution.getFullName())
                            .isEqualTo(testName_1);
                });
    }
}
