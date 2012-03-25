package org.grails.plugins.omui

import grails.test.mixin.TestFor

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(OmuiComponentService)
class OmuiComponentServiceTests {

    void testService() {
        def service = new OmuiComponentService()
        assertTrue(service.hasAttitude('button', 'active'))
        assertFalse(service.hasAttitude('button', 'onActivate'))
        assertTrue(service.hasEvent('button', 'onActivate'))
        def attitude = service.getAttitude('button', 'active')
        def event = service.getEvent('button', 'onActivate')
        assertEquals('active', attitude.name)
        assertEquals('button', attitude.component.name)
        assertTrue(attitude.types.contains(AttitudeType.Number))
        assertTrue(attitude.types.contains(AttitudeType.String))
        assertFalse(attitude.types.contains(AttitudeType.Boolean))
        assertEquals('onActivate', event.name)
        assertEquals('button', attitude.component.name)
        assertNull(service.getAttitude('button', 'onActivate'))
        assertNull(service.getEvent('button', 'active'))
    }
}