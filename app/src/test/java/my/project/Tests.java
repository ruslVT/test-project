package my.project;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    void testApp() {
        String actual = App.hello();
        assertThat(actual).isEqualTo("Hello World");
    }

}
