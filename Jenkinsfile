@Library('my-shared-library2')_

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
                    sample 
                }
            }
        }
    }
}
