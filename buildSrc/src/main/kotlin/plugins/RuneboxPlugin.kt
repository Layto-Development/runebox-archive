package plugins

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.jvm.tasks.Jar
import org.gradle.kotlin.dsl.named

open class RuneboxPlugin : Plugin<Project> {

    override fun apply(project: Project) {
        project.dependencies.add("compileOnly", Libs.pf4j)
        project.dependencies.add("implementation", project.project(":runebox-plugins"))
        project.dependencies.add("implementation", project.project(":runebox-logger"))
        project.dependencies.add("implementation", project.project(":runebox-common"))
        project.dependencies.add("implementation", project.project(":runebox-util"))
        project.dependencies.add("implementation", project.project(":runebox-client"))
        project.dependencies.add("implementation", project.project(":runebox-api"))
        project.dependencies.add("implementation", project.project(":runebox-eventbus"))

        val pluginExtensionExt = project.extensions.create<PluginExtension>("runeboxPlugin", PluginExtension::class.java)
        project.tasks.apply {
            named<Jar>("jar") {
                manifest {
                    pluginExtensionExt.name?.also { attributes["Plugin-Name"] = it }
                    pluginExtensionExt.description?.also { attributes["Plugin-Description"] = it }
                    pluginExtensionExt.id?.also { attributes["Plugin-Id"] = it }
                    pluginExtensionExt.pluginClass?.also { attributes["Plugin-Class"] = it }
                    pluginExtensionExt.version.also { attributes["Plugin-Version"] = it ?: project.version.toString() }
                }
            }
        }
    }

    open class PluginExtension {
        var id: String? = null
        var name: String? = null
        var description: String? = null
        var pluginClass: String? = null
        var version: String? = null
    }
}