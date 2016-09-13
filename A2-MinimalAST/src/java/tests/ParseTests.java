package tests;

import org.junit.Test;

@SuppressWarnings("javadoc")
public class ParseTests extends AbstractTestSuite {
	public ParseTests() {
		super("testfiles/ast");// where test input files are
	}

	@Test
	public void s1() {
		testValidSyntax("s1.lang");
	}

	@Test
	public void s2() {
		testValidSyntax("s2.lang");
	}
}
