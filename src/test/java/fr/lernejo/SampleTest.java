package fr.lernejo;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
class SampleTest {
    @Test
    void mult_behaves_as_expected() {
        int result= new Sample().op(Sample.Operation.MULT, 5, 3);
        Assertions.assertThat(result).isEqualTo(15);
    }
    @Test
    void add_behaves_as_expected() {
        int result= new Sample().op(Sample.Operation.ADD, 7, 4);
        Assertions.assertThat(result).isEqualTo(11);
    }

}
