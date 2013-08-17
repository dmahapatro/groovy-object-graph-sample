package com.example

class GraphBuilderTest extends GroovyTestCase{
    void testBuilder(){
        def companyBuilder = new CompanyObjectGraphBuilder()
        def result = companyBuilder.createCompanyObjectGraph()

        println result

        assert result != null
        assert result.employees.size() == 3
    }
}