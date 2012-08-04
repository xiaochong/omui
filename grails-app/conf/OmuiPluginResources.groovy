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

    'operamasks-ui-lang-en-us' {
        resource url: [plugin: 'omui', dir: 'operamasks-ui/lang', file: "en-us.js"]
    }

    'operamasks-ui-lang-zh-tw' {
        resource url: [plugin: 'omui', dir: 'operamasks-ui/lang', file: "zh-tw.js"]
    }

    'operamasks-ui' {
        dependsOn 'operamasks-ui-jquery,operamasks-ui-js,operamasks-ui-lang-en-us,operamasks-ui-theme-apusic'
    }

    'operamasks-ui-zh-cn' {
        dependsOn 'operamasks-ui-jquery,operamasks-ui-js,operamasks-ui-theme-apusic'
    }

    'operamasks-ui-zh-tw' {
        dependsOn 'operamasks-ui-jquery,operamasks-ui-js,operamasks-ui-lang-zh-tw,operamasks-ui-theme-apusic'
    }

}