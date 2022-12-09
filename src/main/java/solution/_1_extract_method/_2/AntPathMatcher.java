/*
 * Copyright 2002-2022 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package solution._1_extract_method._2;

import java.nio.file.PathMatcher;
import java.util.Arrays;

/**
 * {@link PathMatcher} implementation for Ant-style path patterns.
 *
 * <p>Part of this mapping code has been kindly borrowed from <a href="https://ant.apache.org">Apache Ant</a>.
 *
 * <p>The mapping matches URLs using the following rules:<br>
 * <ul>
 * <li>{@code ?} matches one character</li>
 * <li>{@code *} matches zero or more characters</li>
 * <li>{@code **} matches zero or more <em>directories</em> in a path</li>
 * <li>{@code {spring:[a-z]+}} matches the regexp {@code [a-z]+} as a path variable named "spring"</li>
 * </ul>
 *
 * <h3>Examples</h3>
 * <ul>
 * <li>{@code com/t?st.jsp} &mdash; matches {@code com/test.jsp} but also
 * {@code com/tast.jsp} or {@code com/txst.jsp}</li>
 * <li>{@code com/*.jsp} &mdash; matches all {@code .jsp} files in the
 * {@code com} directory</li>
 * <li><code>com/&#42;&#42;/test.jsp</code> &mdash; matches all {@code test.jsp}
 * files underneath the {@code com} path</li>
 * <li><code>org/springframework/&#42;&#42;/*.jsp</code> &mdash; matches all
 * {@code .jsp} files underneath the {@code org/springframework} path</li>
 * <li><code>org/&#42;&#42;/servlet/bla.jsp</code> &mdash; matches
 * {@code org/springframework/servlet/bla.jsp} but also
 * {@code org/springframework/testing/servlet/bla.jsp} and {@code org/servlet/bla.jsp}</li>
 * <li>{@code com/{filename:\\w+}.jsp} will match {@code com/test.jsp} and assign the value {@code test}
 * to the {@code filename} variable</li>
 * </ul>
 *
 * <p><strong>Note:</strong> a pattern and a path must both be absolute or must
 * both be relative in order for the two to match. Therefore, it is recommended
 * that users of this implementation to sanitize patterns in order to prefix
 * them with "/" as it makes sense in the context in which they're used.
 *
 * @author Alef Arendsen
 * @author Juergen Hoeller
 * @author Rob Harrop
 * @author Arjen Poutsma
 * @author Rossen Stoyanchev
 * @author Sam Brannen
 * @author Vladislav Kisel
 * @since 16.07.2003
 */
public class AntPathMatcher {

	//TODO: 아래의 isPattern을 Extract Method를 이용하여 메소드의 길이를 줄여보세요.
	public boolean isPattern(String path) {
		boolean bracketOpened = false;
		for (Character character : path.toCharArray()) {
			bracketOpened = isBracketOpen(character, bracketOpened);
			if (containsAsteriskOrQuestionMark(character) || isBracketClosed(character, bracketOpened)) {
				return true;
			}
		}
		return false;
	}

	private boolean isBracketOpen(char character, boolean isBracketOpen) {
		if (character == '{') {
			return true;
		}
		return isBracketOpen;
	}

	private boolean isBracketClosed(char character, boolean isCurlyBracketOpen) {
		if (character == '}' && isCurlyBracketOpen) {
			return true;
		}
		return false;
	}

	private boolean containsAsteriskOrQuestionMark(char character) {
		if (Arrays.asList('*', '?').contains(character)) {
			return true;
		}
		return false;
	}
}
