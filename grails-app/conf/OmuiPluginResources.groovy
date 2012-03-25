modules = {
    'operamasks-ui-theme-default' {
        resource url: [plugin: 'omui', dir: 'js/operamasks-ui/css/default', file: "om-default.css"]
    }
    'operamasks-ui-js' {
        resource url: [plugin: 'omui', dir: 'js/operamasks-ui/js', file: "operamasks-ui.min.js"], nominify: true
    }
    'operamasks-ui' {
        dependsOn 'jquery,operamasks-ui-theme-default,operamasks-ui-js'
    }
}