package level1.split;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class StringSplitTest {

    @Test
    void 문자열_자르기()
    {
        String input = "1,2,3,4";

        String[] result = StringParser.split(input);

        assertThat(result).contains(String.valueOf(1));
    }

    @Test
    void 배열_더하기()
    {
        String[] input = {"1","2","3"};

    }
}
