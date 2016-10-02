## See this app hosted at https://dropwizard-markdown-demo.herokuapp.com/docs/

This demo app was created by:

* Adding the bundle library as a dependency to a basic Dropwizard application
* Configuring as per the [README](https://github.com/rnorth/dropwizard-markdown-assets-bundle/blob/master/README.md)
* Adding a maven setting to include the project `docs` folder as a classpath resource:

```xml
    <build>
        <!-- Map the /docs directory in the project root to /docs on the classpath, as if it were
             src/main/resources/docs
             This allows docs assets to be served from the classpath, without a discrete copy phase
             being needed (which would impede IDE build-refresh cycle editing). -->
        <resources>
            <resource>
                <directory>./docs</directory>
                <targetPath>docs</targetPath>
            </resource>
        </resources>
        ...
```

### Licence

See [LICENSE](LICENSE)

### Copyright

(c) Richard North 2016