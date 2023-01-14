
package scindx;

import io.dropwizard.Configuration;
import javax.validation.constraints.NotEmpty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ScindxConfiguration extends Configuration {
    @NotEmpty
    private String foo = "foo";

    @JsonProperty
    public String getFoo() {
        return foo;
    }

    @JsonProperty
    public void setFoo(String newFoo) {
        foo = newFoo;
    }
}
