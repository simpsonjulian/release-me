package some.other.component;

import org.junit.Test;
import some.component.VersionReporter;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class VersionTest {
    @Test
    public void shouldDependOnLatestButNotM2() throws Exception {
        assertThat(new VersionReporter().getVersion(), is("1.2.3-M01_43"));
    }
}
