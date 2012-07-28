modules = {
    'operamasks-ui-theme-default' {
        resource url: [plugin: 'omui', dir: 'operamasks-ui/css/default', file: "om-default.css"]
    }

    'operamasks-ui-theme-apusic' {
        resource url: [plugin: 'omui', dir: 'operamasks-ui/css/apusic', file: "om-apusic.css"]
    }

    'operamasks-ui-jquery' {
        resource url: [plugin: 'omui', dir: 'operamasks-ui/js', file: "jquery.min.js"], nominify: true,
                disposition: 'head'
    }

    'operamasks-ui-js' {
        resource url: [plugin: 'omui', dir: 'operamasks-ui/js', file: "operamasks-ui.min.js"], nominify: true
    }

    'operamasks-ui' {
        dependsOn 'operamasks-ui-jquery,operamasks-ui-js,operamasks-ui-theme-apusic'
    }
}