package org.grails.plugins.omui

import grails.test.mixin.TestFor

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(OmuiComponentService)
class OmuiComponentServiceTests {

    void testService() {
        def service = new OmuiComponentService()
        assertTrue(service.hasAttitude('tabs', 'active'))
        assertFalse(service.hasAttitude('tabs', 'onActivate'))
        assertTrue(service.hasEvent('tabs', 'onActivate'))
        def attitude = service.getAttitude('tabs', 'active')
        def event = service.getEvent('tabs', 'onActivate')
        assertEquals('active', attitude.name)
        assertEquals('tabs', attitude.component.name)
        assertTrue(attitude.types.contains(AttitudeType.Number))
        assertTrue(attitude.types.contains(AttitudeType.String))
        assertFalse(attitude.types.contains(AttitudeType.Boolean))
        assertEquals('onActivate', event.name)
        assertEquals('tabs', attitude.component.name)
        assertNull(service.getAttitude('tabs', 'onActivate'))
        assertNull(service.getEvent('tabs', 'active'))
    }
}