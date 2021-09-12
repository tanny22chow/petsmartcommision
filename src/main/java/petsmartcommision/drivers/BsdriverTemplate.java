package petsmartcommision.drivers;


import com.fasterxml.jackson.annotation.JsonProperty;

public class BsdriverTemplate {

    @JsonProperty(required = true)
    public String os;
    @JsonProperty(required = true)
    public String os_version;
    @JsonProperty(required = true)
    public String browser;
    @JsonProperty(required = true)
    public String browser_version;
    @JsonProperty(required = true)
    public String username;
    @JsonProperty(required = true)
    public String access_key;

}
