package HackerRank;

<<<<<<< HEAD
public class OutputFormatting_SolutionTest {

}
=======
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class OutputFormatting_SolutionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeAll
    public void setUpStreams(){
        System.setOut(new PrintStream(OutputFormatting_Solution.stringFormatting()));
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
>>>>>>> 969bb1f87c00f207c6ec0daa00e3fa608d284f5a
