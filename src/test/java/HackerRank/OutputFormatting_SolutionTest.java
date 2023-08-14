package HackerRank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class OutputFormatting_SolutionTest {
    private final String testString1 = "cpp 065";
    private final String testString2 = "java 100";
    private final String testString3 = "python 89";

    @BeforeAll
    public void setUpStreams(){

    }

    @Test
    void stringFormatting() {
    }

    @Test
    void outputReader() {
        Assertions.assertEquals(OutputFormatting_Solution.outputReader(), "java 100");
        Assertions.assertEquals(OutputFormatting_Solution.outputReader(), "cpp 65");
        Assertions.assertEquals(OutputFormatting_Solution.outputReader(), "python 50");
        Assertions.assertEquals(OutputFormatting_Solution.outputReader(), "ruby 120");
        Assertions.assertEquals(OutputFormatting_Solution.outputReader(), "fortran 1500");
    }
}
