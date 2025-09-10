stage('OWASP: Dependency check') {
    steps {
        script {
            dependencyCheck additionalArguments: '', 
                            outdir: 'dependency-check-report', 
                            scanpath: '.', 
                            datadir: ''
        }
    }
}
