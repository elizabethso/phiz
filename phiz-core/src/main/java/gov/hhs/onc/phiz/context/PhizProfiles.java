package gov.hhs.onc.phiz.context;

public final class PhizProfiles {
    public final static String PREFIX = "phiz.profile.";
    public final static String APP_PREFIX = PREFIX + "app.";
    public final static String CONTEXT_PREFIX = PREFIX + "context.";
    public final static String LOGGING_PREFIX = PREFIX + "logging.";
    public final static String MODE_PREFIX = PREFIX + "mode.";

    public final static String FILE_SUFFIX = "file";

    public final static String CONTEXT_WEB = CONTEXT_PREFIX + "web";

    public final static String LOGGING_LOGSTASH_FILE = LOGGING_PREFIX + "logstash." + FILE_SUFFIX;

    public final static String MODE_DEV = MODE_PREFIX + "dev";
    public final static String MODE_PROD = MODE_PREFIX + "prod";

    private PhizProfiles() {
    }
}
