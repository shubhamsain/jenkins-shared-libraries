def call() {
    echo "Running OWASP Dependency Check..."

    // The actual OWASP check command
    sh '''#!/bin/bash
    dependency-check.sh \
        --project "Wanderlust" \
        --scan ./ \
        --format XML \
        --out . \
        --disableAssembly
    '''
    
    // Publish the report
    dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}
