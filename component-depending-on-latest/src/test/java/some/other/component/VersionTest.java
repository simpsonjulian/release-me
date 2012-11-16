package some.other.component;

import org.junit.Test;
import some.component.VersionReporter;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class VersionTest {
    @Test
    public void shouldDependOnLatest() throws Exception {
        assertThat(new VersionReporter().getVersion(), is("1.2.4-M01_117"));
    }
}
