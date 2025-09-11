def call() {
    echo 'Running OWASP Dependency Check via Jenkins Plugin...'

    dependencyCheck additionalArguments: '--scan ./ --format XML --disableAssembly --disableYarnAudit', odcInstallation: 'OWASP'

    dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}
