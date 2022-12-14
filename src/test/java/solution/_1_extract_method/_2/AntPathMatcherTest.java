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

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit tests for {@link AntPathMatcher}.
 *
 * @author Alef Arendsen
 * @author Seth Ladd
 * @author Juergen Hoeller
 * @author Arjen Poutsma
 * @author Rossen Stoyanchev
 * @author Sam Brannen
 */
class AntPathMatcherTest {

	private final AntPathMatcher pathMatcher = new AntPathMatcher();

	@Test
	void isPattern() {
		assertThat(pathMatcher.isPattern("/test/*")).isTrue();
		assertThat(pathMatcher.isPattern("/test/**/name")).isTrue();
		assertThat(pathMatcher.isPattern("/test?")).isTrue();
		assertThat(pathMatcher.isPattern("/test/{name}")).isTrue();
		assertThat(pathMatcher.isPattern("/test/name")).isFalse();
		assertThat(pathMatcher.isPattern("/test/foo{bar")).isFalse();
	}
}

