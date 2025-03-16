package de.jonas.template;

import org.eclipse.aether.repository.RemoteRepository;

import io.papermc.paper.plugin.loader.PluginClasspathBuilder;
import io.papermc.paper.plugin.loader.PluginLoader;
import io.papermc.paper.plugin.loader.library.impl.MavenLibraryResolver;

public class PaperPluginLoader implements PluginLoader {

    @Override
    public void classloader(PluginClasspathBuilder classpathBuilder) {
        MavenLibraryResolver resolver = new MavenLibraryResolver();

        // MacenCentral Repository
        resolver.addRepository(
                new RemoteRepository.Builder(
                        "MavenCentralLoad",
                        "default",
                        "https://repo1.maven.org/maven2/")
                        .build());

        /****************************************
         * CommandAPI
         *
         * --- add backslash to uncomment ---
         * 
        resolver.addDependency(
                new Dependency(
                        new DefaultArtifact("dev.jorel:commandapi-bukkit-shade-mojang-mapped:9.6.0"),
                        null));
        /*
         ****************************************/

        /****************************************
         * Database
         *
         * --- add backslash here to uncomment ---
         * 
        resolver.addDependency(
                new Dependency(
                        new DefaultArtifact("com.zaxxer:HikariCP:5.1.0"),
                        null));
        resolver.addDependency(new Dependency(
                new DefaultArtifact("org.mariadb.jdbc:mariadb-java-client:3.3.2"),
                null, false, Arrays.asList(
                        new Exclusion("com.github.waffle",
                                "waffle-jna",
                                null, null))));
        /*
         ****************************************/

        classpathBuilder.addLibrary(resolver);
    }

}
