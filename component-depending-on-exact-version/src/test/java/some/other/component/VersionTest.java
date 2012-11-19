package some.other.component;

import org.junit.Test;
import some.component.VersionReporter;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class VersionTest {
    @Test
    public void shouldDependOnSpecificVersion() throws Exception {

        assertThat(new VersionReporter().getVersion(), is("99.9"));
    }
}
