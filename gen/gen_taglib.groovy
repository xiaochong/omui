def configObject = new ConfigSlurper().parse(new File("../grails-app/conf/OmuiConfig.groovy").text)

def out = new StringBuilder()

def head = '''
package org.grails.plugins.omui

class OmuiTagLib extends BaseTagLib {

    static namespace = "om"
'''

out << head

configObject.components.each {name, comp ->
    if (comp.noGen) return
    def body = comp.custom ?: """doTag(attrs, body, "$name"${comp.containerTag ? ", \"${comp.containerTag}\"" : ', "div"'})"""
    def events = comp.events ? comp.events.collect {"     * @attr ${it} "}.join("\n") : ''
    out << """
    /**
     * @attr id
     *
${comp.attitudes.collect {"     * @attr ${it.key} "}.join("\n")}
${events ?: '     *'}
     */
    def $name = { attrs, body ->
        $body
    }
    """
}

out << "}"

def writer = new File("../grails-app/taglib/org/grails/plugins/omui/OmuiTagLib.groovy").newPrintWriter()
writer << out.toString()
writer.flush()
writer.close()