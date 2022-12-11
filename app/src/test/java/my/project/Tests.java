package my.project;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Tests {

    @Test
    public void testApp() {
        String actual = App.hello();
        assertThat(actual).isEqualTo("Hello World");
    }

}
