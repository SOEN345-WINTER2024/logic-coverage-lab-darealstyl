import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CheckItTest {

    // Predicate Coverage
    @Test
    void testPredicateTrue() {
        assertTrue(CheckIt.checkIt(true, false, false)); // Predicate should be true
    }

    @Test
    void testPredicateFalse() {
        assertFalse(CheckIt.checkIt(false, false, false)); // Predicate should be false
    }

    // Clause Coverage
    @Test
    void testClauseA() {
        assertTrue(CheckIt.checkIt(true, false, false)); // a is true, predicate should be true
        assertFalse(CheckIt.checkIt(false, true, false)); // a is false, b is true, c is false, predicate should be false
    }

    @Test
    void testClauseB() {
        assertTrue(CheckIt.checkIt(false, true, true)); // b is true, predicate should be true
        assertFalse(CheckIt.checkIt(false, false, true)); // b is false, predicate should be false
    }

    @Test
    void testClauseC() {
        assertTrue(CheckIt.checkIt(false, true, true)); // c is true, predicate should be true
        assertFalse(CheckIt.checkIt(false, true, false)); // c is false, predicate should be false
    }

    // CACC
    @Test
    void testCACCForA() {
        assertTrue(CheckIt.checkIt(true, true, false)); // a is true, predicate should be true
        assertFalse(CheckIt.checkIt(false, false, false)); // a is false, predicate should be false
    }

    @Test
    void testCACCForB() {
        assertTrue(CheckIt.checkIt(false, true, true)); // b is true, a is false, c is true, predicate should be true
        assertFalse(CheckIt.checkIt(false, false, true)); // b is false, predicate should be false
    }

    @Test
    void testCACCForC() {
        assertTrue(CheckIt.checkIt(false, true, true)); // c is true, a is false, b is true, predicate should be true
        assertFalse(CheckIt.checkIt(false, true, false)); // c is false, predicate should be false
    }

    // RACC
    @Test
    void testRACCForB() {
        assertTrue(CheckIt.checkIt(false, true, true)); // b is true, c is true, a is false, predicate should be true
        assertFalse(CheckIt.checkIt(false, false, true)); // b is false, c is true, a is false, predicate should be false
    }

    @Test
    void testRACCForC() {
        assertTrue(CheckIt.checkIt(false, true, true)); // c is true, b is true, a is false, predicate should be true
        assertFalse(CheckIt.checkIt(false, true, false)); // c is false, b is true, a is false, predicate should be false
    }
}
