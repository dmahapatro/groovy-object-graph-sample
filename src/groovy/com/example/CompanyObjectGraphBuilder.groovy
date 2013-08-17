package com.example

class CompanyObjectGraphBuilder {

    def createCompanyObjectGraph(){
        def builder = new ObjectGraphBuilder()
        // uncomment the following line if running this script with GroovyConsole
        //builder.classloader = getClass().classLoader
        builder.classNameResolver = "com.example"

        def acme = builder.company( name: 'ACME' ){
            3.times {
                employee( id: it.toString(), name: 'Drone ${it}' )
            }
            address(line1: 'Abc', line2: 'xyz', zip: 43230, state: 'OH')
        }

        acme
    }
}
