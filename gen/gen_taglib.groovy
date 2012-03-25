def configObject = new ConfigSlurper().parse(new File("../grails-app/conf/OmuiConfig.groovy").text)

def out = new StringBuilder()

def head = '''
package org.grails.plugins.omui

class OmuiTagLib extends BaseTagLib {

    static namespace = "om"
'''

out << head

configObject.components.each {name, comp ->
    out << """
    /**
     * @attr id
     *
${comp.attitudes.collect {"     * @attr ${it.key} "}.join("\n")}
     *
${comp.events.collect {"     * @attr ${it} "}.join("\n")}
     */
    def $name = { attrs, body ->
        doTag(attrs, body, "$name"${comp.containerTag ? ", \"${comp.containerTag}\"" : ''})
    }
    """
}

out << "}"

def writer = new File("../grails-app/taglib/org/grails/plugins/omui/OmuiTagLib.groovy").newPrintWriter()
writer << out.toString()
writer.flush()
writer.close()