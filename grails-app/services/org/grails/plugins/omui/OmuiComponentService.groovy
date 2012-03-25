package org.grails.plugins.omui

import grails.util.GrailsUtil

import java.util.concurrent.ConcurrentHashMap

class OmuiComponentService {
    static transactional = false
    static Map<String, Attitude> attitudeMap = new ConcurrentHashMap()
    static Map<String, Event> eventMap = new ConcurrentHashMap()

    static {
        GroovyClassLoader classLoader = new GroovyClassLoader(OmuiComponentService.classLoader)
        def config = new ConfigSlurper(GrailsUtil.environment).parse(classLoader.loadClass('OmuiConfig'))
        config.components.each {compName, compValue ->
            def comp = new Component(name: compName)
            compValue.attitudes.each {String attiName, String attiType ->
                def types = attiType.split(',').collect {return AttitudeType.valueOf(it)} as List<AttitudeType>
                def attitude = new Attitude(name: attiName, types: types, component: comp)
                attitudeMap.put("${comp.name}-${attitude.name}", attitude)
            }
            compValue.events.each {
                def event = new Event(name: it, component: comp)
                eventMap.put("${comp.name}-${event.name}", event)
            }
        }
    }

    Attitude getAttitude(String compName, String attiName) {
        return attitudeMap.get("$compName-$attiName")
    }

    Boolean hasAttitude(String compName, String attiName) {
        return attitudeMap.containsKey("$compName-$attiName")
    }

    Boolean hasEvent(String compName, String eventName) {
        return eventMap.containsKey("$compName-$eventName")
    }

    Event getEvent(String compName, String eventName) {
        return eventMap.get("$compName-$eventName")
    }
}
