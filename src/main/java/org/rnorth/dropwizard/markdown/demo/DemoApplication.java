package org.rnorth.dropwizard.markdown.demo;

import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.rnorth.dropwizard.markdown.MarkdownAssetsBundle;
import org.rnorth.dropwizard.markdown.MarkdownAssetsConfiguration;
import org.rnorth.dropwizard.markdown.MarkdownBundleConfiguration;

/**
 * Created by rnorth on 29/09/2016.
 */
public class DemoApplication extends Application<DemoApplication.DemoConfiguration> {

    @Override
    public void initialize(Bootstrap<DemoConfiguration> bootstrap) {
        bootstrap.addBundle(new MarkdownAssetsBundle()
                .withResourcePath("/docs")
                .withUriPath("/docs"));
    }

    @Override
    public void run(DemoConfiguration configuration, Environment environment) throws Exception {
        // Nothing needed here for demo purposes
    }

    public static void main(String[] args) throws Exception {
        new DemoApplication().run(args);
    }

    public static class DemoConfiguration extends Configuration implements MarkdownBundleConfiguration {

        public MarkdownAssetsConfiguration assets = new MarkdownAssetsConfiguration();

        @Override
        public MarkdownAssetsConfiguration getMarkdownAssetsConfiguration() {
            return assets;
        }
    }
}



