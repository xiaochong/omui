def configObject = new ConfigSlurper().parse(new File("../grails-app/conf/OmuiConfig.groovy").text)


def head = '''
package org.grails.plugins.omui

class OmuiTagLib extends BaseTagLib {

    static namespace = "om"
'''

print head

configObject.components.each {name, comp ->
    println """
    /**
     * @attr id
     *
${comp.attitudes.collect {"     * @attr ${it.key} "}.join("\n")}
     *
${comp.events.collect {"     * @attr ${it} "}.join("\n")}
     */
    def $name = { attrs, body ->
        doTag(attrs, body, "$name"${comp.containerTag?", \"${comp.containerTag}\"":''})
    }
    """
}

println "}"