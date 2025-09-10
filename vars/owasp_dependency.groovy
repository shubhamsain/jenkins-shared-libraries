def call() {
    echo 'Running OWASP Dependency Check via Jenkins Plugin...'
    dependencyCheck additionalArguments: '--scan ./ --format XML --disableAssembly', odcInstallation: 'OWASP'
    dependencyCheck additionalArguments: '--scan ./ --format XML --disableYarnAudit', odcInstallation: 'OWASP'

    dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}
