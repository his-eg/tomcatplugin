/* The MIT License
 * (c) Copyright Eclipse Tomcat Plugin 2014-2016
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 * and associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or 
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING
 * BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package net.sf.eclipse.tomcat;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * Tests for StringUtil
 */
public class StringUtilTest {

	@Test
	public void testConcat() {
		assertThat(StringUtil.concat(new String[0], new String[0]), 
				equalTo(new String[0]));

		assertThat(StringUtil.concat(new String[] {"a", "b"}, 
				                     new String[] {"1", "2"}), 
				equalTo(new String[]{"a", "b", "1", "2"}));

		assertThat(StringUtil.concat(new String[] {"a", "a"}, 
						 new String[] {"a", "2"}), 
				equalTo(new String[]{"a", "a", "a", "2"}));
	}

	@Test
	public void testConcatUniq() {
		assertThat(StringUtil.concatUniq(new String[0], new String[0]), 
				equalTo(new String[0]));

		assertThat(StringUtil.concatUniq(new String[] {"a", "b"}, 
				                     new String[] {"1", "2"}), 
				equalTo(new String[]{"a", "b", "1", "2"}));

		assertThat(StringUtil.concatUniq(new String[] {"a", "a"}, 
						 new String[] {"a", "2"}), 
				equalTo(new String[]{"a", "2"}));
	}

	
}
