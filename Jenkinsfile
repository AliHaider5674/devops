@Library('my-shared-library')_

pipeline {

    agent {
        docker {
            image 'node'
            args '-u root'
        }
    }

    stages {
        stage('Build') {
            steps {
                script {
                    commonFunctions 'ali'
                }
            }
        }
    }
}
